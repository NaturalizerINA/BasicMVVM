package com.mukminullah.mmvm.View;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.mukminullah.mmvm.Data.EntityNotes;
import com.mukminullah.mmvm.Data.RepositoryNotes;

import java.util.List;

public class NotesViewModel extends ViewModel {

    RepositoryNotes repositoryNotes;

    public NotesViewModel(RepositoryNotes repositoryNotes){
        this.repositoryNotes = repositoryNotes;
    }

    public LiveData<List<EntityNotes>> getQuotes() {return repositoryNotes.getNotes();}

    public void addNotes(EntityNotes entityNotes) {
        repositoryNotes.addNotes(entityNotes);
    }
}
