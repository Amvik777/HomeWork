import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x>z && y>z){
            System.out.println(x+y);
        } else if (x>y && z>y) {
            System.out.println(x + z);
        }  else if (y>x && z>x) {
            System.out.println(y+z);
            } else if (y>x && z>x ) {
            System.out.println(y+z);
        } else {
            System.out.println("Ошибка");
        }
    }
}