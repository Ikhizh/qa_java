package felineClassTests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrized {
    private String animalKind;
    private List<String> expectedListOfFood;
    private Feline feline = new Feline();

    public FelineParametrized(String animalKind, List<String> listOfFood) {
        this.animalKind = animalKind;
        this.expectedListOfFood = listOfFood;
    }
    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test//метод который проверяет работу getFood
    public void getFoodShouldWork() throws Exception {
        List<String> actual = feline.getFood(animalKind);
        assertEquals(expectedListOfFood, actual);
    }

}

