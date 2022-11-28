package com.metanit.Studio;

public class Pants extends Clothes implements ManClothing, WomenClothing {
    public void dressMan() {
        System.out.println("Pants are on man!");
    }
    public void dressWomen() {
        System.out.println("Pants are on woman!");
    }
}
