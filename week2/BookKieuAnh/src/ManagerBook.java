public class ManagerBook {
    private static ProgrammingBook books[];

    public static ProgrammingBook[] getBooks() {
        return books;
    }

    public static void setBooks(ProgrammingBook[] books) {
        ManagerBook.books = books;
    }


    public ManagerBook() {
    }

    public int getSumAmount(){
        int sum=0;
        for (ProgrammingBook o: books
             ) {
            sum += o.getAmount();
        }
        return sum;
    }

    public int countBookByLanguage(String language){
        int count = 0;
        for (ProgrammingBook o: books
             ) {
            if (o.getLanguage() == language) count++;
        }
        return count;
    }

    public ProgrammingBook[] searchBookByPrice(int price){
        ProgrammingBook[] books1 = new ProgrammingBook[10];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice()<price) {
                books1[count]= books[i];
                count++;
            }
        }
        return books1;
    }
}