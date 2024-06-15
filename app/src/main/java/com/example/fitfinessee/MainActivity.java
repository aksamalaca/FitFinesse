package com.example.fitfinessee;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fitfinessee.AnalyzePage.AnalyzeFragment;
import com.example.fitfinessee.ArticlePage.ArticleFragment;
import com.example.fitfinessee.ProfilePage.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    AnalyzeFragment analyzeFragment = new AnalyzeFragment();
    ArticleFragment articleFragment = new ArticleFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_main, homeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.analyze) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_main, analyzeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.article) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_main, articleFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_main, profileFragment).commit();
                    return true;
                }
                return false;
            }
        });
    }
}