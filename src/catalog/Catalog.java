/*
 * Catalog.java
 * Create Date: Oct 31, 2018
 * Initial-Author: Janos Aron Kiss
 */

package catalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class represents a catalog of elements.
 * @version $Revision$ $LastChangedDate$
 * @author $Author$
 */
public abstract class Catalog<T extends Element<P>, P> {
    
    private final List<T> elements;
    
    public Catalog() {
        elements = new ArrayList<>();
    }
    
    public boolean add(T element) {
        return elements.add(element);
    }
    
    public T get(int index) {
        return elements.get(index);
    }
    
    /**
     * Returns a new list from the contained elements.
     */
    public List<T> list() {
        return new ArrayList<>(elements);        
    }
    
    public boolean remove(T element) {
        return elements.remove(element);
    }
    
    public T remove(int index) {
        return elements.remove(index);
    }
    
    /**
     * Returns a new list of the elements which property equals the specified
     * value.
     */
    public List<T> search(P property, Object value) {
        List<T> found = new ArrayList<>();
        
        for(T element: elements) {
            if (value.equals(element.getValue(property))) {
                found.add(element);
            }
        }
        
        return found;
    }
    
    /**
     * Returns a new list of the elements sorted by the specified property.
     */
    public List<T> sort(P property) {
        List<T> copy = list();
        Collections.sort(copy, getComparator(property));
        return copy;
    }
    
    /**
     * Returns a comparator by the specified property.
     */
    public abstract Comparator getComparator(P property);
        
}
