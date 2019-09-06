package com.example.myapplication.mvp.view;

import android.app.Activity;

import com.example.myapplication.base.IBasePresenter;
import com.example.myapplication.base.IBaseView;

public abstract class BaseView <P extends IBasePresenter> extends Activity implements IBaseView {
    private P presenter;

    /**
     * 创建Presenter
     *
     * @return
     */
    public abstract P onCreatePresenter();

    /**
     * 在需要获取Presenter对象时才调用创建方法创建Presenter,起到懒加载的作用
     */
    public P getPresenter(){
        if(presenter==null){
         presenter=onCreatePresenter();
        }
        return presenter;
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /**
         * 在一个Presenter生命周期结束的时候，将presenter和view之间的联系断开，防止出现内存泄漏
         */
         if(presenter!=null){
             presenter.detachView();
         }
    }
}
