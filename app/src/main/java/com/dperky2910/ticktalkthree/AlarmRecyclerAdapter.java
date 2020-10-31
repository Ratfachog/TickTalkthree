package com.dperky2910.ticktalkthree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlarmRecyclerAdapter extends RecyclerView.Adapter<AlarmViewHolder> {

    String [] temporary = {"one","two","three"};

    @NonNull
    @Override
    public AlarmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.alarm_viewholder, parent, false);

        AlarmViewHolder alarmViewHolder = new AlarmViewHolder(view);
        return alarmViewHolder;
        /* below didn't work. Ask on Stackoverflow.
        String alarmDefaultTitle = Integer.getInteger(R.string.default_alarm_name).toString(); */
    }

    @Override
    public void onBindViewHolder(@NonNull AlarmViewHolder holder, int position) {

        holder.getAlarmName().setText("Alarm " + Integer.toString(position + 1));
        holder.getAlarmNumber().setText(temporary[position]);
    }

    @Override
    public int getItemCount() {
        return temporary.length;
    }
}
