package jacobsen.woinfo.androidroomdatabase.database;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;
import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jacobsen.woinfo.androidroomdatabase.model.Exercise;


@Database(entities = {Exercise.class}, version = 1, exportSchema = false)
abstract class ExerciseRoomDatabase extends RoomDatabase {

    abstract ExerciseDao exerciseDao();

    private static volatile ExerciseRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;


    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static ExerciseRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ExerciseRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ExerciseRoomDatabase.class, "exercise_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);

            databaseWriteExecutor.execute(() -> {
                ExerciseDao dao = INSTANCE.exerciseDao();
                dao.deleteAll();

                ArrayList<Exercise> exerciseArrayList = Exercise.fillExerciseArrayList();

                for (Exercise e : exerciseArrayList) {
                    dao.insertExercise(e);
                }
            });


        }
    };
}