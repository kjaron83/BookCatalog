/*
 * Book.java
 * Create Date: Dec 14, 2018
 * Initial-Author: Janos Aron Kiss
 */

package bookcatalog;

import catalog.Element;
import java.util.HashMap;

/**
 * This class represents a book.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public class Book implements Element<BookProperty> {
    
    private final HashMap properties;
    
    public Book(String title, String author, String publisher, int publishingYear) {
        this.properties = new HashMap();
        
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setPublishingYear(publishingYear);
    }
    
    public String getTitle() {
        return (String) properties.get(BookProperty.TITLE);
    }

    public void setTitle(String title) {
        properties.put(BookProperty.TITLE, title);
    }

    public String getAuthor() {
        return (String) properties.get(BookProperty.AUTHOR);
    }

    public void setAuthor(String author) {
        properties.put(BookProperty.AUTHOR, author);
    }

    public String getPublisher() {
        return (String) properties.get(BookProperty.PUBLISHER);
    }

    public void setPublisher(String publisher) {
        properties.put(BookProperty.PUBLISHER, publisher);
    }

    public int getPublishingYear() {
        return (Integer) properties.get(BookProperty.PUBLISHING_YEAR);
    }

    public void setPublishingYear(int publishingYear) {
        properties.put(BookProperty.PUBLISHING_YEAR, publishingYear);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getValue(BookProperty property) {       
        return properties.get(property);
    }
    
    /**
     * {@inheritDoc}
     */    
    @Override
    public String toString() {
        return getAuthor() + ": " + getTitle() + " (" +  getPublishingYear() + ") - " + getPublisher();
    }
        
}
