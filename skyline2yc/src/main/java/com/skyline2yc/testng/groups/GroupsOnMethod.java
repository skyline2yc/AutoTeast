package com.skyline2yc.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test01(){
        System.out.println("服务端test01执行");
    }

    @Test(groups = "server")
    public void test02(){
        System.out.println("服务端test02执行");
    }
    @Test(groups = "client")
    public void test03(){
        System.out.println("客户端test03执行");
    }
    @Test(groups = "client")
    public void test04(){
        System.out.println("客户端test04执行");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
}
