import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<User> users;
    private Map<Book, Boolean> bookAvailablity;
    private Map<Book, User > rentedBooks;

    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.bookAvailablity = new HashMap<>();
        this.rentedBooks = new HashMap<>();
    }

    public void setBook(Book book){
        books.add(book);
    }
    public void setUser(User user){
        users.add(user);
    }
    public void setAllBooksAvailable(){
        for(Book book: books){
            bookAvailablity.put(book,true);
        }
    }

    public void rentBook(Book book, User user) {

        if (bookAvailablity.containsKey(book) && bookAvailablity.get(book)) {
            bookAvailablity.put(book, false);
            rentedBooks.put(book, user);
            System.out.println(user.getFullName() + " rented: " + book.getTitle());
        } else {
            System.out.println(user.getFullName() + ", the book " + book.getTitle() +
                    " is currently unavaiable, please try again later");

        }
    }

    public List<Book> getRentedBooks(){
        List<Book> rentedBooks = new ArrayList<>();
        for(Map.Entry<Book, Boolean> book: bookAvailablity.entrySet()){
            if(!book.getValue()){
                rentedBooks.add(book.getKey());
            }
        }
        return rentedBooks;
    }
    public List<Book> getUsersRentedBooks(User user){
        List<Book> rentedUserBooks = new ArrayList<>();
        for(Map.Entry<Book, User> book: rentedBooks.entrySet()){
            if(book.getValue().equals(user)){
                rentedUserBooks.add(book.getKey());
            }
        }
        return rentedUserBooks;
    }
    public List<Book> getAvaiableBooks(){
        List<Book> availableBooks = new ArrayList<>();
        for(Map.Entry<Book, Boolean> book: bookAvailablity.entrySet()){
            if(book.getValue()){
                availableBooks.add(book.getKey());
            }
        }
        return availableBooks;

    }

    public void getBooks(){
        for(Book book: books){
            System.out.println("Title: "+ book.getTitle() + ", Author: " + book.getAuthor() );

        }
    }
    public void getUsers(){
        for(User user: users){
            System.out.println("Name: "+ user.getFullName() + ", Age: " + user.getAge() );

        }
    }


}
