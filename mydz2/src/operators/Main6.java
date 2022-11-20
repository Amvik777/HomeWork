import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести число от 0 до 999");
        int a = in.nextInt();
        if (a<0){
            System.out.println("Число не в диапазоне");
        } else if (a>999){
            System.out.println("Число не в диапазоне");
        }
        if (a/100>0 & a%2==0){
            System.out.println("Четное трёхзначное число");
        } else if (a/100>0 & a%2>0){
            System.out.println("Нечетное трёхзначное число");
        } else if(a/10>=1 & a/10<=10 & a%2==0){
            System.out.println("Четное двузначное число");
        } else if(a/10>=1 & a/10<10 & a%2>0){
            System.out.println("Нечетное двузначное число");
        } else if(a/10<1 & a%2==0){
            System.out.println("Четное однозначное число");
        } else if(a/10<1 & a%2>0){
            System.out.println("Нечетное однозначное число");
        }
    }
}