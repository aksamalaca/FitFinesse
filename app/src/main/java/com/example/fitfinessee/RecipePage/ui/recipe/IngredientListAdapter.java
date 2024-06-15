package com.example.fitfinessee.RecipePage.ui.recipe;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.model.Ingredient;

import java.util.List;

public class IngredientListAdapter extends RecyclerView.Adapter<IngredientListAdapter.ViewHolder> {

    private List<Ingredient> ingredients;

    public IngredientListAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_ingredient, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Glide.with(viewHolder.ivIngredient.getContext()).load(ingredients.get(position).getImageUrl()).into(viewHolder.ivIngredient);
        viewHolder.tvIngredientName.setText(ingredients.get(position).getName());
        viewHolder.tvIngredientAmount.setText(ingredients.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return ingredients.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void submitList(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView ivIngredient;
        private final TextView tvIngredientName, tvIngredientAmount;

        public ViewHolder(View view) {
            super(view);
            ivIngredient = view.findViewById(R.id.iv_ingredient);
            tvIngredientName = view.findViewById(R.id.tv_ingredient_name);
            tvIngredientAmount = view.findViewById(R.id.tv_ingredient_amount);
        }
    }
}