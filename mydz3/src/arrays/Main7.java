import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int N = a.nextInt();
        System.out.print("Введите минимум в массиве: ");
        int A = a.nextInt();
        System.out.print("Введите максимум в массиве: ");
        int B = a.nextInt();
        if (N <= 0) {
            System.out.print("Ошибка! Введите длину повторно: ");
            N = a.nextInt();
        } else if (A >= B) {
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимум в массиве: ");
            A = a.nextInt();
            System.out.print("Введите максимум в массиве: ");
            B = a.nextInt();
        }
        int[] mass = new int[N];
        System.out.print("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * (B - A)) + A);
            System.out.print(mass[i] + ", ");
        }
        System.out.println(" ");
        System.out.print("искомое число: ");
        int k = a.nextInt();
        int b = -1;
        int b2=-1;
        int step = 0;
        int step2=0;
        for (int i = 0; i < mass.length; i++) {
            step++;
            if (mass[i] == k) {
                b = i;
                break;
            }
        }
        if (b >= 0) {
            System.out.println("Число " + k + " находится под индексом " + b);
            System.out.println("Линейный поиск: " + step + " шаг(а/ов)");
        }
        else {System.out.println("Искомого числа " + k + " нет в массиве");}


    }

}
