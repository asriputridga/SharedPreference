package com.asriputridga.notes;

import com.asriputridga.notes.Model.Note;
import com.asriputridga.notes.Model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private  static List<User> users;
    private static  List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("Asri", "123"));
        users.add(new User("lala", "poo"));
        users.add(new User("nash", "wkwk"));

        notes = new ArrayList<>();
        notes.add(new Note("Andromax", new Date(), "merk"));
        notes.add(new Note("Retak", new Date(), "mungkin ini novel"));
        notes.add(new Note("Thug live", new Date(), "hehe"));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}
