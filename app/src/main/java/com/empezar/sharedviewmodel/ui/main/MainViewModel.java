package com.empezar.sharedviewmodel.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    MutableLiveData<String> data = new MutableLiveData<>();

    public void sendMessage(String text) {
        data.setValue(text);
    }
}