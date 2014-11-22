package com.breakfast.service;

import com.breakfast.domain.tables.records.FileRecord;

/**
 * Created by qingfeilee on 2014/11/22.
 */
public interface FileService {
    public void add(FileRecord file);
    public FileRecord get(String id);
}
