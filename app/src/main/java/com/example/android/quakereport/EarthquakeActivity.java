
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        /**
         * Creating an Custom ArrayAdapter
         * Step 3: Create a new Java object by creating a class that holds information about each list item
         * Creates a constructors and getters methods to access private variables declared
         */

        // Create a fake list of earthquake locations.

        //Create a new Earthquake objects and using constructor declared add values into the Object
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.9","San Francisco","27-02-2016"));
        earthquakes.add(new Earthquake("6.6","London","27-02-2016"));
        earthquakes.add(new Earthquake("7.9","Tokyo","27-02-2016"));
        earthquakes.add(new Earthquake("7.9","Mexico City","27-02-2016"));
        earthquakes.add(new Earthquake("7.9","Moscow","27-02-2016"));
        earthquakes.add(new Earthquake("7.9","Rio de Janeirio","27-02-2016"));
        earthquakes.add(new Earthquake("7.9","Paris","27-02-2016"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a own customized Earthquake adapter of type Earthquake Object declared previously
        //It takes list of earthquakes as input
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        //linking the adapter to the Listview
        earthquakeListView.setAdapter(adapter);
    }
}
