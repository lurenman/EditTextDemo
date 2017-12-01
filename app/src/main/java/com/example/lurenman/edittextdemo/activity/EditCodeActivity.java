package com.example.lurenman.edittextdemo.activity;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lurenman.edittextdemo.R;

/**
 * @author: baiyang.
 * Created on 2017/12/1.
 */

public class EditCodeActivity extends BaseActivity {

    private EditText et_Special_demand;
    private TextView tv_length;
    // 字段最大长度
    private int maxLen = 100;
    private Button bt_hide;

    @Override
    protected void initViews() {
        setContentView(R.layout.activity_editcode);
        et_Special_demand = (EditText) findViewById(R.id.et_Special_demand);
        bt_hide = (Button) findViewById(R.id.bt_hide);
        tv_length = (TextView) findViewById(R.id.tv_length);
    }

    @Override
    protected void initVariables() {
        tv_length.setText("0/" + maxLen);
    }

    @Override
    protected void initEnvent() {
        super.initEnvent();
        et_Special_demand.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Editable editable = et_Special_demand.getText();
                int len = editable.length();
                if (len > maxLen) {
                    int selEndIndex = Selection.getSelectionEnd(editable);
                    String str = editable.toString();
                    // 截取新字符串
                    String newStr = str.substring(0, maxLen);
                    et_Special_demand.setText(newStr);
                    editable = et_Special_demand.getText();

                    // 新字符串的长度
                    int newLen = editable.length();
                    // 旧光标位置超过字符串长度
                    if (selEndIndex > newLen) {
                        selEndIndex = editable.length();
                    }
                    // 设置新光标所在的位置
                    Selection.setSelection(editable, selEndIndex);

                } else {
                    tv_length.setText(len + "/" + maxLen);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        bt_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftInput();
            }
        });

    }

    @Override
    protected void loadData() {

    }
    //隐藏键盘
    private void hideSoftInput()
    {
        View curView = getCurrentFocus();
        boolean calculationing = false;
        switch (curView.getId()) {
            case R.id.et_Special_demand:
                calculationing = true;
            break;

        }
        if (calculationing) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(curView.getWindowToken(), 0);
        }
    }
}
