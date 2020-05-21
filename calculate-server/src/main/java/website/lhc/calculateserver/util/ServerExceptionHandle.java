package website.lhc.calculateserver.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import website.lhc.commoserver.base.Resp;
import website.lhc.commoserver.exceptions.CalculateServerException;
import website.lhc.commoserver.exceptions.ParamException;

/**
 * @ProjectName: coding
 * @Package: website.lhc.calculateserver.util
 * @ClassName: ServerExceptionHandle
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/17 下午 01:02
 */
@RestControllerAdvice
public class ServerExceptionHandle {

    private static final Logger log = LoggerFactory.getLogger(ServerExceptionHandle.class);

    @ExceptionHandler(value = {CalculateServerException.class})
    public Resp exceptionHandler(CalculateServerException e) {
        log.warn("exception:{}", e.getMessage());
        e.printStackTrace();
        return Resp.error("系统错误");
    }

    @ExceptionHandler(value = {ParamException.class})
    public Resp exceptionHandler(ParamException e) {
        log.warn("exception:{}", e.getMessage());
        return Resp.error(e.getMessage());
    }
}
