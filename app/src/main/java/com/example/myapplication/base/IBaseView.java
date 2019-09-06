package com.example.myapplication.base;

import android.app.Activity;

/**
 * View层的接口基类
 *  实现方法：
 *        1.获取Activity方法，主要用于可以不直接在presenter中创建Context对象，最大程度的防止内存泄漏
 */

public interface IBaseView {
    /**
     * 获取Activity对象
     *
     * @return activity
     */
//    Activity getActivity();     等价于下面这个
      <T extends Activity> T getActivity();   // T是继承Activity的类型参数
}
