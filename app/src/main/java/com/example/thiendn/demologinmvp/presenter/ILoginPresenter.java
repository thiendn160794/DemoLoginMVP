package com.example.thiendn.demologinmvp.presenter;

/**
 * Created by thiendn on 18/07/2017.
 */

public interface ILoginPresenter extends IBasePresenter{
    void doLogin(String username, String password);
}
