package com.bf.test.sqlBuilder;

import com.breakfast.domain.tables.TBfUser;
import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kkk on 14/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class SqlBuildTest {

    @Autowired
    DSLContext creator;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void testJoin() {

        TBfUser b = TBfUser.as("b");

        String sql=creator.selectFrom(b).getSQL();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

            }
        });
    }

}
