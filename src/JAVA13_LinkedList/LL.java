package JAVA13_LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    // INSERTION (FIRST)
    public void insertionFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    // INSERTION (LAST)
    public void insertionLast(int val){
        if(tail==null){
            insertionFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }

    // INSERTION (ANY INDEX)
    public void insertion(int val, int index){
        if(index==0){
            insertionFirst(val);
            return;
        }
        if(index==size){
            insertionLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next; //it stops when it reaches behind the index we need to add it
        }
        Node node = new Node(val,temp.next); //
        temp.next = node;
        size++;
    }

    // DELETION (FIRST)
    public int deletionFirst(){
        int val = head.value;
        head = head.next;
        if(head==tail){
            tail=null;
        }
        size--;
        return val;
    }

    // DELETION (LAST)
    public int deletionLast(){
        if(size<=1){
            return deletionFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    // DELETION (ANY INDEX)
    public int deletion(int index){
        if(index==0){
            return deletionFirst();
        }
        if(index == size-1){
            return deletionLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // FIND THE SPECIFIC NODE
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // GET THE SPECIFIC NODE
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    // DISPLAY THE LINKED LIST
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        // we did not want these things to be accessed directly that's why we put it here
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
