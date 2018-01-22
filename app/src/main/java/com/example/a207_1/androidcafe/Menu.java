package com.example.a207_1.androidcafe;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 207-1 on 15/01/2018.
 */

public class Menu implements Parcelable {
    private String itemName;
    private String category;
    private String depscription;
    private int sort;
    private int price;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepscription() {
        return depscription;
    }

    public void setDepscription(String depscription) {
        this.depscription = depscription;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.itemName);
        dest.writeString(this.category);
        dest.writeString(this.depscription);
        dest.writeInt(this.sort);
        dest.writeInt(this.price);
        dest.writeString(this.image);
    }

    public Menu() {
    }

    protected Menu(Parcel in) {
        this.itemName = in.readString();
        this.category = in.readString();
        this.depscription = in.readString();
        this.sort = in.readInt();
        this.price = in.readInt();
        this.image = in.readString();
    }

    public static final Parcelable.Creator<Menu> CREATOR = new Parcelable.Creator<Menu>() {
        @Override
        public Menu createFromParcel(Parcel source) {
            return new Menu(source);
        }

        @Override
        public Menu[] newArray(int size) {
            return new Menu[size];
        }
    };
}
