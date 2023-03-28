package catClassTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline = new Feline();

    @Test
    public void catShouldSayMiay() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void catShouldEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }

}
