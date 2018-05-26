package com.zou.springmvc.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import java.util.Date;
import java.util.Map;

@Component
public class HelloView implements View {


    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> map, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {


        httpServletResponse.getWriter().print("hello viewtime: " + new Date());
    }
}
