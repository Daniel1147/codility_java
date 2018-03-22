// package daniel1147.stone_wall;

import java.util.Stack;

public class StackExample {

    private Stack<Integer> stack;

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();

        stackExample.demo();
    }

    public StackExample() {
        stack = new Stack<Integer>();
    }

    private void demo() {
        // System.out.println("hello world again");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while ( ! stack.empty()) {
            System.out.printf("got popped number %d\n", stack.pop());
        }
    }
}
