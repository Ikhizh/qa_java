package felineClassTests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoFelineTests {
    @Spy
    private Feline feline;

    @Test
    public void getKittensWithParam() {
        feline.getKittens(2);
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void getKittensNOParamInvokeGetKittensWith1() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

}
