package jacobsen.woinfo.androidroomdatabase.database;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import jacobsen.woinfo.androidroomdatabase.model.Exercise;

public class ExerciseViewModel extends AndroidViewModel {

    private ExerciseRepository mRepository;

    private LiveData<List<Exercise>> mAllExercises;

    public ExerciseViewModel(Application application) {
        super(application);
        mRepository = new ExerciseRepository(application);
        mAllExercises = mRepository.getAllExercises();
    }

    public LiveData<List<Exercise>> getAllExercises() {
        return mAllExercises;
    }

    public void insertExercise(Exercise exercise) {
        mRepository.insertExercise(exercise);
    }
}