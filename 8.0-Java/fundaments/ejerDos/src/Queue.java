public class Queue {

    private Node lastValueAdd;
    int size = 0;
    String list = "";

    public Queue() {
        this.lastValueAdd = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.lastValueAdd == null;
    }

    public void push(int node){
        Node newNode = new Node(node);
        newNode.next = this.lastValueAdd;
        this.lastValueAdd = newNode;
        this.size++;
    }

    public int pop(){

        int auxiliary = this.lastValueAdd.data;
        this.lastValueAdd = this.lastValueAdd.next;
        this.size--;

        return auxiliary;
    }

    public int showLastDataAdd(){
        return this.lastValueAdd.data;
    }

    public int sizeOfQueue(){

        Node auxiliary = this.lastValueAdd;
        int sizeOf = 0;
        while (auxiliary != null){
            auxiliary = auxiliary.next;
            sizeOf++;
        }
        return sizeOf;
    }

}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
