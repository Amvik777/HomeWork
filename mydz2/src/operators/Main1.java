import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Давай число: ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("Ок, брат... это четное число!");
        } else {
            System.out.println("Не-а, брат... это НЕ четное число!");
        }

    }
}

