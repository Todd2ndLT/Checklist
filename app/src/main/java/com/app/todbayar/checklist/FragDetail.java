package com.app.todbayar.checklist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragDetail extends Fragment {
    private View fragView;
    private ListView listView;
    private FragDetail_List listView_List;

    public FragDetail(){}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = (ListView) fragView.findViewById(R.id.var_detail_list);
        listView.setFastScrollEnabled(true);
        listView.setTextFilterEnabled(true);
        List<String> list = new ArrayList<>();
        list.add("Tugsbayar");
        list.add("Tulga");
        list.add("Tumurbaatar");
        list.add("Tugsbayar");
        list.add("Tulga");
        list.add("Tumurbaatar");
        list.add("Tugsbayar");
        list.add("Tulga");
        list.add("Tumurbaatar");
        list.add("Tugsbayar");
        list.add("Tulga");
        list.add("Tumurbaatar");
        listView_List = new FragDetail_List(getActivity(), list, "OK");
        listView.setAdapter(listView_List);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragView = inflater.inflate(R.layout.fragment_detail, container, false);
        return fragView;
    }
}
