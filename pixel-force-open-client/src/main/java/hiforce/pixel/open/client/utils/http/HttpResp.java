package hiforce.pixel.open.client.utils.http;


import lombok.Getter;
import lombok.Setter;
import org.apache.http.HttpStatus;

/**
 * @author shuquan
 * @since 16/4/16
 */
public class HttpResp {


    @Getter
    @Setter
    private int status;

    @Getter
    @Setter
    private String responseHtml;

    @Getter
    @Setter
    private boolean redirect;

    @Getter
    @Setter
    private boolean success;

    @Getter
    @Setter
    private Exception exception;

    public static HttpResp fail(Exception ex) {
        HttpResp response = new HttpResp();
        response.success = false;
        response.exception = ex;
        return response;
    }


    public static HttpResp success(int status, String responseHtml) {
        HttpResp response = new HttpResp();
        response.status = status;
        response.responseHtml = responseHtml;
        response.success = true;

        if (status == HttpStatus.SC_MOVED_TEMPORARILY
                || status == HttpStatus.SC_MOVED_PERMANENTLY
                || status == HttpStatus.SC_TEMPORARY_REDIRECT
                || status == HttpStatus.SC_SEE_OTHER) {
            response.redirect = true;

        }
        return response;
    }
}
