package uaslp.objetos.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data){
        Node node=new Node(data);

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
        Node node=new Node(data);

        if (size == 0) {
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head.previous=node;

            head=node;
        }

        size++;
    }

    public void remove(int index){

    }

    public void removeAll(){

    }

    public String getAt(String index){
        return null;
    }

    public String setAt(String index,String data){
        return  null;
    }

    public void removeAllWithValue(String data){

    }

    public int getSize(){
        return size;
    }

    public LinkedListIterator getIterator(){
        return null;
    }
}
