package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by chen on 2018/10/11.
 */

public class HttpUtil {
    //用sendOKHttpRequest发布一条Http请求，传入请求地址，并注册一个回调处理服务器响应的量
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
