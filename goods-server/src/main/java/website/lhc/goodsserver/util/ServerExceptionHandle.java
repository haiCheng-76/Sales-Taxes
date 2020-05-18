package website.lhc.goodsserver.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import website.lhc.commoserver.base.Resp;
import website.lhc.commoserver.exceptions.ConstraintNotMatchException;
import website.lhc.commoserver.exceptions.ServerException;

/**
 * @ProjectName: coding
 * @Package: website.lhc.goodsserver.util
 * @ClassName: ServerExceptionHandle
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/17 下午 01:02
 */
@RestControllerAdvice
public class ServerExceptionHandle {

    private static final Logger log = LoggerFactory.getLogger(ServerExceptionHandle.class);

    @ExceptionHandler(value = {ServerException.class})
    public Resp exceptionHandler(ServerException e) {
        log.warn("exception:{}", e.getMessage());
        e.printStackTrace();
        return Resp.error("系统错误");
    }

    @ExceptionHandler(value = {ConstraintNotMatchException.class})
    public Resp handleConstraintNotMatchException(ConstraintNotMatchException e) {
        return Resp.error(e.getMessage());
    }
}
