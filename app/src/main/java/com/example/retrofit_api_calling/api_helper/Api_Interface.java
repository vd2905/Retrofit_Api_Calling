package com.example.retrofit_api_calling.api_helper;

import com.example.retrofit_api_calling.models.Category;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api_Interface {
    @FormUrlEncoded
    @POST("/homeworkout/api/get_regular_category?")
    Call<Category> dataModel(@Field("user_id")String catNo);
}
