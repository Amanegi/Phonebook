package com.example.aman_negi.phonebooklistview;

/**
 * Created by Aman_Negi on 04-02-2018.
 */

public class RowLayout {
    private int image;
    private String name, number;

    public RowLayout(int image, String name, String number) {
        this.image = image;
        this.name = name;
        this.number = number;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
