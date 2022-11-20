import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = scan.nextLine();

        if (a.isEmpty()) {
            System.out.print("Ошибка! Введите строку: ");
            a = scan.nextLine();

        }
        System.out.print("Введите символ 1: ");
        String a = scan.nextLine();
        System.out.print("Введите символ 2: ");
        String b = scan.nextLine();
        char[] num = a.toCharArray();
        char[] num2 = b.toCharArray();
        if(b.isEmpty()|a.isEmpty() | num.length > 1| num2.length > 1) {
            System.out.print("Ошибка! Введите символ 1: ");
            a = scan.nextLine();
            System.out.print("Введите символ 2: ");
            b = scan.nextLine();}

        char[] str = a.toCharArray();
        int s=0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == num[0]) {
                str[i]=num2[0];
                s++;}
        }

        if(s==0){System.out.println("В строке " + "'"+ a + "'"+ " нет символа"+ "'"+ a + "'");}
        else {System.out.print(str);}
    }
}


