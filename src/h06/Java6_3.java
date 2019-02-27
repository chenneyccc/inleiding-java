package h06;

import java.awt.*;
import java.applet.*;

public class Java6_3 extends Applet {
    int a;
    int b;
    int c;

    double uitkomst;

    public void init() {
        a = 2147483647;
        b = 1;


        uitkomst = a + b ;
    }

    public void paint(Graphics g) {
        g.drawString("Negatief = " + uitkomst, 20,20 );

    }
}
