package com.asriputridga.notes;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Setting {
    private  SharedPreferences preferences;

    public Setting(Context context){
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
    public String getUser() {
        return preferences.getString(Constant.SESSION, null);
    }

    public void setUser(String user) {
        preferences.edit()
                .putString(Constant.SESSION, user)
                .apply();
    }

    public void removeUser() {
        preferences.edit()
                .remove(Constant.SESSION)
                .apply();
    }
}
