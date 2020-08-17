package com.codingwithmitch.swipingviewpager.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;

public class Hat implements Parcelable {

    private String title;
    private int image;
    private String descrip;
    private int serial_number;

    public Hat(String title, int image, String descrip, int serial_number) {
        this.title = title;
        this.image = image;
        this.descrip = descrip;
        this.serial_number = serial_number;
    }

    public Hat(Hat product) {
        this.title = product.title;
        this.image = product.image;
        this.descrip = product.descrip;
        this.serial_number = product.serial_number;
    }


    protected Hat(Parcel in) {
        title = in.readString();
        image = in.readInt();
        serial_number = in.readInt();
    }

    public static final Creator<Hat> CREATOR = new Creator<Hat>() {
        @Override
        public Hat createFromParcel(Parcel in) {
            return new Hat(in);
        }

        @Override
        public Hat[] newArray(int size) {
            return new Hat[size];
        }
    };

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

//    public String getPrice() {
//        return descrip;
//    }
//
//    public void setPrice(String descrip) {
//        this.descrip = descrip;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(image);
        dest.writeInt(serial_number);
    }
}