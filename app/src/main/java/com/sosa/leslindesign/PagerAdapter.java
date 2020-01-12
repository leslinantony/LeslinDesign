package com.sosa.leslindesign;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int noTabs;
    PagerAdapter(FragmentManager fm,int noTabbs)
    {
        super(fm);
        this.noTabs=noTabbs;

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FirstFragment();

            case 1:return new FirstFragment();

            case 2: return new FirstFragment();


                default:return null;
        }

    }

    @Override
    public int getCount() {
        return noTabs;
    }
}
