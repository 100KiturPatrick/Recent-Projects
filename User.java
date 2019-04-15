package com.example.loginappexample;

import com.google.gson.annotations.SerializedName;

public class User
{
    @SerializedName("response")
    private String response;
    @SerializedName("name")
    private String Name;

    public String getResponse(){
        return response;
    }
    String getName(){
        return Name;
    }

}
