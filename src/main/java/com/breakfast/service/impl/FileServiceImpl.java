package com.breakfast.service.impl;

import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.File;
import com.breakfast.domain.tables.records.FileRecord;
import com.breakfast.service.FileService;
import com.core.utils.ITimeUtil;
import com.core.utils.IUUIDGenerator;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by qingfeilee on 2014/11/22.
 */
public class FileServiceImpl implements FileService{
    @Autowired
    DSLContext creator;

    @Override
    @Transactional
    public void add(FileRecord record) {
        File fileTable = Tables.File;
        creator.insertInto(fileTable)
                .set(fileTable.fileId, IUUIDGenerator.getUUID())
                .set(fileTable.filePath, record.getFilePath())
                .set(fileTable.createTime, ITimeUtil.getCurrentTime())
                .execute();
    }

    @Override
    @Transactional
    public FileRecord get(String id) {
        com.breakfast.domain.tables.File fileTable = Tables.File;
        Result<FileRecord> result = creator.selectFrom(fileTable).where(fileTable.fileId.equal(id)).fetch();
        return result.get(0);
    }
}
