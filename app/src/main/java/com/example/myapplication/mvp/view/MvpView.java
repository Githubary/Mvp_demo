package com.example.myapplication.mvp.view;

import android.app.Activity;

import com.example.myapplication.mvp.contract.MvpContract;

public class MvpView implements MvpContract.View {
    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFailure() {

    }

    @Override
    public <T extends Activity> T getActivity() {
        return null;
    }
}
