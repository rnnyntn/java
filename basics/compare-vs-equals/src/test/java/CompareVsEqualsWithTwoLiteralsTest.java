import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareVsEqualsWithTwoLiteralsTest {
    @Test
    void givenTwoIdenticalStringLiterals_whenUsingCompareAndEquals_shouldBeEqual() {
        String s1 = "hulk";
        String s2 = "hulk";
        assertTrue(s1.equals(s2));
        assertTrue(s1 == s2); // Points to same object in the string pool
    }

    @Test
    void givenTwoIdenticalCreatedStringWithConstructor_shouldBeNotEqual() {
        String s1 = "hulk";
        String s2 = new String(s1);
        assertTrue(s1.equals(s2));
        assertFalse(s1 == s2);
    }

    @Test
    void givenTwoIdenticalCreatedStringWithConstructor_shouldBeNotEqual2() {
        String s1 = new String("hulk");
        String s2 = new String("hulk");
        assertTrue(s1.equals(s2));
        assertFalse(s1 == s2);
    }
}
