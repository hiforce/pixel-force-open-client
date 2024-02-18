package hiforce.pixel.open.client.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = -7190357588428136665L;
    @Setter
    @Getter
    protected String message;
    @Getter
    @Setter
    protected T result;
    @Getter
    @Setter
    protected int status;
    @Getter
    @Setter
    private Long timestamp;
    @Getter
    @Setter
    private String traceId;

    public boolean getSuccess() {
        return status == 200;
    }

    public static <T> ApiResult<T> error(String message) {
        return error(500, message);
    }

    public static <T> ApiResult<T> error(int status, String message) {
        ApiResult<T> msg = new ApiResult<T>();
        msg.message = message;
        msg.status(status);
        return msg.putTimeStamp();
    }

    public static <T> ApiResult<T> ok() {
        return ok(null);
    }

    private ApiResult<T> putTimeStamp() {
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    public static <T> ApiResult<T> ok(T result) {
        int SUCCESS = 200;
        return new ApiResult<T>()
            .result(result)
            .putTimeStamp()
            .status(SUCCESS);
    }

    public ApiResult<T> result(T result) {
        this.result = result;
        return this;
    }

    public static <T> ApiResult<T> result(int status, String message, T result) {
        ApiResult<T> respMessage =  new ApiResult<T>()
            .result(result)
            .putTimeStamp()
            .status(status);
        respMessage.message = message;
        return respMessage;
    }

    public ApiResult<T> status(int status) {
        this.status = status;
        return this;
    }
}
