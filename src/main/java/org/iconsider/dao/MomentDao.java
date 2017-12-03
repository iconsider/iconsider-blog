package org.iconsider.dao;

import org.iconsider.model.Moment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;


/**
 * Created by liuzhenxing on 2017-12-3.
 */
@Controller
public class MomentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Moment getMoment(int recordNumber) {
        String sqlQueryRecordNumber = String.format("select count(1) as num from b_moment");

        int num = jdbcTemplate.queryForObject(sqlQueryRecordNumber, null, Integer.class);

        System.out.println(String.format("记录条数：%s", num));

        String sqlGetMoment = String.format("select * from (select row_number() OVER(order by id)  as row_number,* from b_moment) as t where row_number=%s", recordNumber);

        return null;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MomentDao momentDao = applicationContext.getBean("momentDao", MomentDao.class);
        momentDao.getMoment(1);
    }
}
