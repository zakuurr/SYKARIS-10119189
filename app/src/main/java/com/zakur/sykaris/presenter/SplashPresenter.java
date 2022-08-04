package com.zakur.sykaris.presenter;

import android.content.Context;
import android.content.Intent;

import com.zakur.sykaris.activities.SlideActivity;
import com.zakur.sykaris.activities.SplashActivity;

public class SplashPresenter {
    Context context;

    public SplashPresenter(SplashActivity splashActivity) {
    }

    Intent getSlide = new Intent();

    public Intent setSlide() {
        Intent intent = new Intent(context, SlideActivity.class);
        return intent;
    }
}
