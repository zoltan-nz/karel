/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

    public void run() {
        while(frontIsClear()) {
            findTheCeiling();
            repairColumn();
            jumpToNextColumn();
        }
        findTheCeiling();
        repairColumn();
    }

    private void checkAndBuild() {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    private void findTheCeiling() {
        turnLeft();
        while (frontIsClear()) {
            move();
        }
        turnRight();
    }

    private void repairColumn() {
        turnRight();
        while(frontIsClear()) {
            checkAndBuild();
            move();
        }
        checkAndBuild();
        turnLeft();
    }

    private void jumpToNextColumn() {
        for(int i=0; i < 4; i++) {
            move();
        }
    }

}
