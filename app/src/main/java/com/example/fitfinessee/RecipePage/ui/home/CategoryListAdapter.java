package com.example.fitfinessee.RecipePage.ui.home;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.model.Category;

import java.util.List;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {

    OnItemClickListener onItemClickListener;
    private List<Category> categories;

    public CategoryListAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_category, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Glide.with(viewHolder.ivCategory.getContext()).load(categories.get(position).getImage()).into(viewHolder.ivCategory);
        viewHolder.tvCategory.setText(categories.get(position).getName());
        viewHolder.cvCategory.setOnClickListener(v -> onItemClickListener.onItemClick(categories.get(position)));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void submitList(List<Category> categories) {
        this.categories = categories;
        notifyDataSetChanged();
    }

    interface OnItemClickListener {
        void onItemClick(Category category);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView ivCategory;
        private final TextView tvCategory;
        private final CardView cvCategory;

        public ViewHolder(View view) {
            super(view);
            ivCategory = view.findViewById(R.id.iv_category);
            tvCategory = view.findViewById(R.id.tv_category);
            cvCategory = view.findViewById(R.id.cv_category);
        }
    }
}