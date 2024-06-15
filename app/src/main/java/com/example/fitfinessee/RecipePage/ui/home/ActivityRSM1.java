package com.example.fitfinessee.RecipePage.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.DummyDataUtil;
import com.example.fitfinessee.RecipePage.ui.list_recipe.ActivityRSM2;


public class ActivityRSM1 extends AppCompatActivity {

    private SearchView searchView;
    private CategoryListAdapter categoryListAdapter;
    private RecyclerView rvCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsm1);

        // Menemukan SearchView dalam layout
        searchView = findViewById(R.id.searchView);
        categoryListAdapter = new CategoryListAdapter();
        rvCategories = findViewById(R.id.rv_categories);

        // Menambahkan listener untuk perubahan pada text di Search Bar
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String query) {
                // Lakukan sesuatu dengan query yang dimasukkan
                Toast.makeText(ActivityRSM1.this, "Mencari: " + query, Toast.LENGTH_SHORT).show();
                return false;
            }

            public boolean onQueryTextChange(String newText) {
                // Lakukan sesuatu setiap kali text di Search Bar berubah
                // (misalnya, filter data)
                return false;
            }
        });

        // Menampilkan daftar kategori dalam bentuk grid
        rvCategories.setLayoutManager(new GridLayoutManager(this, 2) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });

        // Mengatur adapter untuk RecyclerView
        rvCategories.setAdapter(categoryListAdapter);

        // Mengatur ukuran RecyclerView agar tidak berubah
        rvCategories.setHasFixedSize(false);

        // Mengatur agar RecyclerView tidak bisa discroll
        rvCategories.setNestedScrollingEnabled(false);

        // Mengisi RecyclerView dengan data kategori
        categoryListAdapter.submitList(DummyDataUtil.generateDummyCategories());

        // Menambahkan click listener untuk setiap item kategori
        categoryListAdapter.onItemClickListener = category -> {
            Intent intent = new Intent(ActivityRSM1.this, ActivityRSM2.class);
            intent.putExtra(ActivityRSM2.EXTRA_CATEGORY_ID, category.getId());
            startActivity(intent);
        };
    }
}

