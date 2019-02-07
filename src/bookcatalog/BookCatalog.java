/*
 * BookCatalog.java
 * Create Date: Jan 24, 2019
 * Initial-Author: Janos Aron Kiss
 */

package bookcatalog;

import catalog.Catalog;
import java.util.Comparator;

/**
 * This class represents the book catalog.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class BookCatalog extends Catalog<Book, BookProperty> {

    /**
     * {@inheritDoc}
     */    
    @Override
    public Comparator getComparator(BookProperty property) {
        return new BookComparator(property);
    }

}
