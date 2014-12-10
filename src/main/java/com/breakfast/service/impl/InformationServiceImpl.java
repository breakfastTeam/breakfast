package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TInformation;
import com.breakfast.domain.tables.pojos.Information;
import com.breakfast.service.InformationService;
import com.core.page.Page;
import org.jooq.DSLContext;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk .
 */
@Service
public class InformationServiceImpl implements InformationService {
    @Autowired
    DSLContext creator;
    
    @Override
    public Page<Information> query(Page<Information> page) {
        TInformation information = Tables.Information.as("information");
        int count=creator.selectFrom(information)
                .where(information.status.notEqual(IConstants.INFORMATION_STATUS_ENABLE)).fetchCount();
        page.setTotalCount(count);
        List<Information> result =
                creator.selectFrom(information)
                        .where(information.status.notEqual(IConstants.INFORMATION_STATUS_ENABLE))
                        .limit(((page.getPageNo() - 1)) * page.getPageSize(), page.getPageSize())
                        .fetch().into(Information.class);
        page.setResult(result);
        return page;

    }
}
