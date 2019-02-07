/*
 * BookCatalog.java
 * Create Date: Dec 18, 2018
 * Initial-Author: Janos Aron Kiss
 */


import java.util.List;
import bookcatalog.*;

/**
 *
 * @author Janos Aron Kiss
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog();
        
        Book bookC = new Book("C title", "B author", "B publisher", 1905);
        
        catalog.add(new Book("A title", "A author", "A publisher", 1900));
        catalog.add(new Book("B title", "B author", "B publisher", 1910));
        catalog.add(bookC);
        catalog.add(new Book("D title", "A author", "A publisher", 1925));
        catalog.add(new Book("E title", "C author", "B publisher", 1915));
        
        System.out.println("Search for: A publisher");
        printList(catalog.search(BookProperty.PUBLISHER, "A publisher"));
        
        System.out.println();
        System.out.println("Search for: B author");
        printList(catalog.search(BookProperty.AUTHOR, "B author"));

        System.out.println();
        System.out.println("Order by: PUBLISHING_YEAR");
        printList(catalog.sort(BookProperty.PUBLISHING_YEAR));

        System.out.println();
        System.out.println("Removing: " + bookC);
        catalog.remove(bookC);
        
        System.out.println();
        System.out.println("Order by: PUBLISHING_YEAR");
        printList(catalog.sort(BookProperty.PUBLISHING_YEAR));
    }
    
    public static void printList(List objects) {
        for( Object object: objects )
            System.out.println(object);
    }
    
}
