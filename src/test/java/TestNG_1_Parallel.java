import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @Author wangqian
 * @Date 2020-11-09 10:50
 * @Version 1.0
 */
public class TestNG_1_Parallel {
    @Test(threadPoolSize = 2,invocationCount = 20,timeOut = 6000)
    public void count() throws InterruptedException {
        int count = Calculator.count(2);
        //assertEquals(count,1);
        System.out.println(count);
    }
    @Test(threadPoolSize = 3,invocationCount = 10,timeOut = 6000)
    public void count2() throws InterruptedException {
        int count = Calculator.count2(1);
        //assertEquals(count,1);
        System.out.println(count);
    }
}
