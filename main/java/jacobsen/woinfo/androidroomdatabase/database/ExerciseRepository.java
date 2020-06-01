package jacobsen.woinfo.androidroomdatabase.database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import jacobsen.woinfo.androidroomdatabase.model.Exercise;

class ExerciseRepository {

    private ExerciseDao mExerciseDao;
    private LiveData<List<Exercise>> mAllExercises;

    ExerciseRepository(Application application) {
        ExerciseRoomDatabase db = ExerciseRoomDatabase.getDatabase(application);
        mExerciseDao = db.exerciseDao();
        mAllExercises = mExerciseDao.getAllExercises();
    }



    LiveData<List<Exercise>> getAllExercises() {
        return mAllExercises;
    }


    void insertExercise(Exercise exercise) {
        ExerciseRoomDatabase.databaseWriteExecutor.execute(() -> mExerciseDao.insertExercise(exercise));
    }
}