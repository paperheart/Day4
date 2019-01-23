package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id") private int student_id;
    @SerializedName("user_name") private String user_name;
    @SerializedName("image_url") private Url image_url;
    @SerializedName("video_url") private Url video_url;

    public int getStudent_id() {
        return student_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public Url getImage_url() {
        return image_url;
    }

    public Url getVideo_url() {
        return video_url;
    }
}
