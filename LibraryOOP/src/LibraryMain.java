import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        //Create Library object
        Library TheLibrary = new Library();

        //Add books to the library
        Book book1 = new Book("Harry Potter and the Philosopher's Stone",
                "J. K. Rowling", Genre.FANTASY, "9780545069670", 10);
        TheLibrary.setBook(book1);
        Book book2 = new Book("The Fellowship of the Ring",
                "J. R. R. Tolkien", Genre.FANTASY, "9788845270741", 15);
        TheLibrary.setBook(book2);
        Book book3 = new Book("The Woman in White",
                "Wilkie Collins", Genre.MYSTERY, "9780140059809", 20);
        TheLibrary.setBook(book3);
        Book book4 = new Book("Dracula",
                "Bram Stoker", Genre.HORROR, "9780194789431", 15);
        TheLibrary.setBook(book4);
        Book book5 = new Book("Macbeth",
                "William Shakespeare", Genre.DRAMA, "9780133554397", 16);
        TheLibrary.setBook(book5);

        TheLibrary.setAllBooksAvailable();

        //Create Users
        User user1 = new User("John", "Smith", 10);
        User user2 = new User("William", "Johnson", 25);

        TheLibrary.setUser(user1);
        TheLibrary.setUser(user2);


        //Rent same book twice
        TheLibrary.rentBook(book5, user1);
        TheLibrary.rentBook(book5, user2);
        TheLibrary.rentBook(book3, user2);
        TheLibrary.rentBook(book2, user2);

        RentedBookTest(TheLibrary.getRentedBooks());
        UsersRentedBooksTest(TheLibrary.getUsersRentedBooks(user1), user1);
        UsersRentedBooksTest(TheLibrary.getUsersRentedBooks(user2), user2);
        AvailableBookTest(TheLibrary.getAvaiableBooks());
    }

    public static void RentedBookTest(List<Book> rentedBooks) {
        System.out.println("##############################");
        System.out.println("Books Rented: ");
        for (Book book : rentedBooks) {
            System.out.println(book);
        }
    }

    public static void UsersRentedBooksTest(List<Book> rentedUserBooks, User user) {
        System.out.println("##############################");
        System.out.println(user.getFullName() + " rented: ");
        for (Book book : rentedUserBooks) {
            System.out.println(book);
        }
    }
    public static void AvailableBookTest(List<Book> availableBooks) {
        System.out.println("##############################");
        System.out.println("Books currently avaiable:");
        for (Book book : availableBooks) {
            System.out.println( book);
        }
    }


}