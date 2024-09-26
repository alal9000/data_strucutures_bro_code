import java.util.Stack;

public class Stacks {
    public Stacks() {
    }

    public void myMethod() {
        Stack<String> stack = new Stack();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        stack.push("penguin");
        String myFavGame = (String)stack.pop();
        System.out.println(myFavGame);
    }
}