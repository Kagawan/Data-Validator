package hexlet.code.schemac;

import java.util.Map;
import java.util.Objects;

public final class MapSchema<T> extends BaseSchema<Map<String, T>> {
    public  MapSchema<T> required() {
        getPredicates().put("запрет на null", Objects::nonNull);
        return this;
    }

    public MapSchema<T> sizeof(Integer size) {
        getPredicates().put("ограничение на размер Map", s -> s.size() == size);
        return this;
    }

    public boolean isValid(Map<String, T> value) {
        return super.isValid(value);
    }

    public MapSchema<T> shape(Map<String, BaseSchema<String>> sch) {
        var schemas = sch;
        return this;
    }
}
