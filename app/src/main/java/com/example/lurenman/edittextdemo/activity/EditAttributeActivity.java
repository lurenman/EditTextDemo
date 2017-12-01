package com.example.lurenman.edittextdemo.activity;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

import com.example.lurenman.edittextdemo.R;

/**
 * @author: baiyang.
 * Created on 2017/12/1.
 */

public class EditAttributeActivity extends BaseActivity {

    private EditText et_password;

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_editattribute);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    @Override
    protected void initVariables() {
        //发现这种代码方式的设置照android password xml中的设置（不同：字符间距变小，达到最大字符的时候是从头再来，然而xml中是追加）
        //et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());

    }

    @Override
    protected void initEnvent() {
        super.initEnvent();


    }

    @Override
    protected void loadData() {

    }
}
