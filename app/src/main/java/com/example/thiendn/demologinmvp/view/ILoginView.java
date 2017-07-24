package com.example.thiendn.demologinmvp.view;

/**
 * Created by thiendn on 18/07/2017.
 */

public interface ILoginView extends IBaseView{
    void onLoginSuccess();
    void onLoginFailure();
    void onConnectToServerFail();
    void showNotValidUsernamePassword();
    void showLoadingDialog();
    void hideLoadingDialog();
    void startHomeActivity();
    void startForgotPasswordActivity();
}
