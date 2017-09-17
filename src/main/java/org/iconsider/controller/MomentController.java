package org.iconsider.controller;

import org.iconsider.model.Moment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;

/**
 * Created by Jesse on 2017-9-17.
 */
@RestController
@RequestMapping("moment")
public class MomentController {
    @RequestMapping(value = "/getMoments")
    public @ResponseBody Moment getMoments(HttpServletRequest request, HttpServletResponse response) {
        String itemNum = request.getParameter("itemNum");

        Moment moment = new Moment("Jesse", "今天天气不错", new Timestamp(System.currentTimeMillis()), new String[]{"/abc"});

        return moment;
    }
}
