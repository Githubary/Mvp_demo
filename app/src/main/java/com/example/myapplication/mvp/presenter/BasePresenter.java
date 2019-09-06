package com.example.myapplication.mvp.presenter;

import androidx.annotation.NonNull;

import com.example.myapplication.base.IBasePresenter;
import com.example.myapplication.base.IBaseView;

import java.lang.ref.WeakReference;

public class BasePresenter<V extends IBaseView> implements IBasePresenter {

    //防止view层中的Activity不走onDestroy()方法，所以采用弱引用来防止内存泄漏
    private WeakReference<V> viewRef;

    /**
     *将连接到的view对象建立为弱引用对象
     * @param view
     */
    public void attachView(V view){
        viewRef= new WeakReference<>(view);
    }

    /**
     *构造函数，在该基类实现时，直接执行获取view对象，@NonNull保证获取对象不为空
     * @param view
     */
    public BasePresenter(@NonNull V view){
        attachView(view);
    }

    /**
     *获取弱引用对象
     * @return
     */
    public V getView(){
        return viewRef.get();
    }

    @Override
    public boolean isViewAttach() {
        return viewRef!=null && viewRef.get()!=null;
    }

    @Override
    public void detachView() {
        if(viewRef!=null){
            viewRef.clear();
            viewRef=null;
        }
    }
}
