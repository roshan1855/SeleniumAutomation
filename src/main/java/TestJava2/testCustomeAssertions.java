package TestJava2;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class testCustomeAssertions {



    public static void main(String[] args) {
        CustomeAssertions cs=new CustomeAssertions();

        cs.verifyGreaterThan(10, 5, "Actual is not greater than Expected!");
        System.out.println("Actual is greater than expected");

        SoftAssert sA = new SoftAssert();
        int actua = 5;
        int expecte = 4;
        sA.assertEquals(actua, expecte,"Values didn't match");
        System.out.println("This line executes only if assertion passes but will be executed in case of soft Assertion");

    }




    }
