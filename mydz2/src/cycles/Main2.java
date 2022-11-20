import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }
        while (a<=100);
    }
}