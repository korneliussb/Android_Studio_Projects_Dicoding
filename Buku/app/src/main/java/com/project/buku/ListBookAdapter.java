package com.project.buku;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBookAdapter extends RecyclerView.Adapter<ListBookAdapter.ListViewHolder> {

    private ArrayList<Book> listBook;

    private Context context;
    private Activity activity;

    public ListBookAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

//asli
    public ListBookAdapter(ArrayList<Book> list){
        this.listBook = list;
    }
//a

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_book, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(book.getName());
        holder.tvDetail.setText(book.getDetail());
        holder.tvPenerbit.setText(book.getPenerbit());
        holder.tvTanggalTerbit.setText(book.getTanggal_terbit());
        holder.tvJumlahHalaman.setText(book.getJumlah_halaman());
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvPenerbit, tvTanggalTerbit, tvJumlahHalaman;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvPenerbit = itemView.findViewById(R.id.tv_item_penerbit);
            tvTanggalTerbit = itemView.findViewById(R.id.tv_item_tanggal_terbit);
            tvJumlahHalaman = itemView.findViewById(R.id.tv_jumlah_halaman);

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("key", listBook);
            context.startActivity(intent);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Book data);
    }


}
