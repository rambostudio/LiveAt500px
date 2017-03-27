package com.example.rambo.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rambo on 27/3/2560.
 */

public class PhotoItemCollectionDao {
    @SerializedName("success")
    private boolean succcess;
    @SerializedName("data")
    private List<PhotoItemDao> data;

    public boolean isSucccess() {
        return succcess;
    }

    public void setSucccess(boolean succcess) {
        this.succcess = succcess;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }
}
