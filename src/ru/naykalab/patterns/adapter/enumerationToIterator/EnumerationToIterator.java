package ru.naykalab.patterns.adapter.enumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;


public class EnumerationToIterator implements Iterator{
    Enumeration enumeration;

    public EnumerationToIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
