package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Creating an Custom ArrayAdapter
 * Step 4: Create a arrayAdapter class extending the ArrayAdapter Superclass to implements its functions
 *
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param earthquakes A List of Earthquake objects to display in a list
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }



    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * Overrides the getView method to show how the views are created
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing list item view (called convertView) is being reused,
        // otherwise inflate the view in the new list Item if convertView is null
        // (if the list is empty or no reusable views are available)
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the earthquake object at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);


        /**Find the IDs of the elements in the list item xml to bind and set the views to the listview
         * Bind the elements to the Array adapter with the help of listview
         */

        // Find the TextView in the earthquake_list_item.xml layout with the ID version_name
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the currentEarthquake object and
        // set this text on the name TextView
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        // Find the TextView in the earthquake_list_item.xml layout with the ID version_number
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version number from the currentEarthquake object and
        // set this text on the number TextView
        locationView.setText(currentEarthquake.getmLocation());

        // Find the TextView in the earthquake_list_item.xml layout with the ID version_number
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Get the version number from the currentEarthquake object and
        // set this text on the number TextView
        dateView.setText(currentEarthquake.getmDate());


        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
