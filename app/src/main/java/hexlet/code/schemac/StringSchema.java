package hexlet.code.schemac;

import hexlet.code.Validator;

public final class StringSchema extends Validator<String> {
    public StringSchema required() {
        getPredicates().put("запрет на null", s -> s != null && !s.isEmpty());
        return this;
    }

    public StringSchema minLength(int length) {
        getPredicates().put("минимальная длина строки", s -> s.length() >= length);
        return this;
    }

    public StringSchema contains(String data) {
        getPredicates().put("строка содержит", s -> s.contains(data));
        return this;
    }
}
