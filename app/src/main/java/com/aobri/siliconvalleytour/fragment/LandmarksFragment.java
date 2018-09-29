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
import com.aobri.siliconvalleytour.helper.LandmarkAdapter;
import com.aobri.siliconvalleytour.model.Landmark;
import com.aobri.siliconvalleytour.model.LocationData;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_tour_items, container, false);

        final ArrayList<Landmark> landmarksList = new ArrayList<>();
        landmarksList.add(new Landmark(getString(R.string.landmark_applepark_name), getString(R.string.landmark_applepark_description),
                new LocationData(getString(R.string.landmark_applepark_address)), R.drawable.landmark_applepark));
        landmarksList.add(new Landmark(getString(R.string.landmark_googleplex_name), getString(R.string.landmark_googleplex_description),
                new LocationData(getString(R.string.landmark_googleplex_address)), R.drawable.landmark_googleplex));
        landmarksList.add(new Landmark(getString(R.string.landmark_stanford_name), getString(R.string.landmark_stanford_description),
                new LocationData(getString(R.string.landmark_stanford_address)), R.drawable.landmark_stanford));
        landmarksList.add(new Landmark(getString(R.string.landmark_intel_name), getString(R.string.landmark_intel_description),
                new LocationData(getString(R.string.landmark_intel_address)), R.drawable.landmark_intel));

        // Prepare & Configure the RecyclerView
        RecyclerView listRecyclerView = rootView.findViewById(R.id.items_list_recycler_view);
        // use this setting to improve performance if you know that changes in content do not change the layout size of the RecyclerView
        listRecyclerView.setHasFixedSize(true);
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(getActivity(), landmarksList);
        listRecyclerView.setAdapter(landmarkAdapter);

        return rootView;
    }
}