package com.example.gedune.okhttputils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.gedune.okhttputils.module.BookDetailAction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,BookDetailAction.IGetBookCB{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                BookDetailAction.getBookkDetail("9787115448569",this);
        }
    }


    @Override
    public void onConnectSuccess(Object o) {
        textView.setText( o.toString());
    }

    @Override
    public void onConnectFailed(int code, String message) {

    }
}
