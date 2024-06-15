package com.example.fitfinessee.RecipePage.ui.list_recipe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;
import com.example.fitfinessee.RecipePage.data.model.Recipe;

import java.util.List;

public class RecentSearchesAdapter extends RecyclerView.Adapter<RecentSearchesAdapter.ViewHolder> {
    private final List<Recipe> recentSearchesList;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(Recipe recipe);
    }

    public RecentSearchesAdapter(List<Recipe> recentSearchesList) {
        this.recentSearchesList = recentSearchesList;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_searches_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.searchQueryTextView.setText(recentSearchesList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return recentSearchesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView searchQueryTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            searchQueryTextView = itemView.findViewById(R.id.search_query_textview);
            itemView.setOnClickListener(v -> {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(recentSearchesList.get(getAbsoluteAdapterPosition()));
                }
            });
        }
    }
    }