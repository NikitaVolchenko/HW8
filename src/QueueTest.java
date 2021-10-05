import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void test() {
        Queue<String> queue = new Queue<>();

        queue.push("human1");
        assertEquals("human1", queue.getHead().getValue());

        queue.push("human2");
        assertEquals("human2", queue.getTail().getValue());

        queue.push("human3");
        assertEquals("human3", queue.getTail().getValue());

        queue.pop();
        assertEquals("human2", queue.getHead().getValue());

        queue.peek();
        assertEquals("human2", queue.getHead().getValue());

        queue.pop();
        queue.pop();
        assertTrue(queue.isEmpty());
    }

}