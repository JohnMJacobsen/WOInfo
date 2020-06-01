package jacobsen.woinfo.androidroomdatabase.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import jacobsen.woinfo.androidroomdatabase.model.Exercise;

@Dao
public interface ExerciseDao {

    @Query("SELECT * FROM exercises WHERE name=:exName")
    LiveData<List<Exercise>> getExerciseByName(String exName);

    @Query("SELECT * FROM exercises ORDER BY name ASC")
    LiveData<List<Exercise>> getAllExercises();

    @Insert
    void insertExercise(Exercise exercise);

    @Update
    void updateExercise(Exercise... exercises);

    @Query("DELETE FROM exercises")
    void deleteAll();

}