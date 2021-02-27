package com.example.pinditour;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Restaurants();
        }
        else if(position==1){
            return new Parks();
        }
        else if (position==2){
            return new Hotels();
        }
        else if (position==3){
            return new Markets();
        }
        else{
            return new Masjid();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Restaurants";
        }
        else if(position==1){
            return "Parks";
        }
        else if (position==2){
            return "Hotels";
        }
        else if (position==3){
            return "Markets";
        }
        else{
            return "Masjid";
        }

    };
}
