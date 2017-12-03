package org.iconsider.dao;

import org.iconsider.model.Moment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by liuzhenxing on 2017-12-3.
 */
@Controller
public class MomentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Moment getMoment(int recordNumber) {
        String sqlQueryRecordNumber = String.format("select count(1) as num from b_moment");

        int totalRecordNumber = jdbcTemplate.queryForObject(sqlQueryRecordNumber, null, Integer.class);

        if(recordNumber <= totalRecordNumber) {
            String sqlGetMoment = String.format("select * from (select row_number() OVER(order by id)  as row_number,* from b_moment) as t where row_number=%s", recordNumber);
            jdbcTemplate.queryForObject(sqlGetMoment, new RowMapper<Moment>() {
                @Override
                public Moment mapRow(ResultSet rs, int i) throws SQLException {
                    Moment moment = new Moment(rs.getInt("id"), rs.getString("author"), rs.getString("content"), rs.getTimestamp("date"));
                    System.out.println(moment);
                    return moment;
                }
            });
        }
        return null;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MomentDao momentDao = applicationContext.getBean("momentDao", MomentDao.class);
        momentDao.getMoment(10);
    }
}
