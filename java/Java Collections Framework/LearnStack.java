import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        
        // pushing elements
        names.push("Arnab");
        names.push("Ankit");
        names.push("Kaustubh");
        names.push("Mangesh");
        names.push("Vikas");
        names.push("Mayank");
        names.push("Shivam");
        names.push("Vishal");
        System.out.println(names);

        System.out.println(names.peek()); // see top element
        System.out.println(names.pop()); // remove top element
        System.out.println(names.peek());
        System.out.println(names);
    }
}
