import java.util.*;

import static com.sun.tools.doclint.Entity.or;

public class Main {

    public static void drawFigure(Integer side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if ((j == i) || (j == (side - i - 1))) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

    }

    public static void drawMatrix(Integer a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

    }

    public static int[] vectorRomSum(int[][] tab) {

        int sum = 0;
        int result[] = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                sum += tab[i][j];

            }

            result[i] = sum;
            sum = 0;
        }

        return result;

    }

    public static int[] vectorColumnSum(int[][] tab) {

        int sum = 0;
        int result[] = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++)
                sum = sum + tab[j][i];

            result[i] = sum;
            sum = 0;
        }

        return result;

    }

    public static int[] maxAndMinTabValue(int[][] tab) {

        int max = tab[0][0];
        int min = tab[0][0];

        int result[] = new int[4];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[i][j] > max) {
                    result[0] = i;
                    result[1] = j;
                    max = tab[i][j];
                }
                if (tab[i][j] < min) {
                    result[2] = i;
                    result[3] = j;
                    min = tab[i][j];
                }

            }
        }
        return result;

    }

    public static void drawBeautyMatrix(Integer a) {
        int border = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                int l1 = (a - 1 - i);
                int l2 = (a - 1 - j);

                border = Math.min(Math.min(l1, l2), Math.min(i, j));

                System.out.print(border % 2 == 0 ? "x " : "o ");
            }
            System.out.println();
        }

    }

    public static void drawNumberMatrix(Integer a) {
        int border = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                int l1 = (a - 1 - i);
                int l2 = (a - 1 - j);

                border = Math.min(Math.min(l1, l2), Math.min(i, j));


                System.out.print(a - border - 1);


            }
            System.out.println();
        }

    }

    public static void drawNumber2Matrix(Integer a) {
        int border = 0;
        int limit = (a * 2) + 1;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {

                int l1 = (limit - 1 - i);
                int l2 = (limit - 1 - j);

                border = Math.min(Math.min(l1, l2), Math.min(i, j));


                System.out.print(Math.abs(border) + " ");


            }
            System.out.println();
        }

    }

    public static void drawNumber3Matrix(Integer a) {
        int border = 0;
        int limit = (a * 2) - 1;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {

                int l1 = (limit - 1 - i);
                int l2 = (limit - 1 - j);

                border = Math.min(Math.min(l1, l2), Math.min(i, j));


                System.out.print(Math.abs(a - Math.abs(border) - 1) + " ");


            }
            System.out.println();
        }

    }

    public static int[] reverseTab(int[] tab) {

        int[] result = new int[tab.length];
        int j = 0;
        for (int i = tab.length - 1; i >= 0; i--) {

            result[j] = tab[i];

            j++;

        }

        return result;

    }

    public static void checkString(String text) {

        int smallL = 0;
        int bigL = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                smallL++;
            } else {
                bigL++;
            }
        }

        System.out.println("Małe liter: " + smallL);

        System.out.println("Dużę litery: " + bigL);

    }

    public static void differenceTab(int[] tab1, int[] tab2) {

        Set<Integer> commonList = new HashSet<>();
        Set<Integer> difference1sList = new HashSet<>();

        int check = 0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {

                if (tab1[i] == tab2[j])

                    commonList.add(tab1[i]);
                }
            }

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {

                if (!commonList.contains(tab1[i]))
                    difference1sList.add(tab1[i]);
                if (!commonList.contains(tab2[j]))
                    difference1sList.add(tab2[j]);

            }
        }


        System.out.println("Wspólne liczby: ");

        for (int entry : commonList)
            System.out.print(entry + " ");
        System.out.println();

        System.out.println("Różne liczby: ");

        for (int entry : difference1sList)
            System.out.print(entry + " ");

    }

    public static int[] mySort(int [] tab){

        int change = 0;

        int number;

        for (int i = 0; i < tab.length; i++){

            if (i + 1 != tab.length){
            if (tab[i]>tab[i+1]){

                number = tab[i+1];
                tab[i+1] = tab [i];
                tab[i] = number;

                change++;
            }
            }

            }

        if (change > 0 )
            mySort(tab);

        return tab;
    }

    public static void main(String[] args) {

        // Main.drawFigure(7);

        // System.out.println();

        // Main.drawMatrix(7);

        int tab[][] = new int[4][4];

        Random generator = new Random();

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = generator.nextInt(5);
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }

        int wynik[] = Main.vectorRomSum(tab);

        System.out.print("Suma wierszy: ");

        for (int i = 0; i < wynik.length; i++)
            System.out.print(wynik[i] + " ");

        wynik = Main.vectorColumnSum(tab);

        System.out.print("Suma kolumn: ");

        for (int i = 0; i < wynik.length; i++)
            System.out.print(wynik[i] + " ");

        wynik = Main.maxAndMinTabValue(tab);
        System.out.println("Max znajduje się na pozycji: " + wynik[0] + " , " + wynik[1] +
                " a min : " + wynik[2] + " , " + wynik[3]
        );


        System.out.println();

        Main.drawNumberMatrix(7);

        System.out.println();

        Main.drawNumber2Matrix(4);

        System.out.println();

        Main.drawNumber3Matrix(7);


        int[] mytab = new int[]{5, 4, 3};

        int[] result = Main.reverseTab(mytab);

        for (int entry : result) {
            System.out.println(entry);
        }

        System.out.println("---");

        Main.checkString("MaTrIx");

        System.out.println("---");

        int[] newTab = new int[]{6, 8, 2,5};

        int[] newTab1 = new int[]{ 7, 4,2,6};

        Main.differenceTab( newTab, newTab1);

        int[] tabResult = Main.mySort(newTab1);

        for (int i = 0; i< tabResult.length; i++)
            System.out.print(tabResult[i]);

        System.out.println();


        System.out.println("End of the program.");

    }
}
