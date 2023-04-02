package lionAlexClassTests;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LionAlexTest {
    Feline feline;
    LionAlex lionAlex;

    @Before
    public void initialize() throws Exception {
        feline = new Feline();
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void lionAlexShouldHaveZeroKittens() {
        int actual = lionAlex.getKittens();
        assertEquals(0, actual);
    }

    @Test
    public void lionAlexShouldHaveFriends() {
        List<String> actual = lionAlex.getFriends();
        assertEquals(List.of("Марти", "Алекс", "Мелман"), actual);
    }

    @Test
    public void lionAlexShouldLeaveInNewYork() {
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals("New York", actual);
    }

    @Test
    public void leLionAlexShouldHaveMane() {
        boolean actual = lionAlex.doesHaveMane();
        assertTrue(actual);
    }
}
