package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TInformation;
import com.breakfast.domain.tables.pojos.File;
import com.breakfast.domain.tables.pojos.Information;
import com.breakfast.service.FileService;
import com.breakfast.service.InformationService;
import com.core.page.Page;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Autowired
    private FileService fileService;
    @Value("#{conf['host']}")
    private String host;

    @Override
    public Page<Information> query(Page<Information> page) {
        TInformation information = Tables.Information.as("information");
        int count=creator.selectFrom(information)
                .where(information.status.equal(IConstants.INFORMATION_STATUS_ENABLE)).fetchCount();
        page.setTotalCount(count);
        List<Information> result =
                creator.selectFrom(information)
                        .where(information.status.equal(IConstants.INFORMATION_STATUS_ENABLE))
                        .limit(((page.getPageNo() - 1)) * page.getPageSize(), page.getPageSize())
                        .fetchInto(Information.class);
        for (Information info : result) {
            addFilePath(info);
        }
        page.setResult(result);
        return page;

    }

    @Override
    public Information loadInformation(String informationId) {
        TInformation record = Tables.Information.as("info");
        return creator.selectFrom(record).
                where(record.informationId.equal(informationId)).
                fetchOneInto(Information.class);
    }

    private void addFilePath(Information info) {
        if (info!=null&& org.apache.commons.lang3.StringUtils.isNotBlank(info.getSmallPicId())) {
            Map<String, Object> extMap =new HashMap<String, Object>();
            File file = fileService.get(info.getSmallPicId());
            if (file != null) {
                String sPath = file.getFilePath();
                extMap.put("sPath", host+sPath);
                info.setExtMap(extMap);
            }
        }
    }
}
