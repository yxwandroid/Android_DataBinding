package com.wilson.android_databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {


    String name;
    int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
         notifyChange();
//        notifyPropertyChanged(BR.m);
    }

    @Bindable
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
        notifyChange();
    }


    public void update() {
        this.name = "wilson yang";
        this.age = 1232;
        notifyChange();
    }


}
