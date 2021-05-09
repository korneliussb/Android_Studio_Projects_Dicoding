package com.project.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] judul, deskripsi, penerbit, tanggal_terbit, jumlah_halaman;
    private TypedArray gambar;
    private BookAdapter adapter;
    private ArrayList<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new BookAdapter(this);

        ListView listView = findViewById(R.id.list_book);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, books.get(i).getJudul(), Toast.LENGTH_SHORT).show();
                Intent moveWithObject = new Intent(MainActivity.this, DetailActivity.class);

                ArrayList<Book> books = new ArrayList<Book>();

                Book book = new Book();
                book.setGambar(gambar.getResourceId(i, -1));
                book.setJudul(judul[i]);
                book.setDeskripsi(deskripsi[i]);
                book.setPenerbit(penerbit[i]);
                book.setTanggal_terbit(tanggal_terbit[i]);
                book.setJumlah_halaman(jumlah_halaman[i]); //jumlah halaman

                books.add(book);

                moveWithObject.putParcelableArrayListExtra(DetailActivity.EXTRA_BOOK, books);
                startActivity(moveWithObject);
            }
        });
    }


    private void prepare(){
        judul = getResources().getStringArray(R.array.judul);
        deskripsi = getResources().getStringArray(R.array.deskripsi);
        penerbit = getResources().getStringArray(R.array.penerbit);
        tanggal_terbit = getResources().getStringArray(R.array.tanggal_terbit);
        jumlah_halaman = getResources().getStringArray(R.array.jumlah_halaman);
        gambar = getResources().obtainTypedArray(R.array.gambar);

    }

    private void addItem() {
        books = new ArrayList<>();

        for (int i = 0; i < judul.length; i++){
            Book book = new Book();
            book.setGambar(gambar.getResourceId(i, -1));
            book.setJudul(judul[i]);
            book.setDeskripsi(deskripsi[i]);
            book.setPenerbit(penerbit[i]);
            book.setTanggal_terbit(tanggal_terbit[i]);
            book.setJumlah_halaman(jumlah_halaman[i]);
            books.add(book);
        }
        adapter.setBooks(books);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about ) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


}
