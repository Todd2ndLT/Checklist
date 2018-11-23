package com.app.todbayar.checklist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragAdapter extends FragmentPagerAdapter {

    private final List<Fragment> varFragList = new ArrayList<>();
    private final List<String> varFragTitle = new ArrayList<>();
    private Context context;

    public FragAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return varFragList.get(position);
    }

    @Override
    public int getCount() {
        return varFragList.size();
    }

    public void addFragment(Fragment frag, String title){
        varFragList.add(frag);
        varFragTitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return varFragTitle.get(position);
    }
}
