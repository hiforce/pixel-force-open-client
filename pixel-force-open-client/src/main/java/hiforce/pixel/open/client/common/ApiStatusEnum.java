package hiforce.pixel.open.client.common;

import lombok.Getter;

public enum ApiStatusEnum {
    UNKNOWN("unknown","未知"),
    PENDING("pending","待执行"),
    RUNNING("running","运行中"),
    SUCCESS("success","调用成功"),
    FAIL("fail","调用失败");
    @Getter
    private final String code;
    @Getter
    private final String desc;

    ApiStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ApiStatusEnum getStatusByCode(String code) {
        for (ApiStatusEnum status : ApiStatusEnum.values()) {
            if (code.equals(status.getCode())) {
                return status;
            }
        }
        return UNKNOWN;
    }
}
