package com.asriputridga.notes;

import com.asriputridga.notes.Model.User;

public class Session {
    private Setting setting;
    private String user;

    public Session(Setting setting) {
        this.setting = setting;
        user = setting.getUser();
    }

    public User doLogin(String username, String password) {
        User foundUser = null;
        for (User user : Data.getUsers()) {
            if (username.equals(user.getUsername())
                    && password.equals(user.getPassword())) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    public void doLogout() {
        setting.removeUser();
        this.user = null;
    }

    public boolean isLogin() {
        return user != null;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        setting.setUser(user);
        this.user = user;
    }
}
