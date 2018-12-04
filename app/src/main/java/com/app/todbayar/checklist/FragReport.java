package com.app.todbayar.checklist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;

public class FragReport extends Fragment {

    private View fragView;
    private ExpandableListView listView;
    private FragReport_List listView_List;

    public FragReport(){}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = (ExpandableListView) fragView.findViewById(R.id.var_report_list);
        List<String> list = new ArrayList<>();
        list.add("Zaisan Square");
        list.add("Хийд");
        listView_List = new FragReport_List(getActivity(), list, "OK");
        listView.setAdapter(listView_List);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragView = inflater.inflate(R.layout.fragment_report, container, false);
        return fragView;
    }
}
