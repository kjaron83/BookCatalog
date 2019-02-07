/*
 * Element.java
 * Create Date: Jan 24, 2019
 * Initial-Author: Janos Aron Kiss
 */

package catalog;

/**
 * This interface represents an element from the Catalog.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public interface Element<P> {

    /**
     * Returns a value by the specified property.
     */
    public Object getValue(P propery);    
    
}
