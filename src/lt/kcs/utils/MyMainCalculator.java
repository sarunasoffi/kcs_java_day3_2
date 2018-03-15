package lt.kcs.utils;

public class MyMainCalculator {

    public static void main(String[] args) {
        boolean val = Skaiciavimai.isEven(12);

        if (val) {
            System.out.println("lyginis");
        } else {
            System.out.println("nelyginis");
        }

        System.out.println(" ");
        Skaiciavimai.last();

        System.out.println(" ");
        Skaiciavimai.first();

        System.out.println(" ");
        Skaiciavimai.total();

        System.out.println("Padariau update");

        //git add src\lafazknfan\nfam\ngm.java

        Skaiciavimai.daliklioTikrinimas(3, 5);
    }
}
//jei nera static, kvieciame taip = Skaiciavimai a = new Skaiciavimai(); + a.isEven(12);