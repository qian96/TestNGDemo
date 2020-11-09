package examples.packageA;

import org.testng.annotations.Test;

/**
 * @Author wangqian
 * @Date 2020-11-09 13:34
 * @Version 1.0
 */
public class ClassTestA {
    @Test(groups = {"group1"})
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups = {"group2","group3"})
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups = {"group3"})
    public void test3(){
        System.out.println("test3");
    }
}
