/*
 * BookComparator.java
 * Create Date: Dec 14, 2018
 * Initial-Author: Janos Aron Kiss
 */

package bookcatalog;

import java.util.Comparator;

/**
 * This class compares two books by the given property.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class BookComparator implements Comparator<Book> {

    private final BookProperty compareField;
    
    public BookComparator(BookProperty property) {
        compareField = property;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if ( BookProperty.PUBLISHING_YEAR == compareField )
            return Integer.compare(o1.getPublishingYear(), o2.getPublishingYear());
        else
            return ((String) o1.getValue(compareField)).compareTo((String) o2.getValue(compareField));
    }
    
}
