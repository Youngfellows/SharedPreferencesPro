package com.neandroid.preferences;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.neandroid.calendar.preferences.PreferencesProviderUtils;

public class MyService extends Service {

    private String TAG = this.getClass().getSimpleName();

    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();

        PreferencesProviderUtils.putString(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "stringKey", "stringValue2");

        String stringResult = PreferencesProviderUtils.getString(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "stringKey", "");
        Log.e(TAG, "stringResult = " + stringResult);

        boolean booleanResult = PreferencesProviderUtils.getBoolean(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "booleanKey", false);
        Log.e(TAG, "booleanResult = " + booleanResult);

        float floatResult = PreferencesProviderUtils.getFloat(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "floatKey", 0f);
        Log.e(TAG, "floatResult = " + floatResult);

        float intResult = PreferencesProviderUtils.getInt(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "intKey", 0);
        Log.e(TAG, "intResult = " + intResult);

        float longResult = PreferencesProviderUtils.getLong(getApplicationContext(), PreferencesConfig.SHARED_PREFS_NAME, "longKey", 0l);
        Log.e(TAG, "longResult = " + longResult);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
