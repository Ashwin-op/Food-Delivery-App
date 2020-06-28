package com.example.healthify.ui.home;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.healthify.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import timber.log.Timber;

public class Adapter extends BaseAdapter {
    private final ArrayList mData;

    public Adapter(HashMap<String, ArrayList<String>> map) {
        mData = new ArrayList();
        mData.addAll(map.entrySet());
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Map.Entry getItem(int position) {
        return (Map.Entry) mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View result;
        if (convertView == null) {
            result = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_confirmation_list, parent, false);
        } else {
            result = convertView;
        }
        Map.Entry<String, ArrayList<String>> item = getItem(position);
        Timber.tag("Adapter").v("item.getKey() ka value%s", item.getKey());
        Timber.tag("Adapter").v("item.getValue() ka value%s", item.getValue());
        TextView orderName = result.findViewById(R.id.orderNameConfirmation);
        orderName.setText(item.getKey());
        TextView orderQuantity = result.findViewById(R.id.orderQuantityConfirmation);
        String value = item.getValue().get(0);
        orderQuantity.setText(value);
        return result;
    }

}
