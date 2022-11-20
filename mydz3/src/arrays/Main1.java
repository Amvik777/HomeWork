import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[4];
        int max = 99;
        int min = 10;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(mass[i] + ", ");
        }
        if (mass[0]<mass[1]&mass[1]<mass[2]&mass[2]<mass[3]) {
            System.out.println("Массив - строго возрастающая последовательность");
        } else {

            System.out.println("Массив - НЕ строго возрастающая последовательность");
        }


    }

}