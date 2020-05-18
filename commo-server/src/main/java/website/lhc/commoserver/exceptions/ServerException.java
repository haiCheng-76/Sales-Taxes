package website.lhc.commoserver.exceptions;

/**
 * @ProjectName: coding
 * @Package: website.lhc.commoserver.exceptions
 * @ClassName: ServerException
 * @Author: lhc
 * @Description: 系统异常总类
 * @Date: 2020/5/17 上午 10:51
 */
public class ServerException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ServerException() {
        super();
    }

    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException(Throwable cause) {
        super(cause);
    }
}
