package JAVA15_StacksQueues;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

        // or return data[ptr--]
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack!");
        }
        return data [ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1; // ptr is at last index
    }

    public boolean isEmpty(){
        return ptr==-1; // stack is  empty
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
