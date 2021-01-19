public class ReadDemo {
    public static void main(String[] args) {
        Book book = new Book("001", "The Art of War", 200);
        Novel novel = new Novel("002", "The English Teacher", 300, "R.K.Narayan");
        Magazine magazine = new Magazine("003", "India Today", 50, "News");
        book.displaydetails();
        novel.displaydetails();
        magazine.displaydetails();
    }

}
