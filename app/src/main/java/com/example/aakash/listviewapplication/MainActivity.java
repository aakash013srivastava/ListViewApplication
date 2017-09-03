package com.example.aakash.listviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favTvShows = {"Two and a Half men","Sherlock","The Big Bang Theory","DragonBall Z","DragonBall Super"};
        ListAdapter theAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_List_Item1,favTvShows);
        ListView theListView = (ListView)findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
    }
}
