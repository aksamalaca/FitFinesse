package com.example.fitfinessee.AnalyzePage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.fitfinessee.R;

public class AnalyzeFragment extends Fragment {
    private EditText heightEditText, weightEditText, ageEditText;
    private Spinner activityLevelSpinner;
    private Button calculateButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_analyze, container, false);

        heightEditText = view.findViewById(R.id.heightEditText);
        weightEditText = view.findViewById(R.id.weightEditText);
        ageEditText = view.findViewById(R.id.ageEditText);
        calculateButton = view.findViewById(R.id.calculateButton);

        // Clear input fields if coming back from BmiResultActivity
        if (savedInstanceState != null && savedInstanceState.getBoolean("isBackFromBmiResultActivity", false)) {
            heightEditText.setText("");
            weightEditText.setText("");
            ageEditText.setText("");
        }

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = heightEditText.getText().toString();
                String weightStr = weightEditText.getText().toString();
                String ageStr = ageEditText.getText().toString();

                if (!TextUtils.isEmpty(heightStr) && !TextUtils.isEmpty(weightStr) && !TextUtils.isEmpty(ageStr)) {
                    double height = Double.parseDouble(heightStr) / 100; // convert cm to m
                    double weight = Double.parseDouble(weightStr);
                    int age = Integer.parseInt(ageStr);

                    double bmi = calculateBMI(weight, height);
                    String bmiCategory = getBMICategory(bmi);

                    Intent intent = new Intent(getActivity(), AnalyzeResultActivity.class);
                    intent.putExtra("bmi", bmi);
                    intent.putExtra("bmi_category", bmiCategory);
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        heightEditText.setText("");
        weightEditText.setText("");
        ageEditText.setText("");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("isBackFromBmiResultActivity", true);
    }

    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}