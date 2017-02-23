package com.pengyuming.recyclerviewedittextdemo;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * @author pengyuming
 * @version 1.0
 * @Package com.pengyuming.myapplication.demo
 * @Description: TODO (用一句话描述该文件做什么) Date: 2017-02-23  09:51
 */
public class DemoListAdapter extends BaseQuickAdapter<DemoBean, BaseViewHolder> {


    public DemoListAdapter() {
        super(R.layout.list_demo_item);
    }

    private OnItemEditTextChangedListener mListener;

    public void setListener(OnItemEditTextChangedListener listener) {
        mListener = listener;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final DemoBean item) {
        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.et_age, item.getAge());
        EditText etAge = helper.getView(R.id.et_age);
        etAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mListener.onEditTextAfterTextChanged(s, helper.getLayoutPosition());
            }
        });
    }

    public interface OnItemEditTextChangedListener {
        void onEditTextAfterTextChanged(Editable editable, int position);
    }
}
