package com.practice.doublyLinkedList;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head ;
    private EmployeeNode tail;
    private int size ;

    public void addToFront ( Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head == null){
            tail = node ;
        }else {
            head.setPrev(node);
        }
        head = node;
        size ++;
    }


    public void addToEnd( Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail== null){
            head = node;
        }else {
            tail.setNext(node);
            node.setPrev(tail);
        }

        tail = node ;
        size ++;
    }




    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removeNode = head ;

        if(head.getNext()==null){
            tail= null;
        }else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return  removeNode;

    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return  null;
        }
        EmployeeNode removeNode = tail;
        if(tail.getPrev()==null){
            head = null;
        }else {
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();
        size--;
        removeNode.setPrev(null);
        return  removeNode;

    }

    public boolean addBefore(Employee newEmployee , Employee existingEmployee){
        // check if the list is empty
        if( head==null){
            return false;
        }
        //find the existing employee
        EmployeeNode current = head;
        while (current!=null && !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
        }
        if(current == null){
            return false;
        }
        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrev(current.getPrev());
        newNode.setNext(current);
        current.setPrev(newNode);
        if(head ==current){
            head= newNode;
        }else {
            newNode.getPrev().setNext(newNode);
        }
        size++;
        return true;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current!=null){
            System.out.print(current);
            System.out.print("<=>");
            current= current.getNext();
        }
        System.out.println("null");
    }
}
