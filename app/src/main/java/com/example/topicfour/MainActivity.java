package com.example.topicfour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView listCountries;

    public static final String countries[] = {
            "Nepal", "Kathmandu",
            "India", "New Delhi",
            "China", "Beijing",
            "UK", "London",
            "US", "Washington DC",
            "Canada", "Ottawa",
    };
    private Map<String,String> dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCountries = findViewById(R.id.listCountries);

        dictionary = new HashMap<>();
        for (int i=0; i<countries.length; i+=2){
            dictionary.put(countries[i], countries[i+1]);
        }

        ArrayAdapter countryAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(dictionary.keySet())
        );

        listCountries.setAdapter(countryAdapter);
    }
}
