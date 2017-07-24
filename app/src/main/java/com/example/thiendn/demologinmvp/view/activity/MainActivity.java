package com.example.thiendn.demologinmvp.view.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thiendn.demologinmvp.R;
import com.example.thiendn.demologinmvp.presenter.ILoadingPresenter;
import com.example.thiendn.demologinmvp.presenter.iml.LoadingPresenter;
import com.example.thiendn.demologinmvp.view.ILoadingView;


public class MainActivity extends AppCompatActivity implements ILoadingView{
    ILoadingPresenter mLoadingPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoadingPresenter = new LoadingPresenter(this);
        mLoadingPresenter.checkUserLoginBefore();
    }

    @Override
    public void startLoginActivity() {
        startActivity(new Intent(this, LoginActivity.class));
        this.finish();
    }

    @Override
    public void startHomeActivity() {
        startActivity(new Intent(this, HomeActivity.class));
        this.finish();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
