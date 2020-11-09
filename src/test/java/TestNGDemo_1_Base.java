import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;

public class TestNGDemo_1_Base {
    @Test
    public void addTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        int result = Calculator.add(3,4);
        System.out.println(result);
        softAssert.assertEquals(result,6);

        int result2 = Calculator.add(4,5);
        System.out.println(result2);
        softAssert.assertEquals(result2,6);

        int result3 = Calculator.add(6,8);
        System.out.println(result3);
        softAssert.assertEquals(result3,6);

        softAssert.assertAll();

    }
    @Test
    public void multiplyTest() throws InterruptedException {
        int result = Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(result,8);

    }
    @Test
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(5,7);
        assertEquals(result,-2);
        System.out.println(result);
    }
    @Test
    public void divideTest() throws InterruptedException {
        int result = Calculator.divide(4,2);
        System.out.println(result);
        assertEquals(result,2);

    }
    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(2);
        result = Calculator.count(1);
        System.out.println(result);
       assertEquals(result,3);

    }
}
