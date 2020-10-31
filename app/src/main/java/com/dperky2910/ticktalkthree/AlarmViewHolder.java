package com.dperky2910.ticktalkthree;

import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AlarmViewHolder extends RecyclerView.ViewHolder {

    private ConstraintLayout entireAlarmLayout;
    private TextView alarmName, alarmNumber;


    public AlarmViewHolder(View view) {

        super(view);

        entireAlarmLayout = view.findViewById(R.id.entireAlarmLayout);
        alarmName = view.findViewById(R.id.txtAlarmName);
        alarmNumber = view.findViewById(R.id.txtAlarmNumber);
    }

    public ConstraintLayout getEntireAlarmLayout() {
        return entireAlarmLayout;
    }

    public TextView getAlarmName() {
        return alarmName;
    }

    public TextView getAlarmNumber() {

        return alarmNumber;
    }
}
