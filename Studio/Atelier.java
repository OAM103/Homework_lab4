package com.metanit.Studio;

import java.util.ArrayList;

public abstract class Atelier extends Clothes implements ManClothing, WomenClothing {

    static ArrayList<Clothes> list = new ArrayList<>();


    public static void showDressMan(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof ManClothing) {
                ((ManClothing) list.get(i)).dressMan();
            }
        }
    }

    public static void showDressWomen(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof WomenClothing) {
                ((WomenClothing) list.get(i)).dressWomen();
            }

        }
    }

    public static void main(String[] args) {
        list.add(new Pants());
        list.add(new Tie());
        list.add(new TShirt());
        list.add(new Skirt());
        showDressMan(list);
        showDressWomen(list);
    }
}
