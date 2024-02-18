package hiforce.pixel.open.client.utils.http;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author zhenxin.yzx ( Rocky )
 * @since 2017/8/29
 */
@Slf4j
public class HttpUtils {

    private static final String CONTENT_TYPE_TEXT_JSON = "text/json";

    private static final Registry<ConnectionSocketFactory> REGISTRY = RegistryBuilder.<ConnectionSocketFactory>create()
            .register("http", PlainConnectionSocketFactory.getSocketFactory())
            .register("https", SSLConnectionSocketFactory.getSocketFactory())
            .build();

    private static final PoolingHttpClientConnectionManager POOLING_HTTP_CLIENT_CONNECTION_MANAGER =
            new PoolingHttpClientConnectionManager(REGISTRY, null,
                    null, null, 3, TimeUnit.SECONDS);

    static {
        POOLING_HTTP_CLIENT_CONNECTION_MANAGER.setMaxTotal(250);
        POOLING_HTTP_CLIENT_CONNECTION_MANAGER.setDefaultMaxPerRoute(200);
    }

    private static final RequestConfig REQUEST_CONFIG = RequestConfig.custom()
            .setConnectionRequestTimeout(1000)
            .setConnectTimeout(1000)
            .setSocketTimeout(600000).build();

    public String doPostDataWithFiles(
            String url, Map<String, String> textBody, List<FileBody> files) throws IOException {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

        if (CollectionUtils.isNotEmpty(files)) {
            files.forEach(p -> builder.addPart("file", p));
        }
        for (String key : textBody.keySet()) {
            builder.addTextBody(key, textBody.get(key));
        }
        HttpPost post = new HttpPost(url);
//        post.setHeader("Content-Type", "multipart/form-data");
        post.setEntity(builder.build());
        HttpResponse resp = getHttpClient().execute(post);
        return EntityUtils.toString(resp.getEntity());
    }

    public String doJsonDataPost(String requestUrl, String jsonData) throws Exception {
        HttpPost httpPost = new HttpPost(requestUrl);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
        StringEntity se = new StringEntity(jsonData);
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        httpPost.setEntity(se);
        CloseableHttpResponse response = null;

        try {
            response = getHttpClient().execute(httpPost);
            HttpEntity entity2 = null;
            entity2 = response.getEntity();
            return EntityUtils.toString(entity2, "UTF-8");
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static CloseableHttpClient getHttpClient() {
        return HttpClients.custom()
                .setConnectionManager(POOLING_HTTP_CLIENT_CONNECTION_MANAGER)
                .setDefaultCookieStore(new BasicCookieStore())
                .setDefaultRequestConfig(REQUEST_CONFIG).build();
    }

    public String doGet(String url) throws Exception {
        HttpGet get = new HttpGet(url);
        HttpResponse response = getHttpClient().execute(get);
        return EntityUtils.toString(response.getEntity());
    }


    public HttpResp doPost(String requestUrl, List<NameValuePair> parameters) {
        return doPost(requestUrl, null, null, parameters);
    }

    public HttpResp doPost(String requestUrl, String encode, List<NameValuePair> parameters) {
        return doPost(requestUrl, encode, null, parameters);
    }

    public HttpResp doPost(String requestUrl, String encode, String contentType, List<NameValuePair> parameters) {
        HttpPost httpPost = new HttpPost(requestUrl);
        List<NameValuePair> nameValuePairs = new ArrayList<>(parameters);
        HttpResp forwardResponse = null;
        CloseableHttpResponse response = null;
        try {
            encode = null == encode ? "UTF-8" : encode;
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(nameValuePairs, encode);
            if (StringUtils.isNotEmpty(contentType)) {
                urlEncodedFormEntity.setContentType(contentType);
            }
            httpPost.setEntity(urlEncodedFormEntity);
            HttpClientContext localContext = new HttpClientContext();
            response = getHttpClient().execute(httpPost, localContext);
            forwardResponse = convert(response, encode);

        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return HttpResp.fail(e);
        } finally {
            httpPost.releaseConnection();
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                }
            }
        }
        return forwardResponse;
    }

    private HttpResp convert(HttpResponse response, String encode) {
        try {
            int status = response.getStatusLine().getStatusCode();
            String resultHtml =
                    StringUtils.isEmpty(encode) ? EntityUtils.toString(response.getEntity())
                            : EntityUtils.toString(response.getEntity(), encode);
            return HttpResp.success(status, resultHtml);
        } catch (IOException e) {
            log.error("convert error", e);
            return HttpResp.fail(e);
        }
    }
}
