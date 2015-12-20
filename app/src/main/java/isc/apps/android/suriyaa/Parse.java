package isc.apps.android.suriyaa;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class Parse extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, Keys.applicationId, Keys.clientKey);
	ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}