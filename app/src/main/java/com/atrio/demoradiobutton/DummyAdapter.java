package com.atrio.demoradiobutton;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import java.util.ArrayList;

/**
 * Created by Admin on 30-05-2017.
 */

public class DummyAdapter extends RecyclerView.Adapter<DummyAdapter.MyViewHolder>{
    private Context c;
    ArrayList<String> arr=new ArrayList<>();
    public DummyAdapter(Context context, ArrayList<String> arr_qty) {
        this.arr = arr_qty;
        this.c = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }
    public int getItemViewType(int position) {
        return position;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public RadioButton radio,radio1;
        public MyViewHolder(View itemView) {
            super(itemView);
            radio = (RadioButton) itemView.findViewById(R.id.radio_dummy);
            radio1 = (RadioButton) itemView.findViewById(R.id.radio_dummy1);
        }
    }
}
