package com.project.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    String judul, deskripsi, penerbit, tanggal_terbit, jumlah_halaman;
    TextView tvJudul, tvDeskripsi, tvPenerbit, tvTanggal_terbit, tvJumlah_halaman;
    ImageView imgBook;

    public static final String EXTRA_BOOK = "extra_book";
    int path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.detail_judul);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvPenerbit = findViewById(R.id.tv_penerbit);
        tvTanggal_terbit = findViewById(R.id.tv_tanggal_terbit);
        tvJumlah_halaman = findViewById(R.id.tv_jumlah_halaman);
        imgBook = findViewById(R.id.img_item_photo);

        ArrayList<Book> book = this.getIntent().getParcelableArrayListExtra(EXTRA_BOOK);

        judul = book.get(0).getJudul();
        tvJudul.setText(judul);

        deskripsi = book.get(0).getDeskripsi();
        tvDeskripsi.setText(deskripsi);

        penerbit = book.get(0).getPenerbit();
        tvPenerbit.setText(penerbit);

        tanggal_terbit = book.get(0).getTanggal_terbit();
        tvTanggal_terbit.setText(tanggal_terbit);

        jumlah_halaman = book.get(0).getJumlah_halaman();
        tvJumlah_halaman.setText(jumlah_halaman);

        path = book.get(0).getGambar();
        imgBook.setImageResource(path);
    }
}
