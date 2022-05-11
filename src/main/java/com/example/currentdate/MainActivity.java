package com.example.currentdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String temp;
    static final String[] month={"January","February","March","April","May","June","July",
            "August","September","October","November","December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner_id);
        ArrayList<String> years = new ArrayList<>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = thisYear; i <= 2025; i++) {
            years.add(Integer.toString(i));
        }
        //months
        /*ArrayAdapter<String> adapterMonths = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Month);

        adapterMonths.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterMonths);*/

        List<String>obbj=new ArrayList<>();
        for (int i = 0; i < years.size(); i++) {
            for (int j = 0; j < month.length; j++) {
                temp = month[j] + "   " + years.get(i);
                System.out.println(temp);
                System.out.println(" ");
                obbj.add(temp);
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, obbj);
            spinner.setAdapter(adapter);
        }
    }

}