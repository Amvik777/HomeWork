import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день");
        int D = in.nextInt();
        while (D <= 0) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            D = in.nextInt();
        }
        while (D > 31) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            D = in.nextInt();
        }
        System.out.println("Введите месяц");
        int M = in.nextInt();
        while (M <= 0) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            M = in.nextInt();
        }
        while (M > 12) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            M = in.nextInt();
        }
        System.out.println("Дата (день.месяц) - "+D+"."+M);
        if (D >= 20 & M==1) {
            System.out.println("Знак зодиака - водолей");
        } else if (D<=18 & M==2){
            System.out.println("Знак зодиака - водолей");
        } else if (D>=19 & M==2){
            System.out.println("Знак зодиака - рыбы");
        } else if (D<=20 & M==3){
            System.out.println("Знак зодиака - рыбы");
        } else if (D>=21 & M==3){
            System.out.println("Знак зодиака - овен");
        } else if (D<=19 & M==4){
            System.out.println("Знак зодиака - овен");
        } else if (D>=20 & M==4){
            System.out.println("Знак зодиака - телец");
        } else if (D<=20 & M==5){
            System.out.println("Знак зодиака - телец");
        } else if (D>=21 & M==5){
            System.out.println("Знак зодиака - близнецы");
        } else if (D<=21 & M==6){
            System.out.println("Знак зодиака - близнецы");
        } else if (D>=22 & M==6){
            System.out.println("Знак зодиака - рак");
        } else if (D<=22 & M==7){
            System.out.println("Знак зодиака - рак");
        } else if (D>=23 & M==7){
            System.out.println("Знак зодиака - лев");
        } else if (D<=22 & M==8){
            System.out.println("Знак зодиака - лев");
        }else if (D>=23 & M==8){
            System.out.println("Знак зодиака - дева");
        } else if (D<=22 & M==9){
            System.out.println("Знак зодиака - дева");
        }else if (D>=23 & M==9){
            System.out.println("Знак зодиака - весы");
        } else if (D<=22 & M==10){
            System.out.println("Знак зодиака - весы");
        }else if (D>=23 & M==10){
            System.out.println("Знак зодиака - скорпион");
        } else if (D<=22 & M==11){
            System.out.println("Знак зодиака - скорпион");
        }else if (D>=23 & M==11){
            System.out.println("Знак зодиака - стрелец");
        } else if (D<=21 & M==12){
            System.out.println("Знак зодиака - стрелец");
        }else if (D>=22 & M==12){
            System.out.println("Знак зодиака - козерог");
        } else if (D<=19 & M==1){
            System.out.println("Знак зодиака - козерог");
        }
    }
}