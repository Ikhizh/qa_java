package catClassTests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoCatTests {
    @Mock
    Feline feline;

    @Test //тест проверяет вызовется ли метод eatMeat при вызове getFood
    public void catShouldEatMeat() throws Exception {
        Cat catSpy = Mockito.spy(new Cat(feline));
        catSpy.getFood();
        Mockito.verify(feline).eatMeat();
    }

}
