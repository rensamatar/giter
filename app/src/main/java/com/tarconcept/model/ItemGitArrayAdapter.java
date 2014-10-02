package com.tarconcept.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tarconcept.ahoy.R;

import java.util.ArrayList;

/**
 * Created by tar on 9/16/14.
 */
public class ItemGitArrayAdapter extends ArrayAdapter<ItemGit> {

    private final Context context;
    private final ArrayList<ItemGit> values;

    public ItemGitArrayAdapter(Context context, ArrayList<ItemGit> allValues) {
        super(context, 0, allValues);
        this.context = context;
        this.values = allValues;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null || convertView.getTag() == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);

            ItemHolder holder = new ItemHolder();
            holder.parentView = (RelativeLayout) convertView.findViewById(R.id.parentView);
            holder.command = (TextView) convertView.findViewById(R.id.command);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        }

        final ItemGit data = values.get(position);
        if (data != null) {
            final ItemHolder holder = (ItemHolder) convertView.getTag();
            holder.command.setText(data.getCommand());
            holder.description.setText(data.getDescription());
        }
        return convertView;
    }

    static class ItemHolder {
        RelativeLayout parentView;
        TextView command;
        TextView description;
    }
}
