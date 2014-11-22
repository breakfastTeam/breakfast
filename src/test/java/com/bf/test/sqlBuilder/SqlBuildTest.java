package com.bf.test.sqlBuilder;

import static com.breakfast.domain.Tables.User;
import static com.breakfast.domain.Tables.UserCustomer;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.User;
import com.breakfast.domain.tables.UserCustomer;
import com.breakfast.domain.tables.records.UserRecord;
import com.breakfast.service.SetMealService;
import com.core.page.Page;
import com.core.utils.IUUIDGenerator;
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
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by kkk on 14/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml", "/datasource.xml"})
@TransactionConfiguration(transactionManager="transactionManager")
public class SqlBuildTest {
    @Autowired
    private SetMealService setMealService;

    @Autowired
    DSLContext creator;
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 查询
     */
    @Test
    public void testQuery() {
        User u = User.as("u");
        Result<UserRecord> result = creator.selectFrom(u)
                .where(u.userName.like("%kk%"))
                .orderBy(u.userName)
                .limit(0,4)
                .fetch();
        for (int i = 0; i<result.size(); i++){
            System.out.println("------------------------"+result.get(i).getUserName());
        }

//        User u = User.as("u");
//        UserCustomer uc = UserCustomer.as("uc");
//
//        //直接执行
//        Result<UserRecord> result= creator.selectFrom(u)
//                .where(u.userId.equal("1"))
//                .and(u.loginName.like("2"))
//                .fetch();
//        Result<Record> result1= creator.select().from(u)
//                .join(uc).on(u.userId.equal(uc.userId))
//                .where(u.userId.equal("1"))
//                .and(u.loginName.like("kkk"))
//                .fetch();

//        //使用jooq生成sql，jdbctemplate执行
//        String sql=creator.selectFrom(u).where(u.userId.equal("1")).getSQL();
//        jdbcTemplate.query(sql, new RowCallbackHandler() {
//            @Override
//            public void processRow(ResultSet resultSet) throws SQLException {
//
//            }
//        });
    }

    /**
     * 新增 修改
     */
    @Test
    public void testSave() {
        User u = User.as("u");
        creator.insertInto(User)
                .set(User.userId, "3")
                .set(User.userName, "k333kk")
                .execute();

//        creator.update(u)
//                .set(u.userName, "kkk")
//                .where(u.userId.equal("1"))
//                .execute();
    }

    /**
     * 删除
     */
    @Test
    public void testDelete() {
        User u = User.as("u");
        creator.delete(u).where(u.userId.equal("6sdfsdfsdfsdfsdfsd"));
    }

    /**
     * 测试B001接口
     */
    @Test
    public void testB001() {
        Page<Record> page = new Page<Record>(IConstants.DEFAULT_PAGE_SIZE, 1);
        page = setMealService.query(page);
        System.out.println(page.getResult().getValue(0, "set_name"));
    }

}
