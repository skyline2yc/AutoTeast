package com.skyline2yc.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testcase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("BeforeMethod在测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在测试方法之前运行");
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("beforeClass在测试类之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在测试类之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

}
