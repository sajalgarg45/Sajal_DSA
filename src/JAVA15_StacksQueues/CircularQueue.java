package JAVA15_StacksQueues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size==data.length; // ptr is at last index
    }

    public boolean isEmpty(){
        return size==0; // stack is  empty
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size ++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        int i = front;
        do{
            System.out.print(data[i]+ " -> ");
            i++;
            i=i%data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(143);
        queue.display();
    }
}