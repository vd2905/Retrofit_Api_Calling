
package com.example.retrofit_api_calling.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Create {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cat_icon")
    @Expose
    private String catIcon;
    @SerializedName("cat_name")
    @Expose
    private String catName;
    @SerializedName("cat_type")
    @Expose
    private String catType;
    @SerializedName("week")
    @Expose
    private String week;
    @SerializedName("is_price")
    @Expose
    private String isPrice;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("exercise_type")
    @Expose
    private String exerciseType;
    @SerializedName("short_desc")
    @Expose
    private String shortDesc;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("is_deleted")
    @Expose
    private String isDeleted;
    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;
    @SerializedName("is_unlock")
    @Expose
    private String isUnlock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getIsPrice() {
        return isPrice;
    }

    public void setIsPrice(String isPrice) {
        this.isPrice = isPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getIsUnlock() {
        return isUnlock;
    }

    public void setIsUnlock(String isUnlock) {
        this.isUnlock = isUnlock;
    }

}
