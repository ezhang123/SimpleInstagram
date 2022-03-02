package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tIkpMkv0SZSwanY1TuwkE67HgdkZOODAGe68mY0Q")
                .clientKey("PazlVSd1NQoHs5PbFaJcZefb96oF7XFVWJXsUXpD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
