/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

    public void run() {

        turnLeft();

        while (frontIsClear()) {
            putBeeper();
            move();
            if (frontIsClear()) {
                move();
            } else {
                if (facingNorth()) {
                    turnRight();
                    if (frontIsClear()) {
                        move();
                        turnRight();
                    }
                } else {
                    if (facingSouth()) {
                        turnLeft();
                        if (frontIsClear()) {
                            move();
                            turnLeft();
                        }
                    }
                }
            }
            if(frontIsBlocked() && (facingNorth() || facingSouth())) {
                putBeeper();
                if (facingNorth()) {
                    turnRight();
                    if (frontIsClear()) {
                        move();
                        turnRight();
                        move();
                    }
                } else {
                    if (facingSouth()) {
                        turnLeft();
                        if (frontIsClear()) {
                            move();
                            turnLeft();
                            move();
                        }
                    }
                }
            }
        }
    }
}
