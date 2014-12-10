package com.breakfast.service.impl;

import static com.breakfast.domain.Tables.File;
import com.breakfast.domain.tables.TFile;
import com.breakfast.domain.tables.pojos.File;
import com.breakfast.domain.tables.records.TFileRecord;
import com.breakfast.service.FileService;
import com.core.utils.IUUIDGenerator;
import org.joda.time.DateTime;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by qingfeilee on 2014/11/22.
 */
@Service("fileService")
public class FileServiceImpl implements FileService{
    @Autowired
    DSLContext creator;

    @Override
    @Transactional
    public void add(TFileRecord record) {
        TFile fileTable = File.as("file");
        creator.insertInto(fileTable)
                .set(fileTable.fileId, IUUIDGenerator.getUUID())
                .set(fileTable.filePath, record.getFilePath())
                .set(fileTable.createTime, DateTime.now())
                .execute();
    }

    @Override
    @Transactional
    public File get(String id) {
        com.breakfast.domain.tables.TFile fileTable = File.as("file");
        List<File> result = creator.selectFrom(fileTable).where(fileTable.fileId.equal(id)).fetch().into(File.class);
        return result.size()>0?result.get(0):null;
    }
}
