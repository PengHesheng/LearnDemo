package com.example.hp.mvp_rx_retrofit.base;

/**
 * 描述：视图基类
 * Created by HP on 2017/5/4.
 */

public interface IBaseView<T> {
    /**
     * @descriptoin	请求前加载progress
     */
    void showProgress();

    /**
     * @descriptoin	请求结束之后隐藏progress
     */
    void disimissProgress();

    /**
     * @descriptoin	请求数据成功
     * @param tData 数据类型
     */
    void loadDataSuccess(T tData);

    /**
     * @descriptoin	请求数据错误
     * @param throwable 异常类型
     */
    void loadDataError(Throwable throwable);
}
