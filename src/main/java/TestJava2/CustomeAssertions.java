package TestJava2;

import org.testng.Assert;

public class CustomeAssertions {

        public static void verifyGreaterThan(int actual, int expected, String message) {
            Assert.assertTrue(actual > expected, message);
        }



}
