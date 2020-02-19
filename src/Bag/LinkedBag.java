package Bag;

public class LinkedBag<T> implements BagInterface<T> {

    private Node firstNode;
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
        numberOfEntries++;

        return true;
    }

    @Override
    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean result = false;
        Node nodeN = getReferenceTo(anEntry);
        if (nodeN != null) {
            nodeN.data = firstNode.data;
            
            firstNode = firstNode.next;
            numberOfEntries--;
            result = true;
        }
        
        return result;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;
        
        while ((loopCounter < numberOfEntries) && (currentNode != null)) {
            if (anEntry.equals(currentNode.next)) {
                frequency++;
            }
            loopCounter++;
            currentNode = currentNode.next;
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        
        while(!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
        }
        return result;
    }
    
    private Node getReferenceTo(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }   
        return currentNode;
    }

    private class Node {

        private T data;
        private Node next;

        Node(T dataPortion) {
            this(dataPortion, null);
        }

        Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    }
}
