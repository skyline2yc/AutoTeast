package com.skyline2yc.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 什么时候会用用到异常测试？
     *  在我们期望结果为某一个异常的时候
     *  比如：传入某些不合法的参数，程序抛出了异常
     *  也就是预期结果就是这个异常
     */

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是异常测试");
        throw new RuntimeException();
    }
}
