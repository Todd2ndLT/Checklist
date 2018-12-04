package com.app.todbayar.checklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class FragHierarchy_List extends BaseAdapter {

    private Context context;
    private List<String> listData;
    private LayoutInflater inflater;
    private String state;

    public FragHierarchy_List(Context context, List<String> listData, String state){
        super();
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listData = listData;
        this.state = state;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View container, ViewGroup parent) {
        container = inflater.inflate(R.layout.fragment_hierarchy_list, parent, false);
        TextView text = (TextView) container.findViewById(R.id.var_hierarchy_list_items_text);
        text.setText(listData.get(position));
        return container;
    }
}
