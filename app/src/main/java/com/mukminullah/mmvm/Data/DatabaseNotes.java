package com.mukminullah.mmvm.Data;

public class DatabaseNotes {
    public static DatabaseNotes instance = null;
    public DAONotes notesDAO = new DAONotes();

    public static DatabaseNotes getInstance() {
        return (instance == null) ? instance = new DatabaseNotes() : instance;
    }
}
