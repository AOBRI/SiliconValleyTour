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
import com.aobri.siliconvalleytour.helper.HotelAdapter;
import com.aobri.siliconvalleytour.model.Hotel;
import com.aobri.siliconvalleytour.model.LocationData;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_tour_items, container, false);

        final ArrayList<Hotel> hotelsList = new ArrayList<>();
        hotelsList.add(new Hotel(getString(R.string.hotel_ritzcarlton_name), 5f, getString(R.string.hotel_ritzcarlton_price), new LocationData(getString(R.string.hotel_ritzcarlton_address)), R.drawable.hotel_ritzcarlton));
        hotelsList.add(new Hotel(getString(R.string.hotel_rosewood_name), 5f, getString(R.string.hotel_rosewood_price), new LocationData(getString(R.string.hotel_rosewood_address)), R.drawable.hotel_rosewood));
        hotelsList.add(new Hotel(getString(R.string.hotel_fourseasons_name), 5f, getString(R.string.hotel_fourseasons_price), new LocationData(getString(R.string.hotel_fourseasons_address)), R.drawable.hotel_fourseasons));
        hotelsList.add(new Hotel(getString(R.string.hotel_nobu_name), 5f, getString(R.string.hotel_nobu_price), new LocationData(getString(R.string.hotel_nobu_address)), R.drawable.hotel_nobu));

        // Prepare & Configure the RecyclerView
        RecyclerView listRecyclerView = rootView.findViewById(R.id.items_list_recycler_view);
        // use this setting to improve performance if you know that changes in content do not change the layout size of the RecyclerView
        listRecyclerView.setHasFixedSize(true);
        HotelAdapter hotelAdapter = new HotelAdapter(getActivity(), hotelsList);
        listRecyclerView.setAdapter(hotelAdapter);

        return rootView;
    }
}