package com.example.fitfinessee.ArticlePage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;

import java.util.ArrayList;

public class ArticleFragment extends Fragment {

    private RecyclerView recyclerView;

    private TextView tvFitness, tvLife, tvWorkout, tvFood, tvSleep, tvTips, tvCategory;
    private LinearLayout label;
    private ArrayList<ArticleModel> articlelist = new ArrayList<>();
    private ArticleAdapter articleAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_article, container, false);


        label = view.findViewById(R.id.content);
        tvFitness = view.findViewById(R.id.tv_fitness);
        tvLife = view.findViewById(R.id.tv_life);
        tvWorkout = view.findViewById(R.id.tv_workout);
        tvFood = view.findViewById(R.id.tv_food);
        tvSleep = view.findViewById(R.id.tv_sleep);
        tvTips = view.findViewById(R.id.tv_tips);

        tvFitness.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Fitness");
            startActivity(intent);
        });

        tvLife.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Life");
            startActivity(intent);
        });

        tvWorkout.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Workout");
            startActivity(intent);
        });

        tvFood.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Food");
            startActivity(intent);
        });

        tvSleep.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Sleep");
            startActivity(intent);
        });

        tvTips.setOnClickListener(v ->{
            Intent intent = new Intent(getActivity(), ArticleActivity.class);
            intent.putExtra("headline", "Tips");
            startActivity(intent);
        });

        recyclerView = view.findViewById(R.id.recycle_article);
        recyclerView.setHasFixedSize(true);

        articlelist.add(new ArticleModel("How to get a perfect score in UTBK?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));

        ArticleAdapter adapter = new ArticleAdapter(getActivity(),articlelist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}