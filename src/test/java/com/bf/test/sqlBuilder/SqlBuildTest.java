package com.bf.test.sqlBuilder;

import static com.breakfast.domain.Tables.User;
import static com.breakfast.domain.Tables.Food;
import static com.breakfast.domain.Tables.SetMeal;
import static com.breakfast.domain.Tables.UserCustomer;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TFood;
import com.breakfast.domain.tables.TSetMeal;
import com.breakfast.domain.tables.TUser;
import com.breakfast.domain.tables.TUserCustomer;
import com.breakfast.domain.tables.pojos.SetMeal;
import com.breakfast.domain.tables.pojos.User;
import com.breakfast.domain.tables.records.TSetMealRecord;
import com.breakfast.domain.tables.records.TUserRecord;
import com.breakfast.service.SetMealService;
import com.breakfast.service.UserService;
import com.core.page.Page;
import com.core.utils.IUUIDGenerator;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by kkk on 14/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml","/dispatcher-servlet.xml", "/datasource.xml"})
public class SqlBuildTest {
//    @Autowired
//    private SetMealService setMealService;

    @Autowired
    DSLContext creator;
    @Autowired
    UserService userService;
    /**
     * 查询
     */
    @Test
    public void testQuery() {
        TUser u = User.as("u");
        Result<TUserRecord> result = creator.selectFrom(u)
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
        TUser u = User.as("u");
//        creator.insertInto(User)
//                .set(u.userId, IUUIDGenerator.getUUID())
//                .set(u.userName, "zhlkkk")
//                .execute();
//        com.breakfast.domain.tables.pojos.User user = new User();
//        user.setUserId(IUUIDGenerator.getUUID());
//        user.setUserName("zhlkkk");
//        user.setLoginName("admin");
//        user.setPassword(DigestUtils.md5Hex("000000"));
//        userService.saveUser(user);

//        com.breakfast.domain.tables.pojos.User user1 = new User();
//        TUserRecord record = creator.selectFrom(u).where(u.userId.equal("aff13f767405434596ad1a36e2e25a1a")).fetchAny();
//        record.setStatus(IConstants.USER_STATUS_ENABLE);
//        record.store();
//        int count=creator.executeUpdate(record);

//        creator.update(u)
//                .set(u.userName, "kkk")
//                .where(u.userId.equal("1"))
//                .execute();
//        creator.insertInto(Food)
//                .set(Food.foodId, "5")
//                .set(Food.supportExchange, true)
//                .set(Food.supportSnapUp, false).execute();
        for (int i = 0; i < 10; i++) {
            TSetMeal tSetMeal = Tables.SetMeal.as("setMeal");
            com.breakfast.domain.tables.pojos.SetMeal setMeal = new SetMeal();
            setMeal.setSetMealId(IUUIDGenerator.getUUID());
            setMeal.setSetName("套餐" + DateTime.now().getSecondOfMinute());
            setMeal.setStartTime(DateTime.now().minusDays(1));
            setMeal.setEndTime(DateTime.now().plusDays(30));
            setMeal.setRealFoodCount(11);
            setMeal.setStatus(IConstants.SET_MEAL_STATUS_PUTAWAY);
            setMeal.setPrice(new BigDecimal(10));
            setMeal.setPrice(new BigDecimal(9));
            TSetMealRecord record = creator.newRecord(Tables.SetMeal, setMeal);
            record.store();
            creator.executeInsert(record);
        }

//
//        creator.insertInto(SetMeal)
//                .set(tSetMeal.setMealId, IUUIDGenerator.getUUID())
//                .set(tSetMeal.setName, "setmeal id:"+IUUIDGenerator.getUUID())
//                .set(tSetMeal.startTime, DateTime.now().minusDays(1))
//                .set(tSetMeal.endTime, DateTime.now().plusDays(1))
//                .set(tSetMeal.realFoodCount, 10)
//                .execute();

    }

    /**
     * 删除
     */
    @Test
    public void testDelete() {
        TUser u = User.as("u");
        creator.delete(u).where(u.userId.equal("6sdfsdfsdfsdfsdfsd"));
    }

    /**
     * 测试B001接口
     */
    @Test
    public void testB001() {
        Page<Record> page = new Page<Record>(IConstants.DEFAULT_PAGE_SIZE, 1);
//        page = setMealService.query(page);
//        System.out.println(page.getResult().getValue(0, "set_name"));
    }

}
