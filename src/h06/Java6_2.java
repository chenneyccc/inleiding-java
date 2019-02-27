package h06;

import java.awt.*;
import java.applet.*;

public class Java6_2 extends Applet {
    int a;
    int b;
    int c;
    int d;

    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        a= 60;
        b= 60;
        c= 24;
        d= 365;

        uitkomst1 = a * b  ;
        uitkomst2 = a * b * c;
        uitkomst3= a*b*c*d;

    }

    public void paint(Graphics g) {
        g.drawString("  Uur Seconde: " + uitkomst1, 20, 20);
        g.drawString("  Dag Seconde: " + uitkomst2, 20, 40);
        g.drawString("  Dag Seconde: " + uitkomst3, 20, 60);
    }
}



