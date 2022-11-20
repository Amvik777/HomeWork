import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int N= scan.nextInt();
        System.out.print("Введите минимум значение в массиве: ");
        int A= scan.nextInt();
        System.out.print("Введите максимум значение в массиве: ");
        int B= scan.nextInt();
        if (N<=0) {
            System.out.print("Ошибка! Введите длину повторно: ");
            N= scan.nextInt();
        }
        else if (A>=B){
            System.out.println("Некорректный диапазон");
            System.out.print("Введите минимум значение в массиве: ");
            A= scan.nextInt();
            System.out.print("Введите максимум значение в массиве: ");
            B= scan.nextInt();
        }
        int[] mass = new int[N];
        System.out.println("Массив: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * (B - A)) + A);
            System.out.print(mass[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("Отсорт. массив: ");
        for (int i =0;i< mass.length/2;i++){
            int temp=mass[i];
            mass[i]=mass[mass.length-i-1];
            mass[mass.length-i-1]=temp;
        }
        for(int i=0;i< mass.length;i++){
            System.out.print(mass[i] + ", ");}
    }
}