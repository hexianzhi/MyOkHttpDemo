package com.example.gedune.okhttputils.net;

/**
 * Created by zw on 16/10/29.
 */
public interface ResponseCode {
    public static final int SUCCESS = 200;

    public static final int FAILED = 2;
    //其他内部错误
    public static final int ERROR = 404;
    public static final int NET_ERROR = -200;
    /***
     * json格式错误
     */
    public static final int JSON_ERROR = -201;


}
