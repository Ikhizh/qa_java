package lionClassTests;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void lionGetKittens() throws Exception {

    Lion lion = new Lion(feline, "Самец");
    int expected = 1;
    int actual = lion.getKittens();

    assertEquals(expected, actual);
    }

    @Test // Тест который тестирует конструктор класса Lion
    public void catShouldEatMeat() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> expected = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test // Тест который тестирует метод hasMane
    public void lionThrowException() {
        Exception thrown = assertThrows(Exception.class, () -> new Lion(feline, "Транс"));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
    }

    @Test // Jacoco не всегда видел  параметризированнный тест, поэтому добавила этот хоть он и дублирует параметризированный тест.
    public void leLionShouldHaveMane() throws Exception {
        String[][] array = {{"Самец", "true"}, {"Самка", "false"}};
        String[] sex = array[(int) (Math.random() * 2)];
        Lion lion = new Lion(feline, sex[0]);
        boolean actual = lion.doesHaveMane();
        assertEquals(Boolean.valueOf(sex[1]), actual);
    }
}
