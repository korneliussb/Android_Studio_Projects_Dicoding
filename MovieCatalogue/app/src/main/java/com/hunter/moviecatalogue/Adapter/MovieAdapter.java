package com.hunter.moviecatalogue.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hunter.moviecatalogue.Model.Movie;
import com.hunter.moviecatalogue.R;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Movie movie = (Movie) getItem(i);
        viewHolder.bind(movie);
        return view;
    }

    private class ViewHolder{
        private TextView txtMovie;
        private TextView txtPenjelasan;
        private ImageView imgGambar;

        ViewHolder(View view) {
            txtMovie = view.findViewById(R.id.txt_judul);
            txtPenjelasan = view.findViewById(R.id.txt_penjelasan);
            imgGambar = view.findViewById(R.id.img_movie);
        }

        void bind(Movie movie) {
            txtMovie.setText(movie.getJudul());
            txtPenjelasan.setText(movie.getPenjelasan());
            imgGambar.setImageResource(movie.getGambar());
        }
    }
}
