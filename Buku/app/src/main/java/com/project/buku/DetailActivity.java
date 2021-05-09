package com.project.buku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Book buku = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView detail = (TextView)findViewById(R.id.tv_item_detail);
        TextView penerbit = (TextView)findViewById(R.id.tv_item_penerbit);
        TextView tanggal = (TextView)findViewById(R.id.tv_item_tanggal_terbit);
        TextView jumlah = (TextView)findViewById(R.id.tv_jumlah_halaman);

        Glide.with(this).load(buku.getPhoto()).into(gambar);
        name.setText(buku.getName());
        detail.setText(buku.getDetail());
        penerbit.setText(buku.getPenerbit());
        tanggal.setText(buku.getTanggal_terbit());
        jumlah.setText(buku.getJumlah_halaman());

//        Log.i("photo", buku.getPhoto());
        Log.i("deskripsi", buku.getDetail());
    }
}
