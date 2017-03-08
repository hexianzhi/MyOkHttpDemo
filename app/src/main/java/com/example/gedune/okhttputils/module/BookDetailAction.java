package com.example.gedune.okhttputils.module;

import com.example.gedune.okhttputils.net.BaseRequest;
import com.example.gedune.okhttputils.net.HttpCallback;

/**
 * Created by gedune on 2/24/2017.
 */

public class BookDetailAction {

    public static void getBookkDetail(String result, final IGetBookCB cb ) {
        final BookDetailTask task = new BookDetailTask(result);
        task.enqueue(new HttpCallback() {
            @Override
            public void onResponse(BaseRequest request, Object data) {
                if (cb != null) {
                    cb.onConnectSuccess(data);
                }
            }

            @Override
            public void onFailure(BaseRequest request, Exception e, int code, String message) {
                if (cb !=null){
                    cb.onConnectFailed(code,message);
                }
            }
        });

    }

    public  interface IGetBookCB {
         void onConnectSuccess(Object o);

         void onConnectFailed(int code, String message);
    }

}
