package com.example.fitfinessee.WorkoutPage;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;

import java.util.ArrayList;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder> {
    private ArrayList<Workout> workoutList;
    private int activePosition = -1;

    public WorkoutAdapter(ArrayList<Workout> workoutList) {
        this.workoutList = workoutList;
    }

    @NonNull
    @Override
    public WorkoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_item, parent, false);
        return new WorkoutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewHolder holder, int position) {
        Workout currentWorkout = workoutList.get(position);
        holder.bind(currentWorkout);

        if (position == activePosition) {
            holder.startTimer();
        } else {
            holder.stopTimer();
        }
    }

    @Override
    public int getItemCount() {

        return workoutList.size();
    }

    public void setActivePosition(int activePosition) {
        this.activePosition = activePosition;
        notifyDataSetChanged();
    }

    class WorkoutViewHolder extends RecyclerView.ViewHolder {
        TextView workoutName;
        ImageView workoutImage;
        TextView workoutNumber;
        CardView cardView;
        CountDownTimer countDownTimer;

        public WorkoutViewHolder(@NonNull View itemView) {
            super(itemView);
            workoutName = itemView.findViewById(R.id.tv_name_wo);
            workoutImage = itemView.findViewById(R.id.img_wo);
            workoutNumber = itemView.findViewById(R.id.tv_number_wo);
            cardView = itemView.findViewById(R.id.workout_card);

            countDownTimer = new CountDownTimer(3 * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    // Update UI with the time left
                    cardView.setCardBackgroundColor(Color.parseColor("#679DBB"));
                }
                @Override
                public void onFinish() {
                    // Reset UI when timer is finished
                    cardView.setCardBackgroundColor(Color.parseColor("#D8EDF8"));
                    int nextPosition = getAdapterPosition() + 1;
                    if (nextPosition < getItemCount()) {
                        setActivePosition(nextPosition);
                    }
                }
            };
        }
        public void bind(Workout workout) {
            workoutName.setText(workout.getWorkoutName());
            workoutImage.setImageResource(workout.getWorkoutImage());
            workoutNumber.setText(workout.getWorkoutNumber());
        }

        public void startTimer() {
            countDownTimer.start();
        }

        public void stopTimer() {
            countDownTimer.cancel();
            cardView.setCardBackgroundColor(Color.parseColor("#D8EDF8")); // Replace with your original color
        }
    }
}
