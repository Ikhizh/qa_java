package felineClassTests;

import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void catShouldEatMeat() throws Exception {
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetKittensCount() {
        int expected = 3;
        int actual = feline.getKittens(3);
    }

    @Test
    public void getFoodThrowException() {
        Exception thrown = assertThrows(Exception.class, () -> feline.getFood("Всеядное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
    }

}

