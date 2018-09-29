package com.aobri.siliconvalleytour.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.aobri.siliconvalleytour.R;
import com.aobri.siliconvalleytour.helper.TourFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ViewPager in activity layout, create its adapter and set it to the viewpager
        ViewPager viewPager = findViewById(R.id.viewpager);
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_local_activity_white_36);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_restaurant_white_36);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_hotel_white_36);
        tabLayout.getTabAt(3).setIcon(R.drawable.baseline_local_mall_white_36);
    }
}