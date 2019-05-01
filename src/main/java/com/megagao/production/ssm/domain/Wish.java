package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-30
 */
public class Wish {
    private String wishId;

    private String wishText;

    private Date wishDate;

    public String getWishId() {
        return wishId;
    }

    public void setWishId(String wishId) {
        this.wishId = wishId == null ? null : wishId.trim();
    }

    public String getWishText() {
        return wishText;
    }

    public void setWishText(String wishText) {
        this.wishText = wishText == null ? null : wishText.trim();
    }

    public Date getWishDate() {
        return wishDate;
    }

    public void setWishDate(Date wishDate) {
        this.wishDate = wishDate;
    }
}