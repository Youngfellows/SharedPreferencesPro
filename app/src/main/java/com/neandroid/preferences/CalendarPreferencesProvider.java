package com.neandroid.preferences;

import com.neandroid.calendar.preferences.PreferencesProvider;


public class CalendarPreferencesProvider extends PreferencesProvider {

    private String CALENDAR_PREFERENCES_PROVIDER_AUTHORITIES = "com.neandroid.preferences.CalendarPreferencesProvider";

    @Override
    public String getAuthorities() {
        return CALENDAR_PREFERENCES_PROVIDER_AUTHORITIES;
    }
}
