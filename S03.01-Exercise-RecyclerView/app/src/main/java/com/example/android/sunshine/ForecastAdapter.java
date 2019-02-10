package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // Add a class file called ForecastAdapter - DONE
    // Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> - DONE

    // Create a private string array called mWeatherData - DONE
    private List<String> weatherData;

    // Create the default constructor (we will pass in parameters in a later lesson) - DONE
    public ForecastAdapter() {}

    // Create a class within ForecastAdapter called ForecastAdapterViewHolder - DONE
    // Extend RecyclerView.ViewHolder - DONE

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

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

    // Override onCreateViewHolder - DONE
    // Within onCreateViewHolder, inflate the list item xml into a view - DONE
    // Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter - DONE
    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.forecast_list_item, viewGroup, false);
        return new ForecastAdapterViewHolder(view);
    }


    // Override onBindViewHolder - DONE
    // Set the text of the TextView to the weather for this list item's position - DONE
    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        forecastAdapterViewHolder.weatherTextView.setText(Integer.toString(i));
    }


    // Override getItemCount - DONE
    // Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null - DONE
    @Override
    public int getItemCount() {
        return weatherData == null ? 0 : weatherData.size();
    }


    // Create a setWeatherData method that saves the weatherData to mWeatherData - DONE
    // After you save mWeatherData, call notifyDataSetChanged - DONE
    public void setWeatherData(List<String> newData) {
        this.weatherData = newData;
        notifyDataSetChanged();
    }
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
}
