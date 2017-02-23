package com.pengyuming.recyclerviewedittextdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewChildGVActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private Demo2ListAdapter mDemo2ListAdapter;

    private List<DemoBean2> mDemoBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_child_gv);
        ButterKnife.bind(this);

        mDemo2ListAdapter = new Demo2ListAdapter();
        mRecyclerView.setAdapter(mDemo2ListAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addOnItemTouchListener(new OnItemChildClickListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onSimpleItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                switch (view.getId()) {
                    case R.id.iv_icon:
                        DemoBean2 demoBean2 = mDemoBeanList.get(position);
                        demoBean2.setShow(!demoBean2.isShow());
                        mDemo2ListAdapter.notifyDataSetChanged();
                        break;
                    default:
                        break;
                }
            }
        });
        showData();
    }

    private void showData() {
        mDemoBeanList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mDemoBeanList.add(new DemoBean2("name" + i));
        }
        mDemo2ListAdapter.setNewData(mDemoBeanList);
    }
}
