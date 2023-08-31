
package com.example.retrofit_api_calling.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("create")
    @Expose
    private List<Create> create;
    @SerializedName("update")
    @Expose
    private List<Object> update;
    @SerializedName("delete")
    @Expose
    private List<Object> delete;

    public List<Create> getCreate() {
        return create;
    }

    public void setCreate(List<Create> create) {
        this.create = create;
    }

    public List<Object> getUpdate() {
        return update;
    }

    public void setUpdate(List<Object> update) {
        this.update = update;
    }

    public List<Object> getDelete() {
        return delete;
    }

    public void setDelete(List<Object> delete) {
        this.delete = delete;
    }

}
