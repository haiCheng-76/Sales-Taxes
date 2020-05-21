package website.lhc.commoserver.exceptions;


/**
 * 约束不匹配异常
 */
public class ConstraintNotMatchException extends ServerException {
    private static final long serialVersionUID = 1L;

    public ConstraintNotMatchException() {
        super();
    }

    public ConstraintNotMatchException(String message) {
        super(message);
    }
}
