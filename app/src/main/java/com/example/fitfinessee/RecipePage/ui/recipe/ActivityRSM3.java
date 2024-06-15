package com.example.fitfinessee.RecipePage.ui.recipe;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.DummyDataUtil;
import com.example.fitfinessee.RecipePage.data.model.Recipe;

import java.util.List;

public class ActivityRSM3 extends AppCompatActivity {
    public static String EXTRA_RECIPE_ID = "recipeId";
    private TextView tvRecipe, tvRecipeDescription, tvIngredientCount, tvInstruction;
    private ImageView ivRecipe;
    private RecyclerView rvIngredients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsm3);

        int recipeId = getIntent().getIntExtra(EXTRA_RECIPE_ID, -1);
        Recipe recipe = DummyDataUtil.getRecipeById(recipeId);

        if (recipe == null) {
            Toast.makeText(this, "Resep tidak ditemukan", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        // Assign your views
        tvRecipe = findViewById(R.id.tv_recipe);
        tvRecipeDescription = findViewById(R.id.tv_recipe_description);
        tvIngredientCount = findViewById(R.id.tv_ingridient_count);
        ivRecipe = findViewById(R.id.iv_recipe);
        rvIngredients = findViewById(R.id.rv_recipe_ingredient);
        tvInstruction = findViewById(R.id.tv_instruction);

        // Set your data
        tvRecipe.setText(recipe.getName());
        tvRecipeDescription.setText(recipe.getDescription());
        tvIngredientCount.setText(getString(R.string.text_iitems, recipe.getIngredients().size()));

        // Load your images
        Glide.with(this).load(recipe.getImageUrl()).into(ivRecipe);

        // Ingredients
        rvIngredients.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        IngredientListAdapter ingredientListAdapter = new IngredientListAdapter();
        ingredientListAdapter.submitList(recipe.getIngredients());
        rvIngredients.setHasFixedSize(false);
        rvIngredients.setAdapter(ingredientListAdapter);

        // Set your instructions'
        List<String> instruction = recipe.getSteps();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < instruction.size(); i++) {
            sb.append(i + 1).append(". ").append(instruction.get(i)).append("\n\n");
        }
        tvInstruction.setText(sb.toString());
    }
}
