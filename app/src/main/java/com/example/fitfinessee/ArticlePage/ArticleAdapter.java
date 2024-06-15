package com.example.fitfinessee.ArticlePage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;

import java.util.ArrayList;
import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {

    private Context context;
    private List<ArticleModel> articleList;
//    ArticleModelprivate LinearLayout articleLayout;

    private static ClickListener clickListener;

    public ArticleAdapter(Context context, ArrayList<ArticleModel> articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item_data, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        final ArticleModel article = articleList.get(position);
        holder.tvTitle.setText(article.getTitle());
        holder.tvContent.setText(article.getContent());
        holder.image.setImageResource(article.getImage());


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailArticleActivity.class);
            Bundle bundle = new Bundle();
            String dataTitle = holder.tvTitle.getText().toString();
            String dataContent = holder.tvContent.getText().toString();

            bundle.putString("title", dataTitle);
            bundle.putString("content", dataContent);
            intent.putExtras(bundle);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    public class ArticleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout articleLayout;
        TextView tvTitle, tvContent;
        ImageView image;
        ImageView tvDelete;

        public ArticleViewHolder(@NonNull View itemView){
            super(itemView);

            articleLayout = itemView.findViewById(R.id.contact_layout);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvContent = itemView.findViewById(R.id.tv_content);

            image = itemView.findViewById(R.id.image);

        }


        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getBindingAdapterPosition(), itemView);


        }

    }

    public void setOnItemClickListener(ClickListener clickListener){
        ArticleAdapter.clickListener = clickListener;

    }
}