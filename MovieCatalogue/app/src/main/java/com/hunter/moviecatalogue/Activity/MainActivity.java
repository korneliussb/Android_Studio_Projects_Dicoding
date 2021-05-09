package com.hunter.moviecatalogue.Activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.hunter.moviecatalogue.Adapter.MovieAdapter;
import com.hunter.moviecatalogue.Model.Movie;
import com.hunter.moviecatalogue.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] judul, penjelasan, genre;
    private TypedArray gambar;
    private MovieAdapter adapter;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MovieAdapter(this);

        ListView listView = findViewById(R.id.list_movie);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, movies.get(i).getJudul(), Toast.LENGTH_SHORT).show();
                Intent moveWithObject = new Intent(MainActivity.this, DetailActivity.class);

                ArrayList<Movie> movies = new ArrayList<Movie>();

                Movie movie = new Movie();
                movie.setGambar(gambar.getResourceId(i, -1));
                movie.setJudul(judul[i]);
                movie.setPenjelasan(penjelasan[i]);
                movie.setGenre(genre[i]);

                movies.add(movie);

                moveWithObject.putParcelableArrayListExtra(DetailActivity.EXTRA_MOVIE, movies);
                startActivity(moveWithObject);
            }
        });
    }

    private void prepare() {
        judul = getResources().getStringArray(R.array.judul);
        penjelasan = getResources().getStringArray(R.array.penjelasan);
        genre = getResources().getStringArray(R.array.genre);
        gambar = getResources().obtainTypedArray(R.array.gambar);
    }

    private void addItem() {
        movies = new ArrayList<>();

        for (int i = 0; i < judul.length; i++) {
            Movie movie = new Movie();
            movie.setGambar(gambar.getResourceId(i, -1));
            movie.setJudul(judul[i]);
            movie.setPenjelasan(penjelasan[i]);
            movie.setGenre(genre[i]);
            movies.add(movie);
        }

        adapter.setMovies(movies);
    }
}
