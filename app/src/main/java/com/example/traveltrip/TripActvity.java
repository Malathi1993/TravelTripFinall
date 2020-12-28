package com.example.traveltrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class TripActvity extends AppCompatActivity {
    ListView listView;
    String[] name = {
            "Mahesh", "Rajesh", "Sathish", "Rakesh"
    };
    String[] time1 = {
            "5:00 PM  Hyderabad", "5:00 PM  Hyderabad", "5:00 PM  Hyderabad", "5:00 PM  Hyderabad"
    };
    String[] time2 = {
            "6:00 PM  vijayawada", "6:00 PM  vijayawada", "6:00 PM  vijayawada", "6:00 PM  vijayawada"
    };
    String[] text1 = {
            "300 Rupees", "300 Rupees", "300 Rupees", "300 Rupees"
    };
    String[] text2 = {
            "per Person", "per Person", "per Person", "per Person"
    };
    String[] text3 = {
            "1", "1", "1", "1"
    };
    String[] text4 = {
            "Booked Seats", "Booked Seats", "Booked Seats", "Booked Seats"
    };
    String[] text5 = {
            "889", "889", "889", "889"
    };
    String[] text6 = {
            "distance", "distance", "distance", "distance"
    };
    Integer[] img = {
            R.drawable.male, R.drawable.male, R.drawable.male, R.drawable.male,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_actvity);
        listView=findViewById(R.id.list_item);
        CustomAdapter customAdapter=new CustomAdapter(this,name,time1,time2,text1,text2,text3,text4,text5,text6,img);
        listView.setAdapter(customAdapter);
    }
}