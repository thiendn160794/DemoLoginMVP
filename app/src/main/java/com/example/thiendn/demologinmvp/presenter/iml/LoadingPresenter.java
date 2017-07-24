package com.example.thiendn.demologinmvp.presenter.iml;

import com.example.thiendn.demologinmvp.model.local.sharePref.SharedPreferenceRepository;
import com.example.thiendn.demologinmvp.presenter.ILoadingPresenter;
import com.example.thiendn.demologinmvp.view.ILoadingView;

/**
 * Created by thiendn on 19/07/2017.
 */

public class LoadingPresenter implements ILoadingPresenter {
    ILoadingView mLoadingView;

    public LoadingPresenter(ILoadingView loadingView){
        mLoadingView = loadingView;
    }

    @Override
    public void checkUserLoginBefore() {
        String authenKey = SharedPreferenceRepository.getAuthenticationKey(mLoadingView.getContext());
        if (authenKey.equals("")){
            mLoadingView.startLoginActivity();
        }else {
            mLoadingView.startHomeActivity();
        }
    }

    @Override
    public void onDetach() {
        mLoadingView = null;
    }
}
