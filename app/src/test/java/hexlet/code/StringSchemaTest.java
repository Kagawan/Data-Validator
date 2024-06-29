package hexlet.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringSchemaTest {
    static final int MIN_LENGTH = 10;
    static final int MIN_LENGTH1 = 4;
    @Test
    void stringSchemaTest() {
        var v = new Validator();
        var schema = v.string();
        assertTrue(schema.isValid(""));
        assertTrue(schema.isValid(null));
        schema.required();
        assertFalse(schema.isValid(null));
        assertFalse(schema.isValid(""));
        assertTrue(schema.isValid("what does the fox say"));
        assertTrue(schema.isValid("hexlet"));
        assertTrue(schema.contains("wh").isValid("what does the fox say"));
        assertTrue(schema.contains("what").isValid("what does the fox say"));
        assertFalse(schema.contains("whatthe").isValid("what does the fox say"));
        assertFalse(schema.isValid("what does the fox say"));
        var schema1 = v.string();
        assertTrue(schema1.minLength(MIN_LENGTH).minLength(MIN_LENGTH1).isValid("Hexlet"));
    }
}
