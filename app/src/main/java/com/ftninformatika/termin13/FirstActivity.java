package com.ftninformatika.termin13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }


    public void onClick(View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText("Ovo je izmenjen tekst!");
        tv.setTextColor( getResources().getColor(R.color.serpa_plava, null));
        tv.setTypeface(null, Typeface.BOLD_ITALIC);
        tv.setBackgroundResource(R.color.colorPrimary);

        Intent intent = new Intent(this, SecondActivity.class);
        String url = "https://www.google.com";
        intent.putExtra("url", url);

        startActivity(intent);
    }
}