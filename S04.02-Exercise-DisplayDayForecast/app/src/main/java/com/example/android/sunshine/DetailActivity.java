package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView weatherDetailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        weatherDetailTextView = findViewById(R.id.weatherDetailTextView);

        // Display the weather forecast that was passed from MainActivity - DONE
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.DETAIL_ACTIVITY_WEATHER_FOR_DAY)) {
            weatherDetailTextView.setText(intent.getStringExtra(MainActivity.DETAIL_ACTIVITY_WEATHER_FOR_DAY));
        }
    }
}