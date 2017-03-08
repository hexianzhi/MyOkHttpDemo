package com.example.gedune.okhttputils.module;


import com.example.gedune.okhttputils.Bean.BookBean;
import com.example.gedune.okhttputils.net.GETRequest;
import com.example.gedune.okhttputils.net.HttpMethod;

/**
 * Created by gedune on 2017/2/4.
 */

public class BookDetailTask extends GETRequest {
    private String mIsbn;

    public BookDetailTask(String isbn ) {
        super( );
        mIsbn = isbn;
    }

    @Override
    public String getApi() {
        return "/isbn/" + mIsbn;
    }

    @Override
    public int getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    public Class getModelClass() {
        return BookBean.class;
    }

}
