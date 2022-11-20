import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[20];
        int max = 300;
        int min = 25;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(mass[i] + ", ");
        }
        System.out.println("  ");
        Scanner a = new Scanner(System.in);
        System.out.print("Введите искомое число: ");

        int n = a.nextInt();
        int z = -1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == n) {
                z = i;
                System.out.println("Число " + n + " находится под индексом " + z);
            }

        }
        if (z < 0) {

            System.out.println("Искомого числа " + n + " нет в массиве");

        }
    }
}
