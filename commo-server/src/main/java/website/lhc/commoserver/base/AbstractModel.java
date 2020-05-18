package website.lhc.commoserver.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 针对实体类的抽象类
 */
public abstract class AbstractModel {
    @Override
    public String toString() {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(this);
    }
}
