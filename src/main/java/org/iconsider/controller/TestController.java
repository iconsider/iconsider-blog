package org.iconsider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String test1(HttpServletRequest request, HttpServletResponse response) {
        return "hello world";
    }
}
