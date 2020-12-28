package com.example.traveltrip;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] tvNamee;
    private final String[] time11;
    private final String[] time22;
    private final String[] text11;
    private final String[] text22;
    private final String[] text33;
    private final String[] text44;
    private final String[] text55;
    private final String[] text66;
    private final Integer[] imgid;

    public CustomAdapter(Activity context, String[] tvNamee, String[] time11, String[] time22, String[] text11, String[] text22, String[] text33, String[] text44, String[] text55, String[] text66, Integer[] imgid) {
        super(context, R.layout.custom_layout,tvNamee);
        this.context = context;
        this.tvNamee = tvNamee;
        this.time11 = time11;
        this.time22 = time22;
        this.text11 = text11;
        this.text22 = text22;
        this.text33 = text33;
        this.text44 = text44;
        this.text55 = text55;
        this.text66 = text66;
        this.imgid = imgid;
    }

//    public CustomAdapter(@NonNull  Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
//        super(context, R.layout.custom_layout, maintitle);
//        this.context = context;
//        this.maintitle = maintitle;
//        this.subtitle = subtitle;
//        this.imgid = imgid;
//    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.custom_layout, null, true);


        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView time1 = (TextView) rowView.findViewById(R.id.time1);
        TextView time2 = (TextView) rowView.findViewById(R.id.time2);
        TextView text1 = (TextView) rowView.findViewById(R.id.text1);
        TextView text2 = (TextView) rowView.findViewById(R.id.text2);
        TextView text3 = (TextView) rowView.findViewById(R.id.text3);
        TextView text4 = (TextView) rowView.findViewById(R.id.text4);
        TextView text5 = (TextView) rowView.findViewById(R.id.text5);
        TextView text6 = (TextView) rowView.findViewById(R.id.text6);

        CircleImageView circleImageView = rowView.findViewById(R.id.profile);
        RatingBar ratingBar = rowView.findViewById(R.id.rating);


        tvName.setText(tvNamee[position]);
        time1.setText(time11[position]);
        time2.setText(time22[position]);
        text1.setText(text11[position]);
        text2.setText(text22[position]);
        text3.setText(text33[position]);
        text4.setText(text44[position]);
        text5.setText(text55[position]);
        text6.setText(text66[position]);
        circleImageView.setImageResource(imgid[position]);


        return rowView;

    };

}
