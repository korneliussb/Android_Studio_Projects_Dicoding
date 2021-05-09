package com.hunter.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Buah implements Parcelable {
    private String name, remarks, photo, deskripsi, latin, manfaat;

    protected Buah(Parcel in) {
        name = in.readString();
        remarks = in.readString();
        photo = in.readString();
        deskripsi = in.readString();
        latin = in.readString();
        manfaat = in.readString();
    }

    public static final Creator<Buah> CREATOR = new Creator<Buah>() {
        @Override
        public Buah createFromParcel(Parcel in) {
            return new Buah(in);
        }

        @Override
        public Buah[] newArray(int size) {
            return new Buah[size];
        }
    };

    public Buah() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String lahir) {
        this.latin = latin;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(this.photo);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.latin);
        parcel.writeString(this.manfaat);
    }
}

