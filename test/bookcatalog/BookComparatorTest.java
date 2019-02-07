/*
 * BookComparatorTest.java
 * Create Date: Feb 7, 2019
 * Copyright: SONY MUSIC ENTERTAINMENT 
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
public class BookComparatorTest {

    public static final Book BOOK_A = new Book("A title", "A author", "A publisher", 1900);
    public static final Book BOOK_B = new Book("B title", "B author", "B publisher", 1910);
    
    public BookComparatorTest() {
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
     * Test of compare method, of class BookComparator.
     */
    @Test
    public void testCompareByTitle() {
        System.out.println("compare by title");
        BookComparator instance = new BookComparator(BookProperty.TITLE);
        assertEquals(-1, instance.compare(BOOK_A, BOOK_B));
        assertEquals(0, instance.compare(BOOK_A, BOOK_A));
        assertEquals(1, instance.compare(BOOK_B, BOOK_A));
    }

    /**
     * Test of compare method, of class BookComparator.
     */
    @Test
    public void testCompareByPublishingYear() {
        System.out.println("compare by publishing year");
        BookComparator instance = new BookComparator(BookProperty.PUBLISHING_YEAR);
        assertEquals(-1, instance.compare(BOOK_A, BOOK_B));
        assertEquals(0, instance.compare(BOOK_A, BOOK_A));
        assertEquals(1, instance.compare(BOOK_B, BOOK_A));
    }
    
}
