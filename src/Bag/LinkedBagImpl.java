package Bag;

public class LinkedBagImpl<T> implements BagInterface<T> {
    
    private Node<T> firstNode;
    private int numberOfEntries;
    
    public LinkedBagImpl() {
        firstNode = null;
        numberOfEntries = 0;
    }
    
    public LinkedBagImpl(T[] anArray) {
        //Write a constructor that creates a bat from an array of objects.
    }

    @Override
    public int getCurrentSize() {
        //stubbed out
        return 0;
    }

    @Override
    public boolean isEmpty() {
        //stubbed out
        return false;
    }

    @Override
    public boolean add(T newEntry) {
        Node<T> newNode = new Node<T>(newEntry);
        newNode.setNextNode(firstNode);
        firstNode = newNode;
        numberOfEntries++;
        
        return true;
    }

    @Override
    public T remove() {
       //stubbed out
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        //stubbed out
        return false;
    }
    
    public T replace(T anEntry) {
        //Implement a method that replaces and returns any object currently in 
        //a bag with a given object
        
        return null;
    }

    @Override
    public void clear() {
        //stubbed out
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        //stubbed out
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        //stubbed out
        return false;
    }

    @Override
    public T[] toArray() {
        //stubbed out
        return null;
    }
    
    /*
    This you have already completed project 1, implement the follow methods:
    getMin that returns the smallest object in a bag
    getMax that returns the largest object in a bag
    removeMin that removes and returns the smallest object in a bag
    removeMin that removes and returns the largest object in a bag
    */
    
    public LinkedBagImpl<T> getAllLessThan(Comparable<T> anObject){
        //stubbed out
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        //Return true when the contents of the bags are the same
        
        return false;
    }
    
    
}