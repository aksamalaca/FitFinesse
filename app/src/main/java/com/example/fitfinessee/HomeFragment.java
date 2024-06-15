package com.example.fitfinessee;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.RecipePage.ui.home.ActivityRSM1;
import com.example.fitfinessee.WorkoutPage.WorkoutActivity;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find the button by its ID
        Button btnWo = view.findViewById(R.id.btn_wo);
        Button btnRecipe = view.findViewById(R.id.btn_recipe);

        // Set an onClickListener for the button
        btnWo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Workout Activity
                Intent intent = new Intent(getActivity(), WorkoutActivity.class);
                intent.putExtra("teksAtas", "Latihan Fisik");
                startActivity(intent);
            }
        });

        btnRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Recipe Activity
                Intent intent = new Intent(getActivity(), ActivityRSM1.class);
                intent.putExtra("headerText", "Resep Sehat");
                startActivity(intent);
            }
        });

//        btnWo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the Profile Activity
//                Intent intent = new Intent(getActivity(), ProfileFragment.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }
}