package JAVA15_StacksQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class JAVA01_InBuiltExamples {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(13);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
