package com.example.jackreacher.customlistview.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jackreacher.customlistview.R;

/**
 * Created by JackReacher on 9/8/2017.
 */

public class MoviesAdapter extends ArrayAdapter {
    Context context;
    int resource;
    int[] moviesThumbnail;
    String[] moviesName;
    String[] moviesSubtitle;
    String[] moviesLikes;
    String[] moviesDislikes;
    LayoutInflater mLayoutInflator;

    public MoviesAdapter(@NonNull Context context, @LayoutRes int resource,int[] moviesThumbnail,String[] moviesName,String[] moviesSubtitle,String[] moviesLikes,String[] moviesDislikes) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
        this.moviesThumbnail=moviesThumbnail;
        this.moviesName=moviesName;
        this.moviesSubtitle=moviesSubtitle;
        this.moviesLikes=moviesLikes;
        this.moviesDislikes=moviesDislikes;
        this.moviesName=moviesName;
        mLayoutInflator=LayoutInflater.from(context);

    }

    @Override
    public int getCount() {

        return moviesName.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView=mLayoutInflator.inflate(R.layout.custom_list_view_design,null);

        ImageView imgVuThunmbnail=(ImageView)convertView.findViewById(R.id.img_vu_movie_thumbnail);
        TextView txtVuTitle=(TextView)convertView.findViewById(R.id.txt_vu_movie_title);
        TextView txtVuSubtitle=(TextView)convertView.findViewById(R.id.txt_vu_movie_subtitle);
        TextView txtVuLikes=(TextView)convertView.findViewById(R.id.txt_vumovie_likes);
        TextView txtVuDislikes=(TextView)convertView.findViewById(R.id.txt_vumovie_dislikes);

        imgVuThunmbnail.setImageResource(moviesThumbnail[position]);
        txtVuTitle.setText(moviesName[position]);
        txtVuSubtitle.setText(moviesSubtitle[position]);
        txtVuLikes.setText(moviesLikes[position]);
        txtVuDislikes.setText(moviesDislikes[position]);

        /*Main mistake : we did not return convert view so always return convertView*/

        return convertView;
    }
}
