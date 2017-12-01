package com.example.lurenman.edittextdemo.activity;

import android.widget.EditText;

import com.example.lurenman.edittextdemo.R;

/**
 * @author: baiyang.
 * Created on 2017/12/1.
 * 参考
 * http://blog.csdn.net/twoicewoo/article/details/7384398
 * http://www.jb51.net/article/56043.htm
 */

public class WindowSoftInputModeActivity extends BaseActivity {

    private EditText et_WindowSoftInputMode;

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_windowsoftinputmkode);
        et_WindowSoftInputMode = (EditText) findViewById(R.id.et_WindowSoftInputMode);
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void loadData() {

    }
}
