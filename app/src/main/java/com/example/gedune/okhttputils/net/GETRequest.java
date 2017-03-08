package com.example.gedune.okhttputils.net;

import okhttp3.MediaType;

/**
 * Created by gedune on 2017/3/8.
 */

public abstract class GETRequest extends BaseRequest {

    public MediaType getMediaType() {
        return null;
    }

    protected String getRequestString() {
        return null;
    }
}
