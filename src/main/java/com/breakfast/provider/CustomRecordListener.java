package com.breakfast.provider;

import org.slf4j.Logger;
import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.RecordContext;
import org.jooq.impl.DefaultRecordListener;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by kkk on 14/11/27.
 */
public class CustomRecordListener extends DefaultRecordListener{

    final static Logger logger = LoggerFactory.getLogger(CustomRecordListener.class);

    @Override
    public void insertStart(RecordContext ctx) {
        logger.debug("insert start : handle RecordContext {}", ctx);
        System.out.println(new Date().getTime());
        setInsterCommonField(ctx);
        super.insertStart(ctx);
    }

    @Override
    public void updateStart(RecordContext ctx) {
        logger.debug("update start : handle RecordContext {}",ctx);
        setUpdateCommonField(ctx);
        super.updateStart(ctx);
    }


    private void setInsterCommonField(RecordContext ctx){
        Record record=ctx.record();
        Field<DateTime> createTime = (Field<DateTime>)record.field("create_time");
        Field<DateTime> lastModifyTime = (Field<DateTime>)record.field("last_modify_time");
        Field<String> createBy = (Field<String>)record.field("create_by");
        Field<String> lastModifyBy = (Field<String>)record.field("last_modify_by");
        Field<Long> optTime = (Field<Long>)record.field("opt_time");
        record.setValue(createTime,DateTime.now());
        record.setValue(lastModifyTime,DateTime.now());
        record.setValue(createBy,ExecutionContext.getUserId());
        record.setValue(lastModifyBy,ExecutionContext.getUserId());
        record.setValue(optTime, System.currentTimeMillis());
    }
    private void setUpdateCommonField(RecordContext ctx){
        Record record=ctx.record();
        Field<DateTime> lastModifyTime = (Field<DateTime>)record.field("last_modify_time");
        Field<String> lastModifyBy = (Field<String>)record.field("last_modify_by");
        Field<Long> optTime = (Field<Long>)record.field("opt_time");
        record.setValue(lastModifyTime,DateTime.now());
        record.setValue(lastModifyBy,ExecutionContext.getUserId());
        record.setValue(optTime,System.currentTimeMillis());
    }
}
