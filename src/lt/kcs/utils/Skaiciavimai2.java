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

    public static void dvimatis() {

        int[][] dvimatisMasyvas = new int[10][5];

        for (int a = 0; a < dvimatisMasyvas.length; a++) {
            for (int b = 0; b < dvimatisMasyvas[a].length; b++) {
                System.out.print(dvimatisMasyvas[a][b]);
            }
            System.out.println();
        }

    }

    public static void fibonacci(int kartai) {
        int fibonaciukas1 = 0;
        int fibonaciukas2 = 1;
        int fibonaciukas3;

        int i;

        System.out.print(fibonaciukas1 + " " + fibonaciukas2);

        for (i = 2; i < kartai; i++) {
            fibonaciukas3 = fibonaciukas1 + fibonaciukas2;
            System.out.print(" " + fibonaciukas3);
            fibonaciukas1 = fibonaciukas2;
            fibonaciukas2 = fibonaciukas3;
        }

    }
    public static void faktiorialas(int ikiKiek) {
        int sum = 1;
        for (int i = 1; i <= ikiKiek; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

}
