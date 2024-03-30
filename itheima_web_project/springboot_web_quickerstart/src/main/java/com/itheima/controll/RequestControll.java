package com.itheima.controll;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestControll {
    @RequestMapping("simpleparam")
    public String simpleparam(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        int a = Integer.parseInt(age);
        System.out.println(name + ":" + a);
        return "ok";
    }
@RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
}
