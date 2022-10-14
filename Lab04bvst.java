// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
 g.drawLine(50,50,150, 50);
        g.drawLine( 50,50,50,150);
        g.drawLine( 150, 50, 150,150);
        g.drawLine(50,150,150,150);
        g.drawLine(50,50,100,100);
        g.drawLine(100,100,200,100);
        g.drawLine(150,50,200,100);
        g.drawLine(100,100,100,200);
        g.drawLine(100,200,200,200);
        g.drawLine(150,150,200,200);
        g.drawLine(200,100,200,200);
        g.drawLine(50,150,100,200);
        // DRAW SPHERE
        g.drawOval(400,50,250,250);
        g.drawOval(500,50,50,250);
        g.drawOval(475,50,100,250);
        g.drawOval(450,50,150,250);
        g.drawOval(425,50,200,250);
        g.drawOval(400,150,250,50);
        g.drawOval(400,125,250,100);
        g.drawOval(400,100,250,150);
        g.drawOval(400,75,250,200);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
       g.drawOval(800,50,100,100);
       g.drawLine(800,50,750,100);


        // DRAW APCS
       g.fillRect(75,475,25,525);
       g.fillRect(150,475,25,500);
       g.fillRect(75,475,100,25);
       g.fillRect(75,525,100,25);
       g.fillRect(200,475,25,525);
       g.fillRect(200,475,100,25);
       g.fillRect(200,525,100,25);
       g.fillRect(300,475,25,75);
       g.fillRect(350,475,25,525);
       g.fillRect(350,475,100,25);
       g.fillRect(350,625,100,25);
       g.fillRect(500,475,100,25);
       g.fillRect(500,550,100,25);
       g.fillRect(500,475,25,100);
       g.fillRect(575,550,25,100);
       g.fillRect(500,625,100,25);
        // DRAW PACMEN FLOWER
        g.fillArc(825,450,75,75,135,270);
        g.fillArc(875,500,75,75,45,270);
        g.fillArc(825,550,75,75,-135,-270);
        g.fillArc(775,500,75,75,225,275);



    }

}


