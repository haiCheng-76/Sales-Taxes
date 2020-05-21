package website.lhc.commoserver.base;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;


/**
 * 返回基础类
 */
public class Resp extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    private static final String CODE = "code";
    private static final String MSG = "message";
    private static final String DATA = "data";

    public Resp() {
        put(CODE, HttpStatus.OK.value());
        put(MSG, "success");
    }

    public static Resp ok() {
        return new Resp();
    }

    public static Resp ok(String message) {
        Resp resp = new Resp();
        resp.put(MSG, message);
        return resp;
    }

    public static Resp ok(Map<String, Object> data) {
        Resp resp = new Resp();
        resp.putAll(data);
        return resp;
    }

    public static Resp ok(Object o) {
        Resp resp = new Resp();
        resp.put(DATA, o);
        return resp;
    }

    public static Resp error(int code, String message) {
        Resp resp = new Resp();
        resp.put(CODE, code);
        resp.put(MSG, message);
        return resp;
    }

    public static Resp error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "error");
    }

    public static Resp error(String message) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    @Override
    public Object put(String key, Object value) {
        return super.put(key, value);
    }
}
