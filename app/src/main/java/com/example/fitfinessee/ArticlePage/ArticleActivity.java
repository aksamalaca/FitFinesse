package com.example.fitfinessee.ArticlePage;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitfinessee.R;

import java.util.ArrayList;

public class ArticleActivity extends AppCompatActivity {

    private LinearLayout layAddArticle;
    private RecyclerView recyclerView;
    private TextView headline;
    private Button btnSubmit, btnCancel;
    private ImageView btnBack;
    private EditText etTitle, etContent;
    private ArrayList<ArticleModel> articlelist = new ArrayList<>();
    private ArticleAdapter articleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_activity);

        btnCancel = findViewById(R.id.btnCancel);
        layAddArticle = findViewById(R.id.layout_add);
        btnSubmit = findViewById(R.id.btn_submit);
        etContent = findViewById(R.id.et_content);
        etTitle = findViewById(R.id.et_title);
        btnBack = findViewById(R.id.backbtn);
        headline = findViewById(R.id.headline);


        recyclerView = findViewById(R.id.recycle_article);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Bundle bundle = getIntent().getExtras();
        headline.setText(bundle.getString("headline"));


//        articlelist.add(new ArticleModel(etTitle.getText().toString(), etContent.getText().toString(), R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articlelist.add(new ArticleModel("Hello there?", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                R.drawable.sleep));
        articleAdapter = new ArticleAdapter(this, articlelist);
        recyclerView.setAdapter(articleAdapter);

//        option.setOnClickListener(v -> {
//            if(recyclerView.getVisibility() == View.VISIBLE){
//                recyclerView.setVisibility(View.GONE);
//                layAddArticle.setVisibility(View.VISIBLE);
//                clearData();
//            } else{
//                recyclerView.setVisibility(View.VISIBLE);
//                layAddArticle.setVisibility(View.GONE);
//            }
//        });

//        btnCancel.setOnClickListener(v ->{
//            clearData();
//        });


//        btnSubmit.setOnClickListener(v -> {
//            if (etTitle.getText().toString().equals("") || etContent.getText().toString().equals("")) {
//                Toast.makeText(this, "Title or content can't be blank", Toast.LENGTH_SHORT).show();
//            } else {
//                articlelist.add(new ArticleModel(etTitle.getText().toString(), etContent.getText().toString(), R.drawable.sleep));
//                articleAdapter = new ArticleAdapter(this, articlelist);
//                recyclerView.setAdapter(articleAdapter);
//                recyclerView.setVisibility(View.VISIBLE);
//                layAddArticle.setVisibility(View.GONE);
//            }
//        });
//
        btnBack.setOnClickListener(v -> {
            setResult(RESULT_OK, null);
            finish();
        });

        articleAdapter = new ArticleAdapter(this, articlelist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ArticleActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        articleAdapter.setOnItemClickListener((position, v) -> {
            articlelist.remove(position);
            articleAdapter = new ArticleAdapter(this, articlelist);
            recyclerView.setAdapter(articleAdapter);
        });
        recyclerView.setAdapter(articleAdapter);
    }

//    private void clearData() {
//        etContent.setText("");
//        etTitle.setText("");
//    }
}
