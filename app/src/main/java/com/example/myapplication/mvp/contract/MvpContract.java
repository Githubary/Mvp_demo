package com.example.myapplication.mvp.contract;

import android.net.http.HttpResponseCache;

import com.example.myapplication.Listener.HttpResponseListener;
import com.example.myapplication.base.IBaseView;

import javax.net.ssl.HttpsURLConnection;

public interface MvpContract {

    interface Model {
        void login(String username, String password, HttpResponseListener callbak);
    }


    /**
     * view接口继承基层view接口
     */
    interface View extends IBaseView {
        /**
         * 登录成功
         */
        void loginSuccess();

        /**
         * 登录失败
         */
        void loginFailure();
    }

    interface Presenter {
    }
}
