package com.mukminullah.mmvm.View;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.mukminullah.mmvm.Data.EntityNotes;
import com.mukminullah.mmvm.R;
import com.mukminullah.mmvm.Util.InjectorNotes;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_output;
    EditText et_title, et_notes;
    NotesViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUnit();
    }

    public void initializeUnit() {

        tv_output = findViewById(R.id.tv_output);
        et_title = findViewById(R.id.et_title);
        et_notes = findViewById(R.id.et_notes);

        NotesViewModelFactory factory = InjectorNotes.provideNotesViewModelFactory();
        viewModel = ViewModelProviders.of(this, factory).get(NotesViewModel.class);

        viewModel.getQuotes().observe(this, new Observer<List<EntityNotes>>() {
            @Override
            public void onChanged(@Nullable List<EntityNotes> entityNotes) {
                String output = "";
                for (EntityNotes item : entityNotes) {
                    output += item.toString() + "\n\n";
                }
                tv_output.setText(output);
            }
        });

    }

    public void clickSave(View view) {
        EntityNotes notes = new EntityNotes(et_title.getText().toString(), et_notes.getText().toString());
        viewModel.addNotes(notes);
        et_notes.setText("");
        et_title.setText("");
    }
}
