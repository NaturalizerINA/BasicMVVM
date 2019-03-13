package com.mukminullah.mmvm.Data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class DAONotes {
    List<EntityNotes> notesList = new ArrayList<>();

    MutableLiveData<List<EntityNotes>> notes = new MutableLiveData<>();

    public DAONotes() {
        notes.setValue(notesList);
    }

    public void addNotes(EntityNotes entityNotes){
        notesList.add(entityNotes);
        notes.setValue(notesList);
    }

    public LiveData<List<EntityNotes>> getNotes() { return notes; }
}
