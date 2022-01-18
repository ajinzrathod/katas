package co.incubyte.test;

import co.incubyte.main.PrimeFactor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

@Test
public class PrimeFactorTest {
    public void of1() {
        Assert.assertEquals(PrimeFactor.FindFactors(1), Collections.EMPTY_LIST);
    }
    public void of2() {
        Assert.assertEquals(PrimeFactor.FindFactors(2), List.of(2));
    }
    public void of3() {
        Assert.assertEquals(PrimeFactor.FindFactors(3), List.of(3));
    }
    public void of4() {
        Assert.assertEquals(PrimeFactor.FindFactors(4), List.of(2, 2));
    }
    public void of6() {
        Assert.assertEquals(PrimeFactor.FindFactors(6), List.of(2, 3));
    }
    public void of8() {
        Assert.assertEquals(PrimeFactor.FindFactors(8), List.of(2, 2, 2));
    }
    public void of9() {
        Assert.assertEquals(PrimeFactor.FindFactors(9), List.of(3, 3));
    }
    public void ofCustom() {
        Assert.assertEquals(PrimeFactor.FindFactors(2*2*3*3*7*71), List.of(2,2 , 3, 3, 7, 71));
    }
}
