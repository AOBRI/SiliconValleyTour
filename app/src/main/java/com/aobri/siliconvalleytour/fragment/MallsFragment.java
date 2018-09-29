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
import com.aobri.siliconvalleytour.helper.MallAdapter;
import com.aobri.siliconvalleytour.model.LocationData;
import com.aobri.siliconvalleytour.model.Mall;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    public MallsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_tour_items, container, false);

        final ArrayList<Mall> mallsList = new ArrayList<>();
        mallsList.add(new Mall(getString(R.string.mall_stanford_name), getString(R.string.mall_stanford_workhours), new LocationData(getString(R.string.mall_stanford_address)), R.drawable.mall_stanford));
        mallsList.add(new Mall(getString(R.string.mall_greatmall_name), getString(R.string.mall_greatmall_workhours), new LocationData(getString(R.string.mall_greatmall_address)), R.drawable.mall_greatmall));
        mallsList.add(new Mall(getString(R.string.mall_westfield_name), getString(R.string.mall_westfield_workhours), new LocationData(getString(R.string.mall_westfield_address)), R.drawable.mall_westfield));

        // Prepare & Configure the RecyclerView
        RecyclerView listRecyclerView = rootView.findViewById(R.id.items_list_recycler_view);
        // use this setting to improve performance if you know that changes in content do not change the layout size of the RecyclerView
        listRecyclerView.setHasFixedSize(true);
        MallAdapter mallAdapter = new MallAdapter(getActivity(), mallsList);
        listRecyclerView.setAdapter(mallAdapter);

        return rootView;
    }
}