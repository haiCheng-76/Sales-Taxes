package website.lhc.commoserver.exceptions;

/**
 * @ProjectName: coding
 * @Package: website.lhc.commoserver.exceptions
 * @ClassName: CalculateServerException
 * @Author: lhc
 * @Description: CalculateServerException
 * @Date: 2020/5/21 上午 12:30
 */
public class CalculateServerException extends ServerException {
    private static final long serialVersionUID = 1L;

    public CalculateServerException() {
        super();
    }

    public CalculateServerException(String message) {
        super(message);
    }
}
