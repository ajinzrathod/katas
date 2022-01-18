package co.incubyte.test;

import co.incubyte.main.MarsRover;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class MarsRoverTest {
    private MarsRover marsRover;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        marsRover = new MarsRover();
    }

    public void noMovement(){
        assertEquals(marsRover.moveRover(""), "0:0:N");
    }
    public void moveUp1(){
        assertEquals(marsRover.moveRover("M"), "0:1:N");
    }

    public void moveUp2(){
        assertEquals(marsRover.moveRover("MM"), "0:2:N");
    }

    public void getRightSideDirectionOfNorth(){
        assertEquals(marsRover.getRightSideDirection("N"), "E");
    }
    public void getRightSideDirectionOfEast(){
        assertEquals(marsRover.getRightSideDirection("E"), "S");
    }
    public void getRightSideDirectionOfSouth(){
        assertEquals(marsRover.getRightSideDirection("S"), "W");
    }
    public void getRightSideDirectionOfWest(){
        assertEquals(marsRover.getRightSideDirection("W"), "N");
    }
    public void getLeftSideDirectionOfNorth(){
        assertEquals(marsRover.getLeftSideDirection("N"), "W");
    }
    public void getLeftSideDirectionOfWest(){
        assertEquals(marsRover.getLeftSideDirection("W"), "S");
    }
    public void getLeftSideDirectionOfSouth(){
        assertEquals(marsRover.getLeftSideDirection("S"), "E");
    }
    public void getLeftSideDirectionOfEast(){
        assertEquals(marsRover.getLeftSideDirection("E"), "N");
    }
    public void moveUp2AndRight(){
        assertEquals(marsRover.moveRover("MMR"), "0:2:E");
    }
    public void moveUp2AndRightThenGoForward1Time(){
        assertEquals(marsRover.moveRover("MMRM"), "1:2:E");
    }
    public void moveUp2AndRightThenGoForward2Times(){
        assertEquals(marsRover.moveRover("MMRMM"), "2:2:E");
    }
    public void wrapAround(){
        assertEquals(marsRover.moveRover("MMMMMMMMMM"), "0:0:N");
    }
    public void custom(){
        assertEquals(marsRover.moveRover("RRMLLRMMRMLMLM"), "3:9:N");
    }
}