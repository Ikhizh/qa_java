package lionClassTests;

import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoLionTests {
    @Mock
    Feline feline;
    @Test //тест проверяет вызовется ли метод eatMeat при вызове getFood
    public void lionShouldEatMeat() throws Exception {
        Lion lionSpy = Mockito.spy(new Lion(feline, "Самка"));
        lionSpy.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
}
