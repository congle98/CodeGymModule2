public class Main {
    public static void main(String[] args) {
        ProgrammingBook books[] = new ProgrammingBook[5];
        books[0] = new ProgrammingBook("B01", "S1", 12, 3, "A1", "Java", "Spring");
        books[1] = new ProgrammingBook("B02", "S2", 13, 3, "A1", "Java1", "Spring");
        books[2] = new ProgrammingBook("B01", "S1", 14, 3, "A1", "Java2", "Spring");
        books[3] = new ProgrammingBook("B01", "S1", 15, 3, "A1", "Java3", "Spring");
        books[4] = new ProgrammingBook("B01", "S1", 16, 3, "A1", "Java", "Spring");

        ManagerBook kieuanh = new ManagerBook();
        ManagerBook toan = new ManagerBook();
        ManagerBook.setBooks(books);

        System.out.println(kieuanh.countBookByLanguage("Java"));
        ProgrammingBook b1[] = ManagerBook.getBooks();
        b1[0].setLanguage("Java1");
        System.out.println(kieuanh.countBookByLanguage("Java"));
    }
}