package com.example.jackreacher.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jackreacher.customlistview.R.drawable;
import com.example.jackreacher.customlistview.adapter.MoviesAdapter;

public class MainActivity extends AppCompatActivity {
    ListView lstVuMovies;
    ArrayAdapter mAdapter;
    String[] MovieNames={
            "John hancock", "Sucide Squad", "ESABELL",
            "TRANSITON", "DEATH NOTE", "HARRY PORTER",
            "I FRANKANSTIEN", "TWILIGHT", "FF8",
            "INCEPTION", "MISSION IMPOSSIBLE", "THE FAULT IN OUR STARS",
            "SMURFS", "CINDRELLA", "Snow White",
            "ANABELL", "INSEDIOUS" };
    String[] DricterNames={
            "Ashfaq","Ramzan","Arslan",
            "Ali","John Green","Jusitn bibedr",
            "Jonathan","Riaz","Ansar",
            "Imaran","Farhan","Faizan",
            "Younus","Adeel","Wasim",
            "Azhar","Nasir"};
    String[] MovieLikes={
            "300k","500k","800k",
            "1200k","560k","890k"
            ,"675k","876k","895k"
            ,"456k","321k","870k",
            "654k","777k","999k",
            "897k","987k"
    };
    String[] MovieDislikes={
            "100k","80k","876"
            ,"89k","76k","70k",
            "78k","12k","23k",
            "22k","43k","54k"
            ,"65k","77k","99k",
            "90k","98k"
    };
    int[] MovieThumbnail= new int[]{
            drawable.first_pic,
            drawable.second_pic,
            drawable.third_pic,
            drawable.fourth_pic,
            drawable.fifth_pic,
            drawable.sixth_pic,
            drawable.seventh_pic,
            drawable.eighth_pic,
            drawable.ninth_pic,
            drawable.tenth_pic,
            drawable.eleventh_pic,
            drawable.tewlth_pic,
            drawable.thirtheenth_pic,
            drawable.fourteenth_pic,
            drawable.fifteen_pic,
            drawable.sixteen_pic,
            drawable.seventeen_pic
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVuMovies=(ListView)findViewById(R.id.lst_vu_movies);
        mAdapter=new MoviesAdapter(MainActivity.this,R.layout.custom_list_view_design,MovieThumbnail,MovieNames,DricterNames,MovieLikes,MovieDislikes);
        lstVuMovies.setAdapter(mAdapter);
    }
}
