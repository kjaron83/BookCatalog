/*
 * BookTest.java
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
public class BookTest {
    
    private final Book instance = new Book("A title", "A author", "A publisher", 1900);    
    
    public BookTest() {
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
     * Test of value method, of class Book.
     */
    @Test
    public void testValue() {
        assertEquals(instance.getAuthor(), instance.getValue(BookProperty.AUTHOR));
        assertEquals(instance.getPublisher(), instance.getValue(BookProperty.PUBLISHER));
        assertEquals(instance.getPublishingYear(), instance.getValue(BookProperty.PUBLISHING_YEAR));
        assertEquals(instance.getTitle(), instance.getValue(BookProperty.TITLE));
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        assertEquals("A author: A title (1900) - A publisher", instance.toString());
    }
    
}
