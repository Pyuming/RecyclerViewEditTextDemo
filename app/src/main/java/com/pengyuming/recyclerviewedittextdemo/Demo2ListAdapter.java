package com.pengyuming.recyclerviewedittextdemo;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * @author pengyuming
 * @version 1.0
 * @Package com.pengyuming.myapplication.demo
 * @Description: TODO (用一句话描述该文件做什么) Date: 2017-02-23  09:51
 */
public class Demo2ListAdapter extends BaseQuickAdapter<DemoBean2, BaseViewHolder> {


    public Demo2ListAdapter() {
        super(R.layout.list_demo2_item);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final DemoBean2 item) {
        helper.setText(R.id.btn_name, item.getName());
        helper.setVisible(R.id.btn_name, !item.isShow());
        helper.addOnClickListener(R.id.iv_icon);
    }

}
