package hexlet.code;

import hexlet.code.schemac.NumberSchema;
import hexlet.code.schemac.StringSchema;

public class Validator {
    public final StringSchema string() {

        return new StringSchema();
    }

    public final NumberSchema number() {
        return new NumberSchema();
    }
}
