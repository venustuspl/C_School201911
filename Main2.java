import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void makeChristmasTree(int width) {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < (width - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1); k++)
                System.out.print("X ");

            System.out.println("");
        }

    }

    public static void makeNumberChristmasTree(int width) {

        for (int i = 0; i <= width; i++) {
            for (int j = 0; j < (width - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
                if (k <= (i / 2))
                    System.out.print(k + " ");
                else
                    System.out.print(i - k + 1 + " ");

            System.out.println("");
        }

    }

    public static void makePascalTriangle(int width) {

        List<Integer> rowList = new ArrayList<>();

        int x = 0;

        for (int i = 0; i <= width; i++) {
            for (int j = 0; j < (width - i); j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= i; k++)
                if ((k == 1) || (k == i)) {
                    System.out.print(1 + " ");
                    rowList.add(1);

                } else {
                    x = rowList.get(rowList.size() - i + 1) + rowList.get(rowList.size() - i);
                    System.out.print(x + " ");
                    rowList.add(x);

                }
            System.out.println("");
        }

    }


    public static void main(String[] args) {

        //  Main2.makeChristmasTree(10);

        //Main2.makeNumberChristmasTree(10);

        // Main2.makePascalTriangle(7);
        ServiceCategory important = new ServiceCategory("important");

        List<Mem> memList = new ArrayList<>();

        Mem mem1 = new Mem("mem1", "opis1", true,important);
        mem1.setUrl("http://wp.pl");

        memList.add(mem1);

        memList.stream()
                .filter(o -> o.isFavorite() == true)
                .forEach(System.out::println);

       // for (Mem entry : memList)
         //   System.out.println(mem1);

        System.out.println("End");

        Case case1 = new Case("Janusz", "janusz@o2.pl", LocalDate.of(2019,10,01));

        System.out.println(case1.isOlderThan2Weeks());

        Product product1 = new Product("apple",2,important);

        System.out.println(product1);






    }

}
