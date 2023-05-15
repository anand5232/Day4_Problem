import java.util.Random;
import java.util.Scanner;

class Toss {
    public String chanceFunc() {
        Random r = new Random();
        int chance = r.nextInt(2);
        if (chance == 1) {
            return"tails";
        } else {
            return"heads";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Toss t = new Toss();
        int heads = 0;
        int tails = 0;
        int chances = 10;
        for (int i = 1; i<= chances; i++) {
            if (t.chanceFunc().equals("tails")) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.println("Chances = " + chances);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);

        }


    public static void leapYear(){
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("it is a leap year");
        else
            System.out.println("it  is not a leap year");
    }



}