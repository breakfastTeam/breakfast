package com.bf.test.sqlBuilder;

import static com.breakfast.domain.Tables.User;
import static com.breakfast.domain.Tables.UserCustomer;

import com.breakfast.domain.tables.User;
import com.breakfast.domain.tables.UserCustomer;
import com.breakfast.domain.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

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

    /**
     *
     * 查询
     */
    @Test
    public void testQuery() {

        User u = User.as("u");
        UserCustomer uc = UserCustomer.as("uc");
        //直接执行
        Result<UserRecord> result= creator.selectFrom(u)
                .where(u.USER_ID.eq("1"))
                .and(u.LOGIN_NAME.like("kkk"))
                .fetch();
        Result<Record> result1= creator.select().from(u)
                .join(uc).on(u.USER_ID.equal(uc.USER_ID))
                .where(u.USER_ID.eq("1"))
                .and(u.LOGIN_NAME.like("kkk"))
                .fetch();

        //使用jooq生成sql，jdbctemplate执行
        String sql=creator.selectFrom(u).where(u.USER_ID.eq("1")).getSQL();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

            }
        });
    }

    /**
     * 新增 修改
     */
    @Test
    public void testSave(){
        User u = User.as("u");
        creator.insertInto(u)
                .set(u.USER_ID, UUID.randomUUID().toString())
                .set(u.USER_NAME,"kkk")
                .execute();
        creator.update(u)
                .set(u.USER_NAME, "kkk")
                .where(u.USER_ID.equal("6sdfsdfsdfsdfsdfsd"));
    }

    /**
     * 删除
     */
    @Test
    public void testDelete(){
        User u = User.as("u");
        creator.delete(u).where(u.USER_ID.equal("6sdfsdfsdfsdfsdfsd"));
    }
}
