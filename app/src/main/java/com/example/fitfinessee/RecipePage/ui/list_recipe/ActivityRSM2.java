package com.example.fitfinessee.RecipePage.ui.list_recipe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.DummyDataUtil;
import com.example.fitfinessee.RecipePage.data.model.Category;
import com.example.fitfinessee.RecipePage.data.model.Recipe;
import com.example.fitfinessee.RecipePage.ui.recipe.ActivityRSM3;

import java.util.List;
import java.util.stream.Collectors;

public class ActivityRSM2 extends AppCompatActivity {
    private RecyclerView recentSearches;
    private RecentSearchesAdapter recentSearchesAdapter;
    private TextView tvCategory;
    private List<Recipe> recentSearchesList;
    public static String EXTRA_CATEGORY_ID = "categoryId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsm2);

        recentSearches = findViewById(R.id.recentSearches);
        tvCategory = findViewById(R.id.tv_category);

        int categoryId = getIntent().getIntExtra(EXTRA_CATEGORY_ID, -1);
        Category category = DummyDataUtil.generateDummyCategories()
                .stream().filter(c -> c.getId() == categoryId)
                .findFirst().orElse(null);
        String query = "";

        if (category == null) {
            Toast.makeText(this, "Category not found", Toast.LENGTH_SHORT).show();
            finish();
        }

        assert category != null;
        tvCategory.setText(category.getName());
        recentSearchesList = DummyDataUtil.generateDummyRecipes().stream()
                .filter(recipe -> recipe.getCategoryId() == categoryId)
                .filter(recipe -> recipe.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
        recentSearchesAdapter = new RecentSearchesAdapter(recentSearchesList);
        recentSearchesAdapter.setOnItemClickListener(recipe -> {
            Intent intent = new Intent(ActivityRSM2.this, ActivityRSM3.class);
            intent.putExtra(ActivityRSM3.EXTRA_RECIPE_ID, recipe.getId());
            startActivity(intent);
        });

        recentSearches.setLayoutManager(new LinearLayoutManager(this));
        recentSearches.setAdapter(recentSearchesAdapter);
    }
}

