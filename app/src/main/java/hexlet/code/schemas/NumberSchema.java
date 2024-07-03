package hexlet.code.schemas;

import java.util.Objects;
import java.util.function.Predicate;

public final class NumberSchema extends BaseSchema<Integer> {
    public NumberSchema positive() {
        Predicate<Integer> greaterThanZer0 = s -> s > 0;
        Predicate<Integer> notNull = Objects::isNull;
        getPredicates().put("только положительное число", notNull.or(greaterThanZer0));
        return  this;
    }

    public NumberSchema range(int min, int max) {
        getPredicates().put("допустимый диапазон", s -> (s >= min && s <= max));
        return this;
    }

    public NumberSchema required() {
        getPredicates().put("запрет на null", Objects::nonNull);
        return this;
    }

    public boolean isValid(Integer value) {
        return super.isValid(value);
    }
}
