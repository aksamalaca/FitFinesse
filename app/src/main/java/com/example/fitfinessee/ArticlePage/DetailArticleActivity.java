package com.example.fitfinessee.ArticlePage;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitfinessee.R;

public class DetailArticleActivity extends AppCompatActivity {
    private ImageView btnBack, image;
    private TextView tvTitle, tvContent;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_article_activity);

        tvTitle = findViewById(R.id.title);
        tvContent = findViewById(R.id.content);
        image = findViewById(R.id.img_title);
        btnBack = findViewById(R.id.btn_back);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("title");
        String content = bundle.getString("content");
        int image = bundle.getInt("image");


        tvTitle.setText(title);
        tvContent.setText(content);

        btnBack.setOnClickListener(v -> {
            setResult(RESULT_OK, null);
            finish();
        });
    }

}
