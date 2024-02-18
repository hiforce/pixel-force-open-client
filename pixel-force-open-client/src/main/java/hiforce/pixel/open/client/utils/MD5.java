package hiforce.pixel.open.client.utils;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MD5 {
    private static final Logger log = LoggerFactory.getLogger(MD5.class);
    private static final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final Map<Character, Integer> rDigits = new HashMap(16);
    private static MD5 me;
    private MessageDigest mHasher;

    private MD5() {
        try {
            this.mHasher = MessageDigest.getInstance("md5");
        } catch (Exception var2) {
            throw new RuntimeException(var2);
        }
    }

    public static MD5 getInstance() {
        return me;
    }

    public String getMD5String(String content) {
        return this.bytes2string(this.hash(content));
    }

    public String getMD5String(byte[] content) {
        return this.bytes2string(this.hash(content));
    }

    public byte[] getMD5Bytes(byte[] content) {
        return this.hash(content);
    }

    public byte[] hash(String str) {
        try {
            byte[] bt = this.mHasher.digest(str.getBytes("GBK"));
            if (null != bt && bt.length == 16) {
                return bt;
            } else {
                throw new IllegalArgumentException("md5 need");
            }
        } catch (UnsupportedEncodingException var3) {
            throw new RuntimeException("unsupported utf-8 encoding", var3);
        }
    }

    public byte[] hash(byte[] data) {
        byte[] bt = this.mHasher.digest(data);
        if (null != bt && bt.length == 16) {
            return bt;
        } else {
            throw new IllegalArgumentException("md5 need");
        }
    }

    public String bytes2string(byte[] bt) {
        int l = bt.length;
        char[] out = new char[l << 1];
        int i = 0;

        for(int j = 0; i < l; ++i) {
            out[j++] = digits[(240 & bt[i]) >>> 4];
            out[j++] = digits[15 & bt[i]];
        }

        if (log.isDebugEnabled()) {
            log.debug("[hash]" + new String(out));
        }

        return new String(out);
    }

    static {
        for(int i = 0; i < digits.length; ++i) {
            rDigits.put(digits[i], i);
        }

        me = new MD5();
    }
}