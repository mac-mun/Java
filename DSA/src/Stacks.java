import java.util.Stack;

public class Stacks {
    public static void main(String[] args){

        /*
        * Stack = LIFO data structure. Last-In-First-Out
        *         stores objects into sort of 'vertical tower'
        *         push() to add to the top
        *         pop() to remove from the top
        * */

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack);
        System.out.println(stack.search("FFVII"));

        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
