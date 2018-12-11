package com.heally.springmvclabs;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    @Test
    public void testHelloControllerToUpperCaseMethod() {
        String inputStringEmpty = "";
        String inputStringNonEmpty = "Some words";
        String inputStringNonEmptyAllCaps = "SOME WORDS";
        assertNull(HelloController.toUpperCase(null));
        assertTrue(HelloController.toUpperCase(inputStringEmpty).equals(inputStringEmpty));
        assertTrue(HelloController.toUpperCase(inputStringNonEmpty).equals(inputStringNonEmptyAllCaps));
    }
}
