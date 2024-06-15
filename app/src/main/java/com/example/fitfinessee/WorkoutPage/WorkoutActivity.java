package com.example.fitfinessee.WorkoutPage;

import static android.app.PendingIntent.getActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {
    private ArrayList<Workout> workoutList = new ArrayList<>();
    private ExtendedFloatingActionButton btnMulai;
    private WorkoutAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        TextView headerWo = (TextView) findViewById(R.id.header_wo);
        Intent intent = getIntent();
        String headerText = intent.getStringExtra("teksAtas");
        headerWo.setText(headerText);

        // Set up the RecyclerView with an adapter to display the workouts
        RecyclerView recyclerView = findViewById(R.id.wo_recycler_view);
        WorkoutAdapter adapter = new WorkoutAdapter(workoutList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnMulai = findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setActivePosition(0);
                new CountDownTimer(39000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        long minutes = (millisUntilFinished / 1000) / 60;
                        long seconds = (millisUntilFinished / 1000) % 60;
                        btnMulai.setText(String.format("Waktu Tersisa: %02d:%02d", minutes, seconds));
                    }

                    public void onFinish() {
                        // Setel ulang teks tombol setelah hitungan mundur selesai
                        btnMulai.setText("Mulai");
                    }
                }.start();

            }
        });

        // Add workouts to the list
        workoutList.add(new Workout("Awkward Pose", R.drawable.img_wo_awkward, "1"));
        workoutList.add(new Workout("Camle Pose", R.drawable.img_wo_camle, "2"));
        workoutList.add(new Workout("Cat-cow", R.drawable.img_wo_catcow, "3"));
        workoutList.add(new Workout("Cobra Pose", R.drawable.img_wo_cobra, "4"));
        workoutList.add(new Workout("Easy Pose", R.drawable.img_wo_easy, "5"));
        workoutList.add(new Workout("Downward\nFacing Dog", R.drawable.img_wo_downward, "6"));
        workoutList.add(new Workout("Revolver Pose", R.drawable.img_wo_revolver, "7"));
        workoutList.add(new Workout("Seat Pose", R.drawable.img_wo_seat, "8"));
        workoutList.add(new Workout("Toe Pose", R.drawable.img_wo_toe, "9"));
        workoutList.add(new Workout("Tree Pose", R.drawable.img_wo_tree, "10"));
        workoutList.add(new Workout("Virabhadrasana", R.drawable.img_wo_virabhadrasana, "11"));
        workoutList.add(new Workout("Yoga", R.drawable.img_wo_yoga, "12"));
        workoutList.add(new Workout("Half-Tortoise\nPose", R.drawable.img_wo_tortoise, "13"));

    }
}