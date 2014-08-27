import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;

public class HelloWorld extends GraphicsProgram {
    public void run() {
        GLabel helloWorldLabel = new GLabel("Welcome in Java World", 50, 50);
        add(helloWorldLabel);
        helloWorldLabel.setColor(Color.GREEN);
        helloWorldLabel.setFont("Arial-40");

        for (int x=0; x<5; x++) {
            waitForClick();
            helloWorldLabel.setLabel("Szamlalo");
        }

        helloWorldLabel.setLabel("VEGE");
    }
}
