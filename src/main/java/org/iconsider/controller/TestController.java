package org.iconsider.controller;

import org.iconsider.model.People;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jesse on 2017-8-15.
 */
@RestController
@RequestMapping("testController")
public class TestController {
    @RequestMapping(value = "/test1")
    public String test1(HttpServletRequest request, HttpServletResponse response) {
        People people = new People();
        people.setAge(Integer.parseInt(request.getParameter("age")));
        people.setName("刘德华");
        return people.toString();
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public @ResponseBody People test2(HttpServletRequest request, HttpServletResponse response) {
        People people = new People();
        people.setAge(25);
        people.setName("刘德华");
        return people;
    }

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    public String test3(HttpServletRequest request, HttpServletResponse response) {
        String itemNum = request.getParameter("itemNum");
        return itemNum;
    }
}
