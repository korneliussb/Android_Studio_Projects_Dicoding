package com.project.bookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Book> books;

    public BookAdapter(Context context){
        this.context = context;
        books = new ArrayList<>();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int i) {
        return books.get(i);
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
        Book book = (Book) getItem(i);
        viewHolder.bind(book);
        return view;
    }

    private class ViewHolder{
        private TextView tvBook;
        private TextView tvDeskripsi;
//        private TextView tvPenerbit;
//        private TextView tvTanggal_terbit;
//        private TextView tvJumlah_halaman;
        private ImageView imgGambar;

        ViewHolder(View view) {
            tvBook = view.findViewById(R.id.tv_judul);
            tvDeskripsi = view.findViewById(R.id.tv_deskripsi);
//            tvPenerbit = view.findViewById(R.id.tv_penerbit);
//            tvTanggal_terbit = view.findViewById(R.id.tv_tanggal_terbit);
//            tvJumlah_halaman = view.findViewById(R.id.tv_jumlah_halaman);
            imgGambar = view.findViewById(R.id.img_book);
        }

        void bind(Book book) {
            tvBook.setText(book.getJudul());
            tvDeskripsi.setText(book.getDeskripsi());
//            tvPenerbit.setText(book.getPenerbit());
//            tvTanggal_terbit.setText(book.getTanggal_terbit());
//            tvJumlah_halaman.setText(book.getJumlah_halaman());
            imgGambar.setImageResource(book.getGambar());
        }
    }
}
