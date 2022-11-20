

public class Reader {

    private String name;
    private String surname;
    private String fatherName;
    private int number;
    private String faculty;
    private String birthDate;
    private String phoneNumber;
    private Book[] books = new Book[10];

    public Reader() {
    }

    public void addBook(Book book) { //проходимся по массиву книг, и ксли находим пустое место, вставляем дута книгу
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(getFIO() + " взял книгу" + book.getName());
                return;
            }
        }

        System.out.println("Нет места для новой книги");
    }

    public Book returnBook(String bookName) {
        Book ret = null; //если у читателя есть книга bookName, вернём её из метода

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equals(bookName)) { //сперва проверка books[i] != null, чтобы не было ошибки
                ret = books[i];
                for (int j = i; j < books.length - 1; j++) { //алгоритм удаления со смещением
                    books[j] = books[j+1];
                }
                break; //если уже удалили книгу, нет смысла продолжать её искать, поэтому выходим из цикла
            }
        }

        if (ret == null) { //если не нашли книгу
            System.out.println(getFIO() + " не хранит такой книги");
        } else {
            System.out.println(getFIO() + " вернул книгу " + bookName);
        }

        return ret;
    }

    public void printStatus() {
        String booksString = "";
        int i = 0;
        for (Book b : books) {
            if (b != null) {
                booksString += b.getName() + ",";
                i++;
            }
        }

        if (i == 0) {
            System.out.println(getFIO() + " не брал книг");
        } else {
            System.out.println(getFIO() + " взял " + i + " книг: " + booksString);
        }

    }

    private String getFIO() {
        return surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ".";
    }

    //дальше геттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}