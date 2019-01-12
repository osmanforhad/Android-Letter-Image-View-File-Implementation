package com.osmanforhad.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class WeekActivity extends AppCompatActivity {

    //Create object
    private Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        //Call the method
        setupUIViews();
        initToolbar();
    }
    //Cretae Method for setup ui
    private void setupUIViews(){
        //initial XML id from XML file
        toolbar = (Toolbar)findViewById(R.id.ToolbarWeek);
        listView = (ListView)findViewById(R.id.lvWeek);
    }
    //Create Method for initial toolbar
    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Week");
    }
    //Create Method for list view
    private void setupListView(){
        String[] week = getResources().getStringArray(R.array.Week);

    }
}
