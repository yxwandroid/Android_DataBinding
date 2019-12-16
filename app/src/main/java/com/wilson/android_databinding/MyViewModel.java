package com.wilson.android_databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {


    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNnumber() {
        if (number == null) {
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void setNnumber(MutableLiveData<Integer> nnumber) {
        number.setValue(nnumber.getValue() + 1);
    }
    public void add() {
        number.setValue(number.getValue() + 1);
    }
}
