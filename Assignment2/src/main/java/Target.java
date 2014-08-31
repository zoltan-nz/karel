/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
	    int middleX = getWidth()/2;
        int middleY = getHeight()/2;

        for(int i=3; i>0; i--) {
            add(filledCircle(middleX, middleY, (int)(72/((double)3/(double)i)), (i%2 == 0) ? Color.WHITE : Color.RED));
        }
    }

    private static GOval filledCircle(int x, int y, int r, Color c) {
        GOval o = new GOval(x-r, y-r, 2*r, 2*r);
        o.setFilled(true);
        o.setColor(c);
        return o;
    }
}
