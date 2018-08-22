package com.funnyApp.data.remote;


import com.funnyApp.helper.Tags;

/**
 * Created by android on 4/25/17.
 */

public class ApiUtils {
    public static final String BASE_URL= Tags.Url;
    public static appService getAppService(){
        appService retrofitClient= RetrofitClient.getClient(BASE_URL).create(appService.class);

    return retrofitClient;
    }
}
