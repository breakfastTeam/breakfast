package com.breakfast.service;

import com.breakfast.domain.tables.pojos.File;
import com.breakfast.domain.tables.records.TFileRecord;

/**
 * Created by qingfeilee on 2014/11/22.
 */
public interface FileService {


    public void add(TFileRecord file);

    public File get(String id);
}
