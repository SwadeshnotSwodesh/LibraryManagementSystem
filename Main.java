import java.util.Scanner;
import java.util.Random;
class Library
{
    public int no_of_books;
    public String[] books;
    Library()
    {
        this.books=new String[100];//for the book's name
        this.no_of_books=0;//for the total no. of books
    }
    public void addBooks(String book)
    {
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println("The book '"+book+"' has been added to the library.");
    }
    public void showAvailableBooks()
    {
        System.out.println("Available books are: ");
        for(String book:this.books)
        {
            if(book==null)
            {
                continue;//goes to the next iteration and doesn't find anything
            }
            System.out.println("* "+book);
        }
    }
    public void issueBooks(String book)
    {
        for(int i=0;i<this.no_of_books;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("The book '"+book+"' has already been issued.");
                this.books[i]=null;
            }
        }
        System.out.println("The book '"+book+"' doesn't exist in the library.");
    }
    public void returnBooks(String book)
    {
        System.out.println("The book '"+book+"' has been returned.");
        addBooks(book);
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Library library=new Library();
        library.addBooks("Think and grow rich");
        library.addBooks("Can't hurt me");
        library.addBooks("Rich dad poor dad");
        System.out.println("");
        library.issueBooks("Think and grow rich");
        library.showAvailableBooks();
        library.returnBooks("Think and grow rich");
        library.showAvailableBooks();
    }
}