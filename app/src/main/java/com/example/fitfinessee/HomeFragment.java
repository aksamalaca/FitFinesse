package com.example.fitfinessee;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.ArticlePage.ArticleActivity;
import com.example.fitfinessee.JadwalWoPage.activity.MainActivityJadwal;
import com.example.fitfinessee.RecipePage.ui.home.ActivityRSM1;
import com.example.fitfinessee.WorkoutPage.WorkoutActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
//import com.squareup.picasso.Picasso;
//
//import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
//    private CircleImageView profileImageView;
    private DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
//    private TextView tv_name;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        FirebaseAuth mAuth = FirebaseAuth.getInstance();
//        databaseReference = FirebaseDatabase.getInstance().getReference().child("User");

        // Find the button by its ID
        Button btnWo = view.findViewById(R.id.btn_wo);
        Button btnRecipe = view.findViewById(R.id.btn_recipe);
        Button btnArticles = view.findViewById(R.id.btn_articles);
        Button btnSchedule = view.findViewById(R.id.btn_schedule);

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

        btnArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Recipe Activity
                Intent intent = new Intent(getActivity(), ArticleActivity.class);
                intent.putExtra("headerText", "Artikel");
                startActivity(intent);
            }
        });

        btnSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Recipe Activity
                Intent intent = new Intent(getActivity(), MainActivityJadwal.class);
                intent.putExtra("headerText", "Jadwal Latihan");
                startActivity(intent);
            }
        });
        return view;
    }

//    private void getUserinfo() {
//        databaseReference.child(mAuth.getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0) {
//                    String name = dataSnapshot.child("nama").getValue().toString();
//                    mAuth = FirebaseAuth.getInstance();
//                    tv_name = getView().findViewById(R.id.tv_name);
//                    if (dataSnapshot.hasChild("image")){
//                        String image = dataSnapshot.child("image").getValue().toString();
//                        Picasso.get().load(image).into(profileImageView);
//                    }
//                }
//            }
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//    }
}