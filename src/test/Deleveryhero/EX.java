//package com.codility;
//
//import org.junit.Assert;
//import org.junit.Test;
//import java.util.regex.Pattern;
//
//import static org.assertj.core.api.Assertions.*;
//
//public class VersionTest {
//    // ... write your unit tests here ...
//
//    public VersionTest() {
//        if ("".equals(version) || version.length() == 0) {
//            throw new IllegalArgumentException(errorVersionMustNotBeNull);
//        }
//    }
//
//    public VersionTest(String version) {
//        String pattern = "\\d+(\\.\\d+){0,2}(-SNAPSHOT)?";
//        if (!Pattern.matches(pattern, version)) {
//            throw new IllegalArgumentException(errorVersionMustMatchPattern);
//        }
//
//    }
//
//    @Test
//    public void exampleTest() {
//        Version version = new Version("3.8.0");
//        // ...
//    }
//
//    @Test
//    public void exampleTest2() {
//        Version version = new Version("3.8.0-SNAPSHOT");
//        // ...
//    }
//
//    // expected error messages:
//
//    static final String errorVersionMustNotBeNull = "'version' must not be null!";
//    static final String errorOtherMustNotBeNull =  "'other' must not be null!";
//    static final String errorVersionMustMatchPattern =  "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";
//}
