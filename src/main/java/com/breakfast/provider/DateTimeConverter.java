package com.breakfast.provider;

import org.joda.time.DateTime;
import org.jooq.Converter;

import java.sql.Timestamp;

public class DateTimeConverter implements Converter<Timestamp, DateTime> {

    @Override
    public DateTime from(Timestamp databaseObject) {
        if (databaseObject == null) {
            return null;
        }
        return new DateTime(databaseObject.getTime());
    }

    @Override
    public Timestamp to(DateTime dt) {
        if (dt == null) {
            return null;
        }
        return new Timestamp(dt.getMillis());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<DateTime> toType() {
        return DateTime.class;
    }
}