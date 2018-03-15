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
    }
}
//jei nera static, kvieciame taip = Skaiciavimai a = new Skaiciavimai(); + a.isEven(12);