/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class UrgentAlertStack {
    
    private Node head;
    private int size;

    public UrgentAlertStack() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
    
    //push method to add a new stolen bike alert to the top of the stack so teh police can see the latest theft
    public void push(Object newItem) {
        Node newNode = new Node(newItem);
        if (head != null) {
            newNode.setNext(head); //linking new node to the current top
        }
        head = newNode; //making the new node the new top
        size++;
    }
    
    //pop method to remove and return the most recent alert from the top for the police
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object item = head.getElement(); //getting data from the top node
        head = head.getNext(); //moving head to the next node, removing the top one
        size--;
        return item;
    }
    
    //peek method to look at the top alert without removing it
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement(); //returning the data at the head
    }
    
}
