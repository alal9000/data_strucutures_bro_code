import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);

//        System.out.println(stack.peek());
//
//        System.out.println(stack.search("hi"));

//        System.out.println(stack.search("Fallout"));

        for(int i = 0; i < 1000000000; i++) {
            stack.push("Fallout76");
        }

    }
}