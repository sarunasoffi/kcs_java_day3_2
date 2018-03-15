package lt.kcs.utils;

import java.util.Scanner;

public class Skaiciavimai {

    // ar lyginis

    public static boolean isEven(int numb) {
        return numb%2==0;
    }

    //rastu perduoto skaiciaus paskutini skaitmeni

    public static void last() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu (tikrinsime paskutini skaiciu koki ivedete)");
        String ivestis = sc.nextLine();
        char last = ivestis.charAt(ivestis.length() - 1); // last char is at index length - 1
        System.out.println("Paskutinis skaicius yra = " + last);
    }

    public static void first() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu (tikrinsime pirmaji skaiciu koki ivedete)");
        String ivestis = sc.nextLine();
        char last = ivestis.charAt(0); // last char is at index length - 1
        System.out.println("Pirmasis skaicius yra = " + last);
    }

    public static void total() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu (skaiciuosime kiek ivedete skaitmenu)");
        String ivestis = sc.nextLine();
        int length = ivestis.length( ); // length == 8
        System.out.println("Jus ivedete = " + length + " skaicius");
    }

    public static void daliklioTikrinimas(int daliklis, int skaiciuKiekis) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < skaiciuKiekis; i++) {
            System.out.println("Iveskite skaiciu: ");
            int arDalijasi = sc.nextInt();
            if (arDalijasi % daliklis == 0) {
                System.out.println(arDalijasi);
            } else {
                System.out.println("Nesidalija, nebesvaik");
            }
        }
    }



}
