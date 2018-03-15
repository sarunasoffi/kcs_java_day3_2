package lt.kcs.utils;

public class Skaiciavimai2 {

    public static void printRectangle(int eilute, int stulpelis) {

        for (int i = 1; i <= eilute; i++) {
            int val = i % 2 == 0 ? stulpelis-1 : stulpelis;
                for (int j = 0; j < val; j++) {
                    System.out.print("#");
                }
            System.out.println();
        }

    }
}
