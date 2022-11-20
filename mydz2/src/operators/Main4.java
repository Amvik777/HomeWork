import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Введите год: ");
        long n=in.nextLong();
        if (n%100==0 && n%400>0){
            System.out.println("Год обычный, 365");
        } else if (n%4==0){
            System.out.print("Год високосный, 366");
        } else if (n<=0) {
            System.out.println("Ошибка");
        } else
            System.out.println("Год обычный, 365");
