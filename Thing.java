package com.metanit;

import java.util.Scanner;

public enum Thing{
    shirt("Рубашка", 1400),
    pants("Брюки", 3600),
    hat("Шляпа", 1750),
    boots("Сапоги", 3200),
    slippers("Тапки", 1800),
    felt_boots("Валенки", 3500);

    String nameThing;
    int cost;

    private Thing(String nameThing, int cost) {
        this.nameThing = nameThing;
        this.cost = cost;
    }
    public String getNameThing () {
        return this.nameThing;
    }

    public int getCost() { return cost; }



    public static class Category {
        String nameCategory;
        Thing[] things;

        Category(String nameCategory, Thing[] things) {
            this.nameCategory = nameCategory;
            this.things = things;
        }
    }


    public static void getMenu() {
        System.out.println("1.Товары");
        System.out.println("2.Корзина");
        System.out.println("3.Оплатить");
        System.out.println("0.Выход");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                getBasket(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
            case 0: {
                break;
            }
        }
    }

    public static void Buy() {

        double gc = getCash(card);
        System.out.print("Общая сумма покупок составляет: " + gc);
        System.exit(0);
    }
    public static double getCash(Thing[] p) {
        int cash = 0;
        for(int i = 0; i < p.length; i++) {
            if(p[i] == null) break;
            cash+=p[i].cost;
        }
        return cash;
    }

    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; i++) System.out.println((i+1) + ". " + c[i].nameCategory);
        System.out.println("0. Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 0)getMenu();
        else seeThing(all[number-1]);

    }
    public static void getBasket(Thing[] b) {
        for(int i = 0; i < b.length; i++) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameThing + ": " + b[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }

    public static void seeThing(Category cat) {
        for(int i = 0; i < cat.things.length; ++i) {
            System.out.println((i+1) + ". " + cat.things[i].nameThing + ": " + cat.things[i].cost);
        }
        System.out.println("0.Назад");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyThing(cat.things[number-1]);
        getCategory(all);
    }

    private static void buyThing(Thing p) {
        System.out.println( p.nameThing + " за " + p.cost + " в вашей корзине");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }

        }
        getCategory(all);
    }


    static Thing[] Clothing = { shirt, pants, hat };
    static Thing[] Shoes = { boots, slippers, felt_boots };

    static Category clothing = new Category("Одежда", Clothing);
    static Category shoes = new Category("Обувь", Shoes);

    static Category[] all = { clothing, shoes };
    static Thing[] card;
    public static void main(String[] args) {
        card = new Thing[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин и пароль пользователя:");
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        getMenu();

    }

}

