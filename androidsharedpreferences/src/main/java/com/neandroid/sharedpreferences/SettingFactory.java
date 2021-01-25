package com.neandroid.sharedpreferences;

import android.content.Context;

/**
 * ISettings的工厂类，避免外部直接依赖他的实现类
 */
public final class SettingFactory {

    private static final String SHARED_PREFS_NAME = "com.android.calendar_preferences";

    private SettingFactory() {

    }

    public static ISetting newInstance(Context context, String name) {
        return new PreferencesSettingImpl(context, name);
    }

    private static ISetting setting;

    public static ISetting getInstance(Context context) {
        if (setting == null) {
            synchronized (SettingFactory.class) {
                if (setting == null) {
                    setting = new PreferencesSettingImpl(context, SHARED_PREFS_NAME);
                }
            }
        }
        return setting;
    }
}
