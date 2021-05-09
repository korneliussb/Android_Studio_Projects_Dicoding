package com.project.bookapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {

    private String judul;
    private String deskripsi;
    private String penerbit;
    private String tanggal_terbit;
    private String jumlah_halaman;
    private int gambar;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTanggal_terbit() {
        return tanggal_terbit;
    }

    public void setTanggal_terbit(String tanggal_terbit) {
        this.tanggal_terbit = tanggal_terbit;
    }

    public String getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(String jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

//    public static Creator<Book> getCREATOR() {
//        return CREATOR;
//    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.deskripsi);
        dest.writeString(this.penerbit);
        dest.writeString(this.tanggal_terbit);
        dest.writeString(this.jumlah_halaman);
        dest.writeInt(this.gambar);
    }

    public Book(){

    }

    protected Book(Parcel in) {
        this.judul = in.readString();
        this.deskripsi = in.readString();
        this.penerbit = in.readString();
        this.tanggal_terbit = in.readString();
        this.jumlah_halaman = in.readString();
        this.gambar = in.readInt();

    }

    public static final Parcelable.Creator<Book> CREATOR = new Parcelable.Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel source) {
            return new Book(source);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

}
