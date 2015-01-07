package com.breakfast.service.impl;

import com.breakfast.constants.IConstants;
import com.breakfast.domain.Tables;
import com.breakfast.domain.tables.TPhotoShow;
import com.breakfast.domain.tables.TRawMaterial;
import com.breakfast.domain.tables.pojos.PhotoShow;
import com.breakfast.domain.tables.pojos.RawMaterial;
import com.breakfast.service.FileService;
import com.breakfast.service.PhotoShowService;
import com.breakfast.service.RawMaterialService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kkk on 14/12/9.
 */
@Service
public class PhotoShowServiceImpl implements PhotoShowService {

    @Autowired
    DSLContext creator;
    @Autowired
    private FileService fileService;
    @Value("#{conf['host']}")
    private String host;

    @Override
    public List<PhotoShow> findPhotoShow(){
        TPhotoShow ps = Tables.PhotoShow.as("ps");
        List<PhotoShow> photoShows = creator.select(ps.orginFileId, ps.smallFileId, ps.uploadTime)
                .from(ps)
                .where(ps.status.equal(IConstants.ENABLE))
                .orderBy(ps.createTime)
                .limit(0, 5)
                .fetchInto(PhotoShow.class);
        for (PhotoShow photoShow:photoShows){
            addFilePath(photoShow);
        }
        return photoShows;
    }

    private void addFilePath(PhotoShow photoShow) {
        if (photoShow!=null&& org.apache.commons.lang3.StringUtils.isNotBlank(photoShow.getOrginFileId())) {
            Map<String, Object> extMap =new HashMap<String, Object>();
            String sPath = fileService.get(photoShow.getSmallFileId()).getFilePath();
            String oPath = fileService.get(photoShow.getOrginFileId()).getFilePath();
            extMap.put("sPath", host+sPath);
            extMap.put("oPath", host+oPath);
            photoShow.setExtMap(extMap);
        }

    }
}
