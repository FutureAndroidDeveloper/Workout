package com.example.kirill.workout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutId;


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            Workout workout = Workout.workouts[(int) workoutId];
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            TextView description = (TextView) view.findViewById(R.id.textDescription);

            title.setText(workout.getName());
            description.setText(workout.getDescription());
        }
    }

    public void setWorkoutId(long id) {
        this.workoutId = id;
    }
}
