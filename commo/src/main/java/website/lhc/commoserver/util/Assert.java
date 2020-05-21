package website.lhc.commoserver.util;

import org.springframework.util.CollectionUtils;
import website.lhc.commoserver.exceptions.ParamException;

import java.util.List;

/**
 * @ProjectName: coding
 * @Package: website.lhc.commoserver.util
 * @ClassName: Assert
 * @Author: lhc
 * @Description: Assert
 * @Date: 2020/5/21 上午 12:22
 */
public class Assert extends org.springframework.util.Assert {

    public static <T> void isCollectionEmpty(List<T> list, String message) {
        if (CollectionUtils.isEmpty(list)) {
            throw new ParamException(message);
        }
    }
}
