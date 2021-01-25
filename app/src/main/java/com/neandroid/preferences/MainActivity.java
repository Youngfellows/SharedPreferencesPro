package com.neandroid.preferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neandroid.calendar.preferences.PreferencesProviderUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreferencesProviderUtils.putString(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "stringKey", "stringValue1");
        PreferencesProviderUtils.putBoolean(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "booleanKey", true);
        PreferencesProviderUtils.putFloat(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "floatKey", 0.13f);
        PreferencesProviderUtils.putInt(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "intKey", 8);
        PreferencesProviderUtils.putLong(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "longKey", 4l);
        PreferencesProviderUtils.remove(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "longKey");

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
