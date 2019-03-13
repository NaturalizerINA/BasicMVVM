package com.mukminullah.mmvm.Util;

import com.mukminullah.mmvm.Data.DatabaseNotes;
import com.mukminullah.mmvm.Data.RepositoryNotes;
import com.mukminullah.mmvm.View.NotesViewModelFactory;

public class InjectorNotes {
    public static NotesViewModelFactory provideNotesViewModelFactory() {
        RepositoryNotes repositoryNotes = RepositoryNotes.getInstance(DatabaseNotes.getInstance().notesDAO);
        return new NotesViewModelFactory(repositoryNotes);
    }
}
