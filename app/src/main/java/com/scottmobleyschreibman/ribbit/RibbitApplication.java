package com.scottmobleyschreibman.ribbit;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Owner on 1/1/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public  void onCreate(){
        super.onCreate();
    Parse.enableLocalDatastore(this);

    Parse.initialize(this, "271mH3IB373oi7QvQphsRBjB3wvBaIoAYyrJwAKn", "i33rqcUudqgmfUiA90uyiHZQAHwFqUh1iyTUH2eA");
    }
}
