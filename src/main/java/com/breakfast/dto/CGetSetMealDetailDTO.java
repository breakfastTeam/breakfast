package com.breakfast.dto;

import java.math.BigDecimal;

/**
 * Created by qingfeilee on 2014/11/22.
 */
public class CGetSetMealDetailDTO {
    private String price;
    private String orginPic;
    private BigDecimal averageGrade;
    private String introduce;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrginPic() {
        return orginPic;
    }

    public void setOrginPic(String orginPic) {
        this.orginPic = orginPic;
    }

    public BigDecimal getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(BigDecimal averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
