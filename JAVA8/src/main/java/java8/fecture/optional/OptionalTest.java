package java8.fecture.optional;


import org.junit.jupiter.api.Test;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {

    @Test
    void testOf() {
        String value = "Hello, Optional!";
        Optional<String> optional = Optional.of(value);
        assertTrue(optional.isPresent());
        assertEquals(value, optional.get());
    }

    @Test
    void testOfNullable() {
        String value = null;
        Optional<String> optional = Optional.ofNullable(value);
        assertFalse(optional.isPresent());
    }

    @Test
    void testEmpty() {
        Optional<String> optional = Optional.empty();
        assertFalse(optional.isPresent());
    }

    @Test
    void testIfPresent() {
        Optional<String> optional = Optional.of("Hello, Optional!");
        optional.ifPresent(value -> assertEquals("Hello, Optional!", value));
    }

    @Test
    void testOrElse() {
        Optional<String> optional = Optional.empty();
        String result = optional.orElse("Default value");
        assertEquals("Default value", result);
    }

    @Test
    void testOrElseGet() {
        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(() -> "Default value");
        assertEquals("Default value", result);
    }

    @Test
    void testOrElseThrow() {
        Optional<String> optional = Optional.empty();
        String res = optional.orElseThrow(IllegalStateException::new);
       // assertThrows(NoSuchElementException.class, );
    }

    @Test
    void testFilter() {
        Optional<Integer> optional = Optional.of(42);
        Optional<Integer> filtered = optional.filter(value -> value % 2 == 0);
        assertTrue(filtered.isPresent());
        assertEquals(42, filtered.get());

        filtered = optional.filter(value -> value % 2 != 0);
        assertFalse(filtered.isPresent());
    }

    @Test
    void testMap() {
        Optional<String> optional = Optional.of("Hello, Optional!");
        Optional<Integer> mapped = optional.map(String::length);
        assertTrue(mapped.isPresent());
        assertEquals(16, mapped.get());
    }

    @Test
    void testFlatMap() {
        Optional<String> optional = Optional.of("Hello, Optional!");
        Optional<Integer> flatMapped = optional.flatMap(value -> Optional.of(value.length()));
        assertTrue(flatMapped.isPresent());
        assertEquals(16, flatMapped.get());
    }
}
