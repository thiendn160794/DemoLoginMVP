package com.example.thiendn.demologinmvp.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.example.thiendn.demologinmvp.R;

/**
 * Created by thiendn on 19/07/2017.
 */

public class DialogUtils {
    public static ProgressDialog createLoadingDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        progressDialog.setContentView(R.layout.dialog_progress_loading);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
