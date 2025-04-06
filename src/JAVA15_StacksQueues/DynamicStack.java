package JAVA15_StacksQueues;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // it will call CustomStack()
    }
    public DynamicStack(int size){
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            // double the size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
//      at this point we know array is not full -> insert item
        return super.push(item);

    }

    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(24);
        stack.push(54);
        stack.push(44);
        stack.push(64);
        stack.push(84);
        stack.push(114);
        stack.push(224);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
