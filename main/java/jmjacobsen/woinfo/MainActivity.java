package jmjacobsen.woinfo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import jacobsen.woinfo.androidroomdatabase.database.ExerciseViewModel;
import jacobsen.woinfo.androidroomdatabase.model.Exercise;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ExerciseViewModel mExerciseViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mChestView =  findViewById(R.id.main_menu_chest);
        TextView mCoreView = findViewById(R.id.main_menu_core);
        TextView mArmsView = findViewById(R.id.main_menu_arms);
        TextView mUpperView = findViewById(R.id.main_menu_upper);
        TextView mLegsView = findViewById(R.id.main_menu_legs);
        TextView mBackView = findViewById(R.id.main_menu_back);

        mChestView.setOnClickListener(this);
        mCoreView.setOnClickListener(this);
        mArmsView.setOnClickListener(this);
        mUpperView.setOnClickListener(this);
        mLegsView.setOnClickListener(this);
        mBackView.setOnClickListener(this);

    }

    public void launchIntentWithCategory(String category) {
        Intent listedWorkoutsIntent = new Intent(MainActivity.this, ListedWorkoutsActivity.class);
        listedWorkoutsIntent.putExtra("category", category);
        startActivity(listedWorkoutsIntent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_menu_chest:
                Toast.makeText(this, "Chest Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Chest");
                break;
            case R.id.main_menu_core:
                Toast.makeText(this, "Core Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Core");
                break;
            case R.id.main_menu_arms:
                Toast.makeText(this, "Arms Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Arms");
                break;
            case R.id.main_menu_upper:
                Toast.makeText(this, "Upper Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Upper");
                break;
            case R.id.main_menu_legs:
                Toast.makeText(this, "Legs Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Legs");
                break;
            case R.id.main_menu_back:
                Toast.makeText(this, "Back Launched", Toast.LENGTH_SHORT).show();
                launchIntentWithCategory("Back");
                break;
        }
    }
}
