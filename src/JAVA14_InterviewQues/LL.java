package JAVA14_InterviewQues;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
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

    // DISPLAY THE LINKED LIST
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        LL list = new LL();
    }


    // QUESTIONS

    // 1) INSERTION (RECURSION) -
    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }


    // 2) REMOVE DUPLICATES
    public void duplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    // 3) MERGE TWO LINKED LIST
    public static LL merge(LL first , LL second){
        Node FL = first.head;
        Node SL = second.head;

        LL ans = new LL();
        while(FL != null && SL !=null){
            if(FL.value < SL.value){
                ans.insertionLast(FL.value);
                FL = FL.next;
            }else{
                ans.insertionLast(SL.value);
                SL = SL.next;
            }
        }
        while(FL != null){
            ans.insertionLast(FL.value);
            FL = FL.next;
        }
        while(SL != null){
            ans.insertionLast(SL.value);
            SL = SL.next;
        }
        return ans;
    }


    // 4) LINKED LIST CYCLE DETECTION
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    // 5) LENGTH OF THE LINKED LIST CYCLE
    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                    return length;
            }
        }
        return 0;
    }


    // 6) RETURN THE NODE WHERE THE CYCLE STARTS
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Node entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }


    // 7) HAPPY NUMBER
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow !=fast);

        if(slow==1){
            return true;
        }
        return false;
    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number%10;
            ans = ans + (rem*rem);
            number = number/10;
        }
        return ans;
    }


}
