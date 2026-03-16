/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class Node {
    
    private Object element;
    private Node next;

    //constructor
    public Node(Object element) {
    this.element = element;
    this.next = null;
}
    
    //setters
    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    //getters
    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
    
}
