import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author wangqian
 * @Date 2020-11-09 15:03
 * @Version 1.0
 */
public class TestDemo_DataProvide {
    @DataProvider(name = "test")
    public static Object[][] world(){

        return FakerUtils.getTestData("/src/main/resources/data/divideparam.csv");
    }
    @Test(dataProvider = "test")
    public void divTest(String x,String y) throws InterruptedException {
       int result1 = Calculator.divide(Integer.valueOf(x),Integer.valueOf(y));
        System.out.println(result1);
    }
}
