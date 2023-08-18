import java.util.Stack;

public class StackProgram{
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<Integer>();
        //adding elements to stack
        for(int i=10; i<=20; i++){
            stack.push(i);
        }
        System.out.println("The elements in stack after insertion are: ");
        System.out.println(stack);
        //pop (remove elements)
        stack.pop();
        stack.pop();
        System.out.println("After removing two elements from stack: ");
        System.out.println(stack);
        //empty, peek (looks at the top element of the stack without removing it.), search
        if(stack.empty()){
            System.out.println("The stack is empty");
        }else{
            System.out.println("Stack is not empty");
            System.out.println("The peek element is "+stack.peek());
            System.out.println("The positon of element 12 is "+stack.search(12));
        }
    }
}
