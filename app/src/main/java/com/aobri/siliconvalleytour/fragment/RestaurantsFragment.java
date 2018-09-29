package com.aobri.siliconvalleytour.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aobri.siliconvalleytour.R;
import com.aobri.siliconvalleytour.helper.RestaurantAdapter;
import com.aobri.siliconvalleytour.model.LocationData;
import com.aobri.siliconvalleytour.model.Restaurant;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_tour_items, container, false);

        final ArrayList<Restaurant> restaurantsList = new ArrayList<>();
        restaurantsList.add(new Restaurant(getString(R.string.restaurant_birddog_name), 4.5f, getString(R.string.restaurant_birddog_workhours), new LocationData(getString(R.string.restaurant_birddog_address)), R.drawable.restaurant_birddog));
        restaurantsList.add(new Restaurant(getString(R.string.restaurant_zola_name), 4.5f, getString(R.string.restaurant_zola_workhours), new LocationData(getString(R.string.restaurant_zola_address)), R.drawable.restaurant_zola));
        restaurantsList.add(new Restaurant(getString(R.string.restaurant_leichi_name), 4.6f, getString(R.string.restaurant_leichi_workhours), new LocationData(getString(R.string.restaurant_leichi_address)), R.drawable.restaurant_leichi));
        restaurantsList.add(new Restaurant(getString(R.string.restaurant_blacksheep_name), 4.4f, getString(R.string.restaurant_blacksheep_workhours), new LocationData(getString(R.string.restaurant_blacksheep_address)), R.drawable.restaurant_blacksheep));

        // Prepare & Configure the RecyclerView
        RecyclerView listRecyclerView = rootView.findViewById(R.id.items_list_recycler_view);
        // use this setting to improve performance if you know that changes in content do not change the layout size of the RecyclerView
        listRecyclerView.setHasFixedSize(true);
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getActivity(), restaurantsList);
        listRecyclerView.setAdapter(restaurantAdapter);

        return rootView;
    }
}