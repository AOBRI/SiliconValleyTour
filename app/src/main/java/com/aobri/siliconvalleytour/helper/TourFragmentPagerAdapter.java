package com.aobri.siliconvalleytour.helper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aobri.siliconvalleytour.fragment.HotelsFragment;
import com.aobri.siliconvalleytour.fragment.LandmarksFragment;
import com.aobri.siliconvalleytour.fragment.MallsFragment;
import com.aobri.siliconvalleytour.fragment.RestaurantsFragment;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new MallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}