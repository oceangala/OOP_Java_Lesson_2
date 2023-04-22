package HomeWork2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //Cat cat1 = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        //cat1.eat(cat1.getAppetite(), plate.getFood());
        //plate.setFood(plate.getFood() - cat1.getAppetite());

        Cat cat1 = new Cat("Barsik", 25, true);
        Cat cat2 = new Cat("Mao", 15, true);
        Cat cat3 = new Cat("Boss", 30, true);
        Cat cat4 = new Cat("Lady", 36, true);
        Cat cat5 = new Cat("Mint", 38, true);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};


        for (Cat cat : cats) {
            while (true) {
                if (cat.eat(cat.getAppetite(), plate.getFood()) & cat.getHunger()) {
                    plate.setFood(cat.whatLeftOnThePlate(cat.getAppetite(), plate.getFood()));
                    cat.setHunger(false);
                    System.out.printf("%s got food and now is happy.\n", cat.getName());
                    plate.info();
                    break;
                } else {
                    System.out.printf("%s stays hungry.\n", cat.getName());
                    System.out.println("\nWanna add some food on cat's plate?\n" +
                            "    press 1 to add food\n" +
                            "    press 2 to left it as it is");
                    Scanner sn = new Scanner(System.in);
                    int choice = sn.nextInt();
                    if (choice != 1) break;
                    else {
                        System.out.println("Print quantity of food to add");
                        plate.FillThePlate(sn.nextInt());
                        plate.info();
                    }
                }
            }

        }

        for (Cat cat : cats){
            if (cat.getHunger()) System.out.printf("Seems you don't really like %s " +
                    "'couse %s is still sad and hungry.\n", cat.getName(), cat.getName());
        }


    }
}
