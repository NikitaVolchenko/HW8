import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WrapperTest {

    @Test
    public void test() {

        Wrapper<Integer> wrapper = new Wrapper<>(10);

        assertEquals(10, wrapper.getValue());

        wrapper.setValue(11);

        assertEquals(11, wrapper.getValue());

    }

}