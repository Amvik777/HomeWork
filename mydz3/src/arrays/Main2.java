import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int a= scan.nextInt();
        System.out.print("Введите минимум в массиве: ");
        int min= scan.nextInt();
        System.out.print("Введите максимум значение в массиве: ");
        int max= scan.nextInt();
        if (a<=0) {
            System.out.print("Ошибка! Введите длину повторно: ");
            a= scan.nextInt();
        }
        else if (min>=max){
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимум значение в массиве: ");
            min= scan.nextInt();
            System.out.print("Введите максимум значение в массиве: ");
            max= scan.nextInt();
        }
        int[] mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * (max - min)) + min);
            System.out.print(mass[i] + ", ");
        }
    }

}