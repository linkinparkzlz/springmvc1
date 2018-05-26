package com.zou.springmvc.handlers;


import com.zou.springmvc.bean.User;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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


    /**
     * 设置请求头或者请求参数
     */

    @RequestMapping(value = "testParamsAndHeaders", params = {"username", "age != 10"})
    public String testParamsAndHeaders() {

        System.out.println("testParamsAndHeaders");

        return SUCCESS;
    }


    /**
     * 通配符
     * <p>
     * ** 表示任意多个字符
     */

    @RequestMapping("/testAntPath/**/testAntPath")
    public String testAntPath() {

        System.out.println("testAntPath");
        return SUCCESS;
    }


    /**
     * @PathVariable 占位符
     * <p>
     * 可以用来映射URL中的占位符到目标方法的参数中
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id") Integer id) {

        System.out.println("testPathVariable: " + id);

        return SUCCESS;

    }


    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {


        System.out.println("testCookieValue: sessionId : " + sessionId);

        return SUCCESS;

    }


    /**
     * 使用POJO作为参数
     * 当你请求的是一个对象，并且存在级联关系的时候
     */

    @RequestMapping("/testPojo")
    public String testPojo(User user) {

        System.out.println("testPojo: " + user);

        return SUCCESS;
    }


    /**
     *
     */
//    @RequestMapping("/testServletAPI")
//    public String testServletAPI(HttpServletRequest request,
//                                 HttpServletResponse response) {
//        System.out.println("testServletAPI: " + request + "," + response);
//
//        return SUCCESS;
//
//    }


    /**
     * 处理模型数据
     * <p>
     * 目标方法的返回值可以是ModelAndView类型
     * <p>
     * 其中可以包含视图和模型信息
     *
     *
     * SpringMVC会把ModelAndView的model中的数据放到request对象中
     *
     */

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {

        String viewName = SUCCESS;

        ModelAndView modelAndView = new ModelAndView(viewName);

        //添加模型数据到ModelAndView
        modelAndView.addObject("time", new Date());


        return modelAndView;


    }


}



















































































