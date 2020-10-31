package com.dperky2910.ticktalkthree;

import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AlarmViewHolder extends RecyclerView.ViewHolder {

    private ConstraintLayout entireAlarmLayout, alarmHeadingLayout, alarmOptions;
    private TextView alarmName, alarmNumber;


    public AlarmViewHolder(final View view) {

        super(view);

        entireAlarmLayout = view.findViewById(R.id.entireAlarmLayout);
        alarmName = view.findViewById(R.id.txtAlarmName);
        alarmNumber = view.findViewById(R.id.txtAlarmNumber);

        alarmHeadingLayout = view.findViewById(R.id.alarmHeadingLayout);
        alarmOptions = view.findViewById(R.id.alarmOptions);

        alarmHeadingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alarmOptions.getVisibility() == View.VISIBLE) {
                alarmOptions.setVisibility(View.GONE);
            } else {
                alarmOptions.setVisibility(View.VISIBLE);
            }
        }
    });
}
    public ConstraintLayout getEntireAlarmLayout() {
        return entireAlarmLayout;
    }

    public ConstraintLayout getAlarmHeadingLayout() {
        return alarmHeadingLayout;
    }

    public ConstraintLayout getAlarmOptions() {
        return alarmOptions;
    }

    public TextView getAlarmName() {
        return alarmName;
    }

    public TextView getAlarmNumber() {
        return alarmNumber;
    }
}
