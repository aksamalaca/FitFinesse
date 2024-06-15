package com.example.fitfinessee.AnalyzePage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fitfinessee.R;

public class AnalyzeResultActivity extends AppCompatActivity {

    private TextView bmiValueTextView, bmiCategoryTextView;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.analyze_result);

        bmiValueTextView = findViewById(R.id.bmi_value_textview);
        bmiCategoryTextView = findViewById(R.id.bmi_category_textview);
        finishButton = findViewById(R.id.finish_button);

        double bmi = getIntent().getDoubleExtra("bmi", 0);
        String bmiCategory = getIntent().getStringExtra("bmi_category");

        bmiValueTextView.setText(String.format("%.2f", bmi));
        bmiCategoryTextView.setText(bmiCategory);

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
