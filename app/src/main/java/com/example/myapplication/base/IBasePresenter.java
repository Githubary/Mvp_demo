package com.example.myapplication.base;

/**
 * Presenter层的接口基类
 *
 * 实现方法：
 *          1、判断view连接
 *          2、断开view连接
 */


public interface IBasePresenter {
    /**
     * 用于判断presenter是否与view建立联系，防止出现内存泄漏
     *
     * @return{@code true}:联系已建立
     * @return{@code false}:联系已断开
     */

     boolean isViewAttach();

    /**
     * 用于断开与view之间的连接
     */

    void detachView();

}
