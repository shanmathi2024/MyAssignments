package week1.day3;

public class Library {

    public String addBook(String bookTitle) {
        
		System.out.println("Book added successfully");
        return bookTitle; // Return the book title
    }
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

public static void main(String[] args)
{

Library L= new Library();
String bookname=L.addBook("Story Book");
System.out.println("Book added successfully:"+bookname);
L.issueBook();
}
}