package com.mmall.vo;

import java.math.BigDecimal;

/**
 * Created by chengjinqian on 2017/7/15.
 */
public class ProductDetailVo {

    private Integer id;
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImages;
    private String detail;
    private BigDecimal price;
    private Integer stock;
    private Integer status;
    private String createTime;
    private String updateTime;

    // 图片服务器地址
    private String imageHost;

    // 父分类id
    private Integer parentCategoroyId;

    public Integer getId() {
        return id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getMainImage() {
        return mainImage;
    }

    public String getSubImages() {
        return subImages;
    }

    public String getDetail() {
        return detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getStatus() {
        return status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getImageHost() {
        return imageHost;
    }

    public Integer getParentCategoroyId() {
        return parentCategoroyId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public void setParentCategoroyId(Integer parentCategoroyId) {
        this.parentCategoroyId = parentCategoroyId;
    }
}
