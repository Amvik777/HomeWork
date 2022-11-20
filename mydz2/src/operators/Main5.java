import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести число A");
        float A = in.nextFloat();
        System.out.println("Ввести число B");
        float B = in.nextFloat();
        if (B == 0) {
            System.out.println("B не может быть 0");
        }
        System.out.println("Выбери действие: 1-сложение, 2-вычитание, 3-умножение, 4-деление");
        int N = in.nextInt();
        if (N == 1) {
            System.out.println("Сумма A и B равна " + (A + B));
        }  else if (N == 2 & A > B) {
            System.out.println("Разница A и B равна " + (A - B));
        }  else if (N == 3) {
            System.out.println("Произведение A и B равен " + (A * B));
        }  else if (N == 4) {
            System.out.println("Частное A и B равна " + (A / B));
        }
    }
}