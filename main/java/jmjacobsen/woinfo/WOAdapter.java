package jmjacobsen.woinfo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import jacobsen.woinfo.androidroomdatabase.model.Exercise;


public class WOAdapter extends RecyclerView.Adapter<WOAdapter.ExerciseViewHolder> {

    class ExerciseViewHolder extends RecyclerView.ViewHolder {

        private final ImageView exerciseEquipmentView;
        private final TextView exerciseNameView;
        private final TextView exerciseMuscleGroupsView;

        private ExerciseViewHolder(View itemView) {
            super(itemView);
            exerciseEquipmentView = itemView.findViewById(R.id.equipment_icon);
            exerciseNameView = itemView.findViewById(R.id.exercise_name);
            exerciseMuscleGroupsView = itemView.findViewById(R.id.muscle_groups);
        }
    }

    private final LayoutInflater mInflater;
    private List<Exercise> mExercises;

    WOAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    @NonNull
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.listed_workout_item, parent, false);
        return new ExerciseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        if (mExercises != null) {
            Exercise current = mExercises.get(position);
            if (current.getEquipment().contains("thing1")) {
                holder.exerciseEquipmentView.setImageResource(R.drawable.ic_launcher_background);
            }
            else if (current.getEquipment().contains("thing2")) {
                holder.exerciseEquipmentView.setImageResource(R.drawable.ic_launcher_foreground);
            }
            else {
                holder.exerciseEquipmentView.setImageResource(R.drawable.ic_launcher_foreground);
            }
            holder.exerciseNameView.setText(current.getName());
            holder.exerciseMuscleGroupsView.setText(current.getShortGroups());
        } else {
            throw new RuntimeException("No data");
        }
    }

    void setExercises(List<Exercise> exercises) {
        mExercises = exercises;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mExercises != null)
            return mExercises.size();
        else return 0;
    }
}
