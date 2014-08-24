/*
/*
 * File: MazeRunningKarel.java
 * ---------------------------
 * This program extends Karel so that it can solve a maze
 * using the right-hand rule.
 */
import stanford.karel.*;

public class MazeRunningKarel extends SuperKarel {

    public void run() {

        while (noBeepersPresent()) {
            turnRight();
            while (frontIsBlocked()) {
                turnLeft();
            }
            move();
        }
    }
}