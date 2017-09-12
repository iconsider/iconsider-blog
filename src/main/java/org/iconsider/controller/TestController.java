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
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public @ResponseBody People test1(HttpServletRequest request, HttpServletResponse response) {
        People people = new People();
        people.setAge(25);
        people.setName("刘德华");
        return people;
    }
}
