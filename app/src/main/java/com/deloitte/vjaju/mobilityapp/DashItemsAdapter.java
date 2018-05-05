package com.deloitte.vjaju.mobilityapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DashItemsAdapter extends
        RecyclerView.Adapter<DashItemsAdapter.MyViewHolder> {

    private List<DashItems> countryList;

    /**
     * View holder class
     * */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView desc;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.dashRow_img);
            name = (TextView) view.findViewById(R.id.dashItemName);
            desc = (TextView) view.findViewById(R.id.dashItemDesc);
        }
    }

    public DashItemsAdapter(List<DashItems> countryList) {
        this.countryList = countryList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DashItems c = countryList.get(position);
        holder.name.setText(c.getName());
        holder.desc.setText(String.valueOf(c.getDesc()));
        holder.imageView.setImageResource(c.getImageId());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dash_row,parent, false);
        return new MyViewHolder(v);
    }
}

