package website.lhc.commoserver.exceptions;

/**
 * @ProjectName: coding
 * @Package: website.lhc.commoserver.exceptions
 * @ClassName: ParamException
 * @Author: lhc
 * @Description: 参数异常
 * @Date: 2020/5/21 上午 12:25
 */
public class ParamException extends ServerException {
    private static final long serialVersionUID = 1L;

    public ParamException() {
        super();
    }

    public ParamException(String message) {
        super(message);
    }
}
