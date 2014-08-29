/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

    /** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

    /** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

    /** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {

        int height  = getHeight();
        int width   = getWidth();
        int middle  = width/2;

        for(int row=BRICKS_IN_BASE; row>0; row--) {
            int startPositionX = middle - (row/2 * BRICK_WIDTH) - ((row%2)*(BRICK_WIDTH/2));
            int startPositionY = height - ((BRICKS_IN_BASE-row+1)*BRICK_HEIGHT);
            for(int brickCounter = 0; brickCounter<row; brickCounter++) {
                int x = startPositionX+(BRICK_WIDTH*brickCounter);
                GRect brick = new GRect(x, startPositionY, BRICK_WIDTH, BRICK_HEIGHT);
                add(brick);
            }
        }

	}
}

