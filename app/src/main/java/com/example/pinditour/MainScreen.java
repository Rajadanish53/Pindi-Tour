package com.example.pinditour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

public class MainScreen extends AppCompatActivity {
Animation fadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ViewPager viewpager = findViewById(R.id.viewpager);
        TabLayout tab = findViewById(R.id.tabs);
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        tab.setupWithViewPager(viewpager);
        tab.getTabAt(0).setIcon(R.drawable.ic_baseline_fastfood_24);
        tab.getTabAt(1).setIcon(R.drawable.ic_baseline_directions_walk_24);
        tab.getTabAt(2).setIcon(R.drawable.ic_baseline_hotel_24);
        tab.getTabAt(3).setIcon(R.drawable.ic_baseline_add_shopping_cart_24);
        tab.getTabAt(4).setIcon(R.drawable.ic_baseline_star_24);
//Animation for the text
        fadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);

    }
}