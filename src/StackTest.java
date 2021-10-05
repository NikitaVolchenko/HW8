import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void test() {
        Node<String> node = new Node<>("Hello");

        Stack<String> stack = new Stack<String>(node);
        assertEquals("Hello", stack.top());

        stack.push("world");
        assertEquals("world", stack.top());

        stack.push("!");
        assertEquals("!", stack.top());

        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

}