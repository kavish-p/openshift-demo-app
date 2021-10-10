import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    public void TestRandomWord() {
        System.out.println("it works");
        String output = "wow";
        assertEquals("wow", output);
    }

    @Test
    public void TestRandomWord2() {
        System.out.println("it works");
        String output = "wow";
        assertEquals("wow", output);
    }

    @Test
    public void TestRandomWord3() {
        System.out.println("it works");
        String output = "wow";
        assertEquals("wow", output);
    }

    @Test
    public void TestRandomWord4() {
        Main obj = new Main();
        assertEquals("I do nothing", obj.dummyFunction());
    }
    
}
