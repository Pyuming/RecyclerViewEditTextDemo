package com.pengyuming.recyclerviewedittextdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_rv_et)
    public void onClick1() {
        startActivity(new Intent(this, RecyclerViewEditTextActivity.class));
    }


    @OnClick(R.id.btn_rv_gv)
    public void onClick2() {
        startActivity(new Intent(this, RecyclerViewChildGVActivity.class));
    }
}
