package lionClassTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrized {

    private Feline feline = new Feline();
    private String sex;
    private boolean hasMane;
    Lion lion;

    public LionParametrized(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void lionConstructorMane() throws Exception {
        lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(hasMane, actual);
    }
}
