import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите масть карты:");
        System.out.println("1-пика");
        System.out.println("2-трефы");
        System.out.println("3-бубны");
        System.out.println("4-черви");
        int M = in.nextInt();
        while (M <= 0) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            M = in.nextInt();
        }
        while (M > 4) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            M = in.nextInt();
        }
        System.out.println("Выберите достоинство карты:");
        System.out.println("11-валет");
        System.out.println("12-дама");
        System.out.println("13-король");
        System.out.println("14-туз");
        int N = in.nextInt();
        while (N < 11) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            N = in.nextInt();
        }
        while (N > 14) {
            System.out.println("Некорректные данные. Попробуйте ещё раз");
            N = in.nextInt();
        }
        if (M==1 & N==11){
            System.out.println("Валет пик");
        } else if (M==1 & N==12){
            System.out.println("Дама пик");
        } else if (M==1 & N==13){
            System.out.println("Король пик");
        } else if (M==1 & N==14){
            System.out.println("Туз пик");
        }

        else if (M==2 & N==11){
            System.out.println("Валет треф");
        } else if (M==2 & N==12){
            System.out.println("Дама треф");
        } else if (M==2 & N==13){
            System.out.println("Кароль треф");
        } else if (M==2 & N==14){
            System.out.println("Туз треф");
        }

        else if (M==3 & N==11){
            System.out.println("Валет буба");
        } else if (M==3 & N==12){
            System.out.println("Дама буба");
        } else if (M==3 & N==13){
            System.out.println("Кароль буба");
        } else if (M==3 & N==14){
            System.out.println("Туз буба");
        }

        else if (M==4 & N==11){
            System.out.println("Валет черва");
        } else if (M==4 & N==12){
            System.out.println("Дама черва");
        } else if (M==4 & N==13){
            System.out.println("Кароль черва");
        } else if (M==4 & N==14){
            System.out.println("Туз черва");
        }
    }
}