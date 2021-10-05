import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void test() {
        List<Integer> list = new List<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
            assertEquals(i, list.getINode(i));
        }

        assertEquals(0, list.getHead().getValue());

        list.reverse();
        for (int i = 0; i < 10; i++) {
            assertEquals(10 - i - 1, list.getINode(i));
        }
    }

}