package com.zou.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    /**
     * 1.使用@RequestMapping  注解来映射请求的URL
     * @return
     *
     * 2.返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器，会做如下判断：
     * 通过prefix + 返回值 + suffix 这样的方式得到实际的物理视图，然后做转发操作
     *
     * /WEB-INF/views/success.jsp
     *
     */
    @RequestMapping("/helloworld")
    public String hello() {

        System.out.println("Hello  World");
        return "success";
    }


}

























































