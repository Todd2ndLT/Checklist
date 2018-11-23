package com.app.todbayar.checklist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragHierarchy extends Fragment {

    private View fragView;
    private ListView listView;
    private FragHierarchy_List listView_List;

    public FragHierarchy(){}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) fragView.findViewById(R.id.var_hierarchy_list);
        listView.setFastScrollEnabled(true);
        listView.setTextFilterEnabled(true);

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        listView_List = new FragHierarchy_List(getActivity(), list, "OK");
        listView.setAdapter(listView_List);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragView = inflater.inflate(R.layout.activity_hierarchy, container, false);
        return fragView;
    }
}
