
import java.util.Scanner;

public enum Seasons {
    Winter (1, -10),
    Spring(2, 11),
    Summer(3, 22),
    Autumn(4, 13);

    private final int levelS;
    int temperS;

    private Seasons(int levelS, int temperS) {
        this.levelS = levelS;
        this.temperS= temperS;
    }
    public int getLevelS () {
        return this.levelS;
    }

    public int getTemperS() {
        return temperS;
    }

    public void setTemperS(int temperS) {
        this.temperS = temperS;
    }

    public static void main(String[] args) {
        Seasons S = Seasons.Spring;
        Scanner sc = new Scanner(System.in);

        System.out.println (S.getLevelS());

        switch (S) {
            case Winter:
                System.out.println ("Я люблю зиму");
                break;
            case Spring:
                System.out.println ("Я люблю весну");
                break;
            case Summer:
                System.out.println ("Я люблю лето");
                break;
            case Autumn:
                System.out.println ("Я люблю осень");
                break;
        }

        System.out.print("Введите среднюю температуру: ");
        int temp = sc.nextInt();
        S.setTemperS(temp);
        System.out.println ("Теперь ср. температура: "+ S.getTemperS());

        getDescription(S);

        for (Seasons s : Seasons.values()) {
            System.out.println(s + ": Number - " + s.getLevelS() + "; Temperature - " + s.getTemperS());
        }

    }

    public static void getDescription(Seasons S){
        switch (S) {
            case Spring:
            case Summer:
                System.out.println ("Теплое время года");
                break;
            case Winter:
            case Autumn:
                System.out.println ("Холодное время года");
                break;
        }
    }
}




