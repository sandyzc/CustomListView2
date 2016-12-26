package com.sandyz.customlistview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sandyz.customlistview.CustomBean;
import com.sandyz.customlistview.R;

import java.util.List;


public class ListAdaper extends BaseAdapter {

    Context context;
    List<CustomBean> data;
    LayoutInflater inflater;

    public ListAdaper(Context context, List<CustomBean> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.custom_list,parent , false);
            holder = new ViewHolder();
            holder.name= (TextView)convertView.findViewById(R.id.name);
            holder.number = (TextView)convertView.findViewById(R.id.phn);
            convertView.setTag(holder);

        }else {
            holder= (ViewHolder)convertView.getTag();
        }
        holder.name.setText(data.get(position).getName());
        holder.number.setText(data.get(position).getNumb());
        return convertView;
    }

    class ViewHolder{

        TextView name,number;
    }

}
