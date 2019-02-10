package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // Add a class file called ForecastAdapter - DONE
    // Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> - DONE

    // TODO (23) Create a private string array called mWeatherData

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

    // Create a class within ForecastAdapter called ForecastAdapterViewHolder - DONE
    // Extend RecyclerView.ViewHolder - DONE

    private class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
        // Create a public final TextView variable called mWeatherTextView - DONE
        public final TextView weatherTextView;

        // Create a constructor for this class that accepts a View as a parameter - DONE
        // Call super(view) within the constructor for ForecastAdapterViewHolder - DONE
        // Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView - DONE
        public ForecastAdapterViewHolder(View view) {
            super(view);
            weatherTextView = view.findViewById(R.id.tv_weather_data);
        }

        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////

    }

    // TODO (24) Override onCreateViewHolder
    // TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
    // TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // TODO (27) Override onBindViewHolder
    // TODO (28) Set the text of the TextView to the weather for this list item's position

    // TODO (29) Override getItemCount
    // TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // TODO (32) After you save mWeatherData, call notifyDataSetChanged
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
}
