package com.wilson.android_databinding.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.os.Bundle;

import com.wilson.android_databinding.R;
import com.wilson.android_databinding.databinding.DataBindingBinding;
import com.wilson.android_databinding.model.User;


public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.data_binding);
        User user = new User("wilson", 11);
        binding.setUser(user);
        binding.setLifecycleOwner(this);



    }
}
