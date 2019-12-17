package com.wilson.android_databinding.activity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.wilson.android_databinding.R;
import com.wilson.android_databinding.databinding.DataBinding2Binding;
import com.wilson.android_databinding.viewmodel.MyViewModel;


public class DataBinding2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBinding2Binding binding = DataBindingUtil.setContentView(this, R.layout.data_binding2);
        MyViewModel myViewModel = new MyViewModel();
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);

    }

}
