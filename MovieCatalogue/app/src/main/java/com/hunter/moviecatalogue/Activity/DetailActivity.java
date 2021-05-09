package com.hunter.moviecatalogue.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hunter.moviecatalogue.Model.Movie;
import com.hunter.moviecatalogue.R;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    String judul, penjelsan, genre;
    TextView tvJudul, tvPenjelsan, tvGenre;
    ImageView imgMovie;

    public static final String EXTRA_MOVIE = "extra_movie";
    int path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.detail_judul);
        tvPenjelsan = findViewById(R.id.tv_penjelasan);
        tvGenre = findViewById(R.id.tv_genre);
        imgMovie = findViewById(R.id.detail_img);

        ArrayList<Movie> movie = this.getIntent().getParcelableArrayListExtra(EXTRA_MOVIE);

        judul = movie.get(0).getJudul();
        tvJudul.setText(judul);

        penjelsan = movie.get(0).getPenjelasan();
        tvPenjelsan.setText(penjelsan);

        genre = movie.get(0).getGenre();
        tvGenre.setText(genre);

        path = movie.get(0).getGambar();
        imgMovie.setImageResource(path);

    }
}