public class Book {
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String get_book_info() {
        return "Judul: " + title + ", Penulis: " + author + ", Tahun: " + year;
    }
    
    public static void main(String[] args) {
        Book myBook = new Book("Strong Girl", "Dina Amelia", 2020);
        System.out.println(myBook.get_book_info());
    }
}
