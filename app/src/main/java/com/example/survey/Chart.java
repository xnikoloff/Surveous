package com.example.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class Chart extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        barChart = findViewById(R.id.barchart);

        BarDataSet barDataSetHipHop = new BarDataSet(barEntriesHipHop(), "Eminem");
        barDataSetHipHop.setColor(Color.RED);

        BarDataSet barDataSetPop = new BarDataSet(barEntriesPop(), "Ariana Grande");
        barDataSetPop.setColor(Color.GREEN);

        BarDataSet barDataSetRock = new BarDataSet(barEntriesRock(), "Skillet");
        barDataSetRock.setColor(Color.BLUE);

        BarData barData = new BarData(barDataSetHipHop, barDataSetPop, barDataSetRock);
        barChart.setData(barData);

        barChart.setDragEnabled(true);
        barChart.setVisibleXRangeMinimum(3);


        float barSpace = .5f;
        float groupSpace = 2;
        barData.setBarWidth(8);

        barChart.getXAxis().setAxisMinimum(0);
        barChart.getXAxis().setAxisMaximum(0 + barChart.getBarData().
                getGroupWidth(groupSpace, barSpace));

        barChart.getAxisLeft().setAxisMinimum(0);


        barChart.groupBars(0, groupSpace, barSpace);

        barChart.invalidate();

    }

    private ArrayList<BarEntry> barEntriesHipHop(){
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1, 400));



        return  barEntries;
    }

    private ArrayList<BarEntry> barEntriesPop(){
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1, 100));



        return  barEntries;
    }

    private ArrayList<BarEntry> barEntriesRock(){
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1, 200));



        return  barEntries;
    }
}
