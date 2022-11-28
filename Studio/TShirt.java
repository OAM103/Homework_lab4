package com.metanit.Studio;

public class TShirt extends Clothes implements ManClothing, WomenClothing {
    public void dressMan() {
        System.out.println("TShirt is on man!");
    }
    public void dressWomen() {
        System.out.println("TShirt is on woman!");
    }
}
