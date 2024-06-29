package hexlet.code;

import hexlet.code.schemac.StringSchema;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Validator<T> {
    private final Map<String, Predicate<T>> predicates;
    public Validator() {
        this.predicates = new HashMap<>();
    }
    public final StringSchema string() {

        return new StringSchema();
    }

    public final Map<String, Predicate<T>> getPredicates() {
        return predicates;
    }

    public final boolean isValid(T value) {
        Collection<Predicate<T>> values = predicates.values();
        return values.stream().allMatch(p -> p.test(value));
    }
}
