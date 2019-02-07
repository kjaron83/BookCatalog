/*
 * BookcatalogSuite.java
 * Create Date: Feb 7, 2019
 * Initial-Author: Janos Aron Kiss
 */
package bookcatalog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Janos Aron Kiss
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({bookcatalog.BookComparatorTest.class, bookcatalog.BookTest.class, bookcatalog.BookCatalogTest.class})
public class BookcatalogSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
