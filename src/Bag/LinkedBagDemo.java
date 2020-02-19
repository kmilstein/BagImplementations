package Bag;

public class LinkedBagDemo {
    public static void main(String[] args) {
        System.out.println("Creating an empty bag");
        BagInterface<String> aBag = new LinkedBag<>();
        testIsEmpty(aBag, true);
    }

    private static void testIsEmpty(BagInterface<String> bag, boolean empty) {
        System.out.println("\nTest isEmpty with ");
        if (empty) {
            System.out.println("an empty bag: ");
        } else {
            System.out.println("a bag that is not empty");
        }
        
        System.out.println("isEmpty finds the bag.");
        if (empty && bag.isEmpty()) {
            System.out.println("empty: OK.");
        } else if (empty) {
            System.out.println("not empty, but it is: ERROR.");
        } else if (!empty && bag.isEmpty()) {
            System.out.println("empty, but it is empty: ERROR");
        } else {
            System.out.println("not empty: OK.");
        }
    }
}
