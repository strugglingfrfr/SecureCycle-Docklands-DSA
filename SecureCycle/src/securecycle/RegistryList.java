/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class RegistryList {
    
    private Node head;
    private Node curr;
    private Node prev;
    private int size;

    public RegistryList() {
        head = null;
        curr = null;
        prev = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
    
    //method to move pointers to a specefic position 
    private void setCurrent(int index) {
        curr = head;
        prev = null;
        for (int i = 1; i < index; i++) {
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    //add method , to add the bicycle at teh end of the linked list
    public void add(Object element) {
        Node newNode = new Node(element); 
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size); //moves  the curr to the end
            curr.setNext(newNode);
        }
        size++;
    }
    
    //search method for searching a bike by serial number
    public Bicycle search(String serial) {
        Node temp = head;
        while (temp != null) {
            Bicycle b = (Bicycle) temp.getElement(); //converting object back into a bicycle so we can access data like serial number
            if (b.getSerialNumber().equalsIgnoreCase(serial)) {
                return b;
            }
            temp = temp.getNext();
        }
        return null; //return null if not found
    }
    
    //remove method to remove a bike from the list by serial number
    public void remove(String serial) {
        curr = head;
        prev = null;
        while (curr != null) {
            Bicycle b = (Bicycle) curr.getElement();
            if (b.getSerialNumber().equalsIgnoreCase(serial)) {
                if (prev == null) { //removing the head
                    head = curr.getNext();
                } else {
                    prev.setNext(curr.getNext()); //linking the previous to the one after current
                }
                size--;
                return; //exit after finding and removing the bike
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    
}
