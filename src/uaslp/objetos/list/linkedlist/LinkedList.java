package uaslp.objetos.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data){
        Node node=new Node();

        node.data=data;

        if(size==0)
        {
            head=node;
        }else{
            tail.next=null;
            node.previous=tail;
        }
    }

    public void addAtFront(String data){

    }

    public void remove(int index){

    }

    public void removeAll(){

    }

    public String getAt(String index){
        return null;
    }
}
