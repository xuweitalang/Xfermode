package com.netease.paint.colorfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.netease.paint.colorfilter.xfermode.XfermodeEraserView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new ColorFilterView(this));
        setContentView(new XfermodeEraserView(this));
    }
}
