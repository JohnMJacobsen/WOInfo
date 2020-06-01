package jmjacobsen.woinfo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import jacobsen.woinfo.androidroomdatabase.database.ExerciseViewModel;
import jacobsen.woinfo.androidroomdatabase.model.Exercise;

public class ListedWorkoutsActivity extends AppCompatActivity {

    private ExerciseViewModel mExerciseViewModel;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String category = getIntent().getStringExtra("category");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_exercise);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Get a new or existing ViewModel from the ViewModelProvider.
        mExerciseViewModel = new ViewModelProvider(this).get(ExerciseViewModel.class);

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.
        mExerciseViewModel.getAllExercises().observe(this, new Observer<List<Exercise>>() {
            @Override
            public void onChanged(@Nullable final List<Exercise> words) {
                adapter.setExercises(words);
            }
        });
    }
}