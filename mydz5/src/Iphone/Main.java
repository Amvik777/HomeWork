public class Main {
    public static void main(String[] args) {

        Phone num1 = new Phone (26440722, "num1");
        Phone num2 = new Phone(26022110, "num2");
        Phone num3 = new Phone(23456448,"num3");

        num1.writePhoneBook(""num2.getNumber());
        num1.writePhoneBook("", num3.getNumber());

        num2.writePhoneBook(""num1.getNumber());
        num2.writePhoneBook(""num3.getNumber());

        num3.writePhoneBook("HisPhone", num2.getNumber());
        num3.writePhoneBook("MysPhone", num1.getNumber());

        num1.getPhoneBooks();
        num2.getPhoneBooks();
        num3.getPhoneBooks();
        System.out.println();

        num1.receiveCall(num2.getNumber());
        num2.receiveCall(num3.getNumber());
        System.out.println();

        num2.sendMessage("Привет", num1.getNumber(), num3.getNumber());

    }

}



    }
}