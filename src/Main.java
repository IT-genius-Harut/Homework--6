import interface_1.Queue;
import interface_1.Stack;
import interface_1.impl.QueueImpl;
import interface_1.impl.StackImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Stack");
        Stack stack = new StackImpl();

        stack.push(15);
        stack.push(37);
        stack.push(85);
        System.out.println("Stack: " + stack);
        stack.pop();
        stack.pop();
        System.out.println("Stack: " + stack);

        System.out.println("\n  Queue");
        Queue queue = new QueueImpl();

        queue.add(45);
        queue.add(98);
        queue.add(150);
        queue.add(14);
        System.out.println("Queue: " + queue);
        queue.pop();
        queue.pop();
        queue.peek();
        System.out.println("Queue: " + queue);
    }

}
