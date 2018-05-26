package com.zou.springmvc.handlers;


import com.zou.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @RequestMapping 修饰类
 */
//@SessionAttributes({"user"})
@Controller
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
     * <p>
     * <p>
     * SpringMVC会把ModelAndView的model中的数据放到request对象中
     */

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {

        String viewName = SUCCESS;

        ModelAndView modelAndView = new ModelAndView(viewName);

        //添加模型数据到ModelAndView
        modelAndView.addObject("time", new Date());


        return modelAndView;


    }

    /**
     * 目标方法可以添加Map类型的参数(或者是Model或者是ModelMap类型)
     */

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {

        map.put("names", Arrays.asList("zhangsan", "lisi", "wangwu"));

        return SUCCESS;
    }


    /**
     * @SessionAttribuates 只能放在类的上面
     */

    @RequestMapping("/testSessionAttribuates")
    public String testSessionAttribuates(Map<String, Object> map) {

        User user = new User("zzz", "11111", "333@qq.com", 22);

        map.put("user", user);

        return SUCCESS;

    }


    /**
     *
     */

    @RequestMapping("/testModelAttribuate")
    public String testModelAttribuate(User user) {

        System.out.println("修改： " + user);

        return SUCCESS;
    }

    /**
     * 有@ModelAttribuate 标记的方法，会在每个目标方法执行之前被SpringMVC调用！
     *
     * @param id
     * @param map
     */

    @ModelAttribute
    public void getUser(@RequestParam(value = "id", required = false) Integer id, Map<String, Object> map) {

        if (id != null) {

            //模拟从数据库中获取一个对象
            User user = new User(1, "zzz", "1234", "aa@qq.com", 12);

            System.out.println("从数据库中国获取一个对象");

            map.put("user", user);
        }


    }


}



















































































