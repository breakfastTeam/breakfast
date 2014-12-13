package com.breakfast.service;

import com.breakfast.domain.tables.pojos.Information;
import com.core.page.Page;

/**
 * Created by kkk .
 */
public interface InformationService {
    /**
     * 分页查询Information
     * @param page
     * @return
     */
    Page<Information> query(Page<Information> page);

    /**
     * 获取公告
     * @param informationId
     * @return
     */
    Information loadInformation(String informationId);
}
