public class Aggregation {

    public static void main(String[] args) {

//        Aggregation = Represents a 'has-a' relationship between objects.
//                      One object contains another object as part of its structure,
//                      but the contained object/s can exist independently.

        Book book1 = new Book("Becoming Supernatural", 384);
        Book book2 = new Book("You are the Placebo", 416);
        Book book3 = new Book("Breaking the Habit of Being Yourself", 360);

        Book[] books = {book1, book2, book3};

//        System.out.println(book1.displayInfo());
//        System.out.println(book2.displayInfo());
//        System.out.println(book3.displayInfo());

        Library library = new Library("Kenya National Library", 1965, books);

        library.displayInfo();

    }
}
