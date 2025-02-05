package hexlet.code.schemas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BaseSchema<T> {
    private final Map<String, Predicate<T>> predicates;

    public final Map<String, Predicate<T>> getPredicates() {
        return predicates;
    }

    public BaseSchema() {
        this.predicates = new HashMap<>();
    }
    /**
     * Проверяет, удовлетворяет ли значение переданным предикатам.
     *
     * @param value значение, которое требуется проверить
     * @return {@code true}, если значение удовлетворяет всем предикатам, {@code false} в противном случае
     */
    public boolean isValid(T value) {
        Collection<Predicate<T>> values = predicates.values();
        return values.stream().allMatch(p -> p.test(value));
    }
}
