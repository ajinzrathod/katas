package test;

import main.Leap;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class LeapTest {
    private Leap leap;
    @BeforeMethod
    public void setUp() {
        leap = new Leap();
    }

    public void notDivisibleBy4(){
        assertFalse(leap.checkLeap(1997));
    }

    public void divisibleBy4(){
        assertTrue(leap.checkLeap(1996));
    }

    public void divisibleBy400(){
        assertTrue(leap.checkLeap(1600));
    }

    public void notDivisibleBy400(){
        assertFalse(leap.checkLeap(1800));
    }
}