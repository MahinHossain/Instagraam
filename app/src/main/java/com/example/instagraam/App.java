package com.example.instagraam;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RQ0nZ1kUmU1F37X4GHTxq2Gg9xqSomogHaDQjyjP")
                // if defined
                .clientKey("QVCrANVnN4D36m8tsrYkG0yCdYkeCMf1jUvikUUx")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}