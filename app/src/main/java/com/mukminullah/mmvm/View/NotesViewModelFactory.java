package com.mukminullah.mmvm.View;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.mukminullah.mmvm.Data.RepositoryNotes;

public class NotesViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    RepositoryNotes repositoryNotes;

    public NotesViewModelFactory(RepositoryNotes repositoryNotes) {
        this.repositoryNotes = repositoryNotes;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new NotesViewModel(repositoryNotes);
    }
}
