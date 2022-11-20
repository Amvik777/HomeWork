import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String D = scan.nextLine();
        System.out.print("Введите символ: ");
        String X = scan.nextLine();
        char[] sim = X.toCharArray();
        if (D.isEmpty() | X.isEmpty() | sim.length > 1) {
            System.out.print("Ошибка! Введите строку: ");
            D = scan.nextLine();
            System.out.print("Введите символ: ");
            X = scan.nextLine();
        } else {
            char[] str = D.toCharArray();
            int step = 0;
            for (int i = 0; i < str.length; i++) {
                if (str[i] == sim[0]) {
                    step++;
                }
            }
            if (step == 0) {

                System.out.println("Искомого символа " + "'"+ X + "'"+ " нет в строке");
            }
            else {
                System.out.println("В строке " + "'"+D+ "'"+" "+ step + " символ(а) " + "'"+ X+ "'");


            }


        }
    }
}
