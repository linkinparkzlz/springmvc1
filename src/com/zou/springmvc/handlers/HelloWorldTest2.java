package com.zou.springmvc.handlers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @RequestMapping 修饰类
 */

@RequestMapping("/springmvc")
public class HelloWorldTest2 {

    public static final String SUCCESS = "success";

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {

        System.out.println("testRequestMapping");

        return SUCCESS;
    }


    /**
     * 使用Method 属性来指定请求方式
     */

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {

        System.out.println("testMethod");
        return SUCCESS;

    }

}




















































































