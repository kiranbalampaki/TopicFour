package com.example.topicfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCountries.findViewById(R.id.listCountries);

        ArrayAdapter countryAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                countries
        );

        listCountries.setAdapter(countryAdapter);
    }

    public static final String countries[] = {
            "Nepal",
            "India",
            "China",
            "UK",
            "US",
            "Canada",
    };
}
