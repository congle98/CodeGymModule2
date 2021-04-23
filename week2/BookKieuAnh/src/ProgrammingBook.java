public class ProgrammingBook {
    private String code;
    private String name;
    private int price;
    private int number;
    private String author;
    private String language;
    private String framework;

    public ProgrammingBook(String code, String name, int price, int number, String author, String language, String framework) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.number = number;
        this.author = author;
        this.language = language;
        this.framework = framework;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public int getAmount(){
        return price*number;
    }
}