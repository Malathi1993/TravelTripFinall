package com.example.traveltrip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchTripActivity extends AppCompatActivity {

    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "Mahesh M", "*****", "05:00 PM          . Hyderabad", "05:00 PM          . Vijayawada",
            "300 Rupees     1       899", "PerPerson BookedSeats Distance",};


    int[] listviewImage = new int[]{
            R.drawable.person, R.drawable.person, R.drawable.person, R.drawable.person,
            R.drawable.person, R.drawable.person,};

    String[] listviewShortDescription = new String[]{
            "Mahesh M", "*****", "05:00 PM          . Hyderabad", "05:00 PM          . Vijayawada",
            "300 Rupees     1       899", "PerPerson BookedSeats Distance",};

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_trip);
        // status bar hide
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        //Action Bar
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"person", "textView5", "textView7"};
        int[] to = {R.id.profile, R.id.listdec, R.id.listdec};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.activity_search_trip, from, to);
        ListView androidListView = (ListView) findViewById(R.id.samplelist);
        androidListView.setAdapter(simpleAdapter);
    }


}
