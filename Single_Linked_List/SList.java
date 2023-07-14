package Single_Linked_List;

import java.util.ArrayList;

public class SList<T> {
    private Node<T> head;
    int size;

    public SList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T getFirstElement() {
        if (head == null) {
            throw new NullPointerException("No Element Inside the Linked List");
        }
        return  head.getElement();
    }

    public T getLastElement() {
        Node<T> lastNode = head;
        if (head == null) {
            throw new NullPointerException("No Element Inside the Linked List");
        }
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        return lastNode.getElement();
    }

    public void addElementFirst(T element) {
        Node<T> n = new Node<T>(element, head);
        head = n;
        size++;
    }

    public void addElementLast(T element) {
        Node<T> n = new Node<>(element, null);
        Node<T> lastNode = head;

        if (lastNode == null) {
            head = n;
            size++;
            return;
        }
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        lastNode.setNext(n);
        size++;
    }

    public void removeAnInternalNode(T element) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;

        while (currentNode != null && !currentNode.getElement().equals(element)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode != null) {
            if (previousNode != null) {
                previousNode.setNext(currentNode.getNext());
            } else {
                head = currentNode.getNext();
            }
            currentNode = null;
            size--;
            System.out.println("\n Remove is Done 100%");
        }

    }

    public void printAllElement() {
        Node<T> currentNode = head;
        if (currentNode == null) {
            throw new NullPointerException("No Element To Print Them !!");
        } else {
            System.out.print("[");
            while (currentNode != null) {
                System.out.print(currentNode.getElement() + ",");
                currentNode = currentNode.getNext();
            }
            System.out.println("]");
        }
    }

    public String search(T element) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement().equals(element)) {
                System.out.println("\n The Search Result: ");
                return element + " : This Element is Found";
            }
            currentNode = currentNode.getNext();
        }
        System.out.println("The Search Result");
        return element + " : This Element doesn't Exist";
    }

    public void printSize(){
        System.out.println("The Size of Single Linked List is : "+size);
    }

    public void addNodeAfterSpecificElement(T element , T newElement){
        Node<T> currentNode = head;
        Node<T> newNode = new Node(newElement , null);
        if(head == null){
            throw new NullPointerException("No Element inside the linked list");
        }
        while(currentNode != null && !currentNode.getElement().equals(element)){
            currentNode = currentNode.getNext();

        }
        if(currentNode != null){
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            size++;
        }else{
            System.out.println("the element doesn't exist");
        }

    }

    public void removeFromFist(){
        if(head == null){
            System.out.println("No element in the List");
        }else{
        head = head.getNext();
        size--;
    }
    }

    public void removeFromLast(){
        Node<T> currentNode = head;
        Node<T> privousNode = null;
        if(head == null){
            throw new NullPointerException("No Element");
        }
        while(currentNode.getNext() != null){
            privousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if(currentNode == head){
            head =null;
        }else
        privousNode.setNext(null);
    }


}
