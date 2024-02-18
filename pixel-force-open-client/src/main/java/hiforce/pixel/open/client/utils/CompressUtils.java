package hiforce.pixel.open.client.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author Rocky Yu
 * @since 2021/8/5
 */
public class CompressUtils {

    public static String compress(String orgParam) {
        if (StringUtils.isBlank(orgParam)) {
            return null;
        } else {
            GZIPOutputStream gzipOutputStream = null;
            ByteArrayOutputStream outputStream = null;
            boolean var8 = false;

            label107: {
                try {
                    var8 = true;
                    byte[] _gzipResult = orgParam.getBytes("UTF-8");
                    outputStream = new ByteArrayOutputStream();
                    (gzipOutputStream = new GZIPOutputStream(outputStream)).write(_gzipResult);
                    gzipOutputStream.finish();
                    _gzipResult = outputStream.toByteArray();
                    orgParam = new String(Base64.getEncoder().encode(_gzipResult));
                    var8 = false;
                    break label107;
                } catch (Exception var12) {
                    var12.printStackTrace();
                    var8 = false;
                } finally {
                    if (var8) {
                        try {
                            if (outputStream != null) {
                                outputStream.close();
                            }

                            if (gzipOutputStream != null) {
                                gzipOutputStream.close();
                            }
                        } catch (Exception var9) {
                        }

                    }
                }

                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }

                    if (gzipOutputStream != null) {
                        gzipOutputStream.close();
                    }
                } catch (Exception var10) {
                }

                return null;
            }

            try {
                outputStream.close();
                gzipOutputStream.close();
            } catch (Exception var11) {
            }

            return orgParam;
        }
    }

    public static String decompress(String orgParams) {
        if (StringUtils.isBlank(orgParams)) {
            return orgParams;
        } else {
            GZIPInputStream gzipInputStream = null;
            ByteArrayOutputStream byteOut = null;
            String result = null;
            boolean var10 = false;

            label127: {
                try {
                    var10 = true;
                    byte[] _resultBytes = Base64.getDecoder().decode(orgParams);
                    gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(_resultBytes));
                    byteOut = new ByteArrayOutputStream();
                    _resultBytes = new byte[256];

                    int n;
                    while((n = gzipInputStream.read(_resultBytes)) >= 0) {
                        byteOut.write(_resultBytes, 0, n);
                    }

                    byteOut.flush();
                    _resultBytes = byteOut.toByteArray();
                    result = new String(_resultBytes, "UTF-8");
                    var10 = false;
                    break label127;
                } catch (Exception var14) {
                    var14.printStackTrace();
                    var10 = false;
                } finally {
                    if (var10) {
                        try {
                            if (gzipInputStream != null) {
                                gzipInputStream.close();
                            }

                            if (byteOut != null) {
                                byteOut.close();
                            }
                        } catch (Exception var11) {
                            var11.printStackTrace();
                        }

                    }
                }

                try {
                    if (gzipInputStream != null) {
                        gzipInputStream.close();
                    }

                    if (byteOut != null) {
                        byteOut.close();
                        return result;
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                }

                return result;
            }

            try {
                gzipInputStream.close();
                byteOut.close();
            } catch (Exception var13) {
                var13.printStackTrace();
            }

            return result;
        }
    }
}
