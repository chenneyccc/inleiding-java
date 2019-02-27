//Voorbeeld 8.1

package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Java8_2 extends Applet {
    Label label;
    Button  knopEEN;
    Button knopTWEE;
    Button knopDRIE;
    Button knopVIER;
    String Man;
    String Vrouw;
    String Meisje;
    String Jongen;
    int teller;
    int Persoon1, Persoon2, Persoon3, Persoon4;



    public void init() {
        label = new Label("Aantal mensen binnenkomen:");
        knopEEN = new Button("Man");
        knopTWEE = new Button("Vrouw");
        knopDRIE = new Button("Meisje");
        knopVIER = new Button("Jongen");


        knopEEN.addActionListener(new eenListener());
        knopTWEE.addActionListener(new tweeListener());
        knopDRIE.addActionListener(new drieListener());
        knopVIER.addActionListener(new vierListener());

        add(label);
        add(knopEEN);
        add(knopTWEE);
        add(knopDRIE);
        add(knopVIER);
        Man = "Man:";
        Vrouw ="Vrouw:";
        Meisje ="Meisje:";
        Jongen = "Jongen:";





    }

    public void paint(Graphics g) {
        g.drawString(Man + Persoon1 , 50,50);
        g.drawString(Vrouw + Persoon2, 50,70);
        g.drawString(Meisje + Persoon3, 50,90);
        g.drawString(Jongen + Persoon4, 50,110);






    }

    class eenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         Persoon1 = 0 + Persoon1;
         Persoon1++;
         repaint();

        }
    }

    class tweeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon2 = 0 + Persoon2;
            Persoon2++;


            repaint();
        }
    }


    class drieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon3 = 0 + Persoon3;
            Persoon3++;

            repaint();
        }
    }
    class vierListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Persoon4 = 0 + Persoon4;
            Persoon4++;


            repaint();
        }
    }
}

