/*
 * BookCatalogTest.java
 * Create Date: Feb 7, 2019
 * Initial-Author: Janos Aron Kiss
 */
package bookcatalog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janos Aron Kiss
 */
public class BookCatalogTest {
    
    public static final Book BOOK_A = new Book("A title", "A author", "A publisher", 1900);
    public static final Book BOOK_B = new Book("B title", "B author", "B publisher", 1910);
    public static final Book BOOK_C = new Book("C title", "B author", "B publisher", 1905);
    public static final Book BOOK_D = new Book("D title", "A author", "A publisher", 1925);
    public static final Book BOOK_E = new Book("E title", "C author", "B publisher", 1915);        
    
    public BookCatalogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Catalog.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        BookCatalog instance = createCatalog();
        assertEquals(BOOK_A, instance.get(0));
    }

    /**
     * Test of remove method, of class Catalog.
     */
    @Test
    public void testRemove_Book() {
        System.out.println("remove");
        BookCatalog instance = createCatalog();
        instance.remove(BOOK_B);        
        assertArrayEquals(
                new Book[]{BOOK_A, BOOK_C, BOOK_D, BOOK_E},
                instance.list().toArray(new Book[0])
        );
    }

    /**
     * Test of remove method, of class Catalog.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        BookCatalog instance = createCatalog();
        instance.remove(1);
        assertArrayEquals(
                new Book[]{BOOK_A, BOOK_C, BOOK_D, BOOK_E},
                instance.list().toArray(new Book[0])
        );
    }

    /**
     * Test of search method, of class Catalog.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        BookCatalog instance = createCatalog();
        assertArrayEquals(
                new Book[]{BOOK_A, BOOK_D}, 
                instance.search(BookProperty.PUBLISHER, "A publisher").toArray(new Book[0])
        );        
    }

    /**
     * Test of sort method, of class Catalog.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        BookCatalog instance = createCatalog();        
        assertArrayEquals(
                new Book[]{BOOK_A, BOOK_C, BOOK_B, BOOK_E, BOOK_D},
                instance.sort(BookProperty.PUBLISHING_YEAR).toArray(new Book[0])
        );        
    }

    /**
     * Test of get method, of class Catalog.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        BookCatalog instance = createCatalog();
        assertEquals(BOOK_A, instance.get(0));
        assertEquals(BOOK_B, instance.get(1));
        assertEquals(BOOK_C, instance.get(2));        
    }

    /**
     * Test of list method, of class Catalog.
     */
    @Test
    public void testList() {
        System.out.println("list");
        BookCatalog instance = createCatalog();
        assertArrayEquals(
                new Book[]{BOOK_A, BOOK_B, BOOK_C, BOOK_D, BOOK_E},
                instance.list().toArray(new Book[0])
        );
    }
    
    private BookCatalog createCatalog() {
        BookCatalog instance = new BookCatalog();
        instance.add(BOOK_A);
        instance.add(BOOK_B);
        instance.add(BOOK_C);
        instance.add(BOOK_D);
        instance.add(BOOK_E);
        return instance;
    }
    
}
