/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class RecoveryHistoryQueue {
    
    private Node head;
    private Node tail;
    private int size;

    public RecoveryHistoryQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
    
    //enqueue method to add a recovered bike to the back of the queue
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode; //if empty, the new node is both head and tail
        } else {
            tail.setNext(newNode); //linking the current tail to the new node
        }
        tail = newNode; //updating tail pointer to the new node
        size++;
    }
    
    //dequeue method to remove and return the oldest recovery record from the fornt of the queue
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object item = head.getElement(); //geting data from the front node
        head = head.getNext(); //moving head pointer to the next node
        
        if (head == null) {
            tail = null; //if the queue becomes empty, reset tail to null
        }
        
        size--;
        return item;
    }
   
    
}
