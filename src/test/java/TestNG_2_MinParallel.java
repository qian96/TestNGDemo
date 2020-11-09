import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @Author wangqian
 * @Date 2020-11-09 11:09
 * @Version 1.0
 */
public class TestNG_2_MinParallel {
    @Test(threadPoolSize = 3,invocationCount = 10)
    public void addTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        int result = Calculator.add(3,4);
        System.out.println(result);
    }
    @Test(threadPoolSize = 3,invocationCount = 10)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(5,7);
        System.out.println(result);
    }
}
