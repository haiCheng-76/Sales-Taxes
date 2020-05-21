package website.lhc.commoserver.exceptions;

/**
 * @ProjectName: coding
 * @Package: website.lhc.commoserver.exceptions
 * @ClassName: GoodsServerException
 * @Author: lhc
 * @Description: GoodsServerException
 * @Date: 2020/5/21 上午 12:31
 */
public class GoodsServerException extends ServerException {
    private static final long serialVersionUID = 1L;

    public GoodsServerException() {
        super();
    }

    public GoodsServerException(String message) {
        super(message);
    }
}
