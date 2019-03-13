package com.mukminullah.mmvm.Data;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class RepositoryNotes {

    public static DAONotes daoNotes;

    public static RepositoryNotes instance = null;

    public RepositoryNotes(DAONotes daoNotes) {
        this.daoNotes = daoNotes;
    }

    public void addNotes(EntityNotes entityNotes){
        this.daoNotes.addNotes(entityNotes);
    }

    public LiveData<List<EntityNotes>> getNotes() { return daoNotes.getNotes(); }

    public static RepositoryNotes getInstance(DAONotes daoNotes) {
        return (instance == null)? instance = new RepositoryNotes(daoNotes) : instance;
    }
}
