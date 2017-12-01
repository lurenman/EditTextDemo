package com.example.lurenman.edittextdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lurenman.edittextdemo.activity.EditAttributeActivity;
import com.example.lurenman.edittextdemo.activity.EditCodeActivity;
import com.example.lurenman.edittextdemo.activity.WindowSoftInputModeActivity;

public class MainActivity extends AppCompatActivity {

    private Button bt_editAttribute;
    private Button bt_editCode;
    private Button bt_windowSoftInputMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
    }

    private void initViews() {
        bt_editAttribute = (Button) findViewById(R.id.bt_editAttribute);
        bt_editCode = (Button) findViewById(R.id.bt_editCode);
        bt_windowSoftInputMode = (Button) findViewById(R.id.bt_windowSoftInputMode);

    }

    private void initEvents() {
        bt_editAttribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditAttributeActivity.class);
                startActivity(intent);

            }
        });
        bt_editCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditCodeActivity.class);
                startActivity(intent);
            }
        });
        bt_windowSoftInputMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WindowSoftInputModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
