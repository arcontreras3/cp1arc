
/**
 * Baseball Field
 *
 * Anthony Contreras
 * 1/29/18
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class field extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        	Color brown=new Color(165,42,42);
		g2.setColor(brown);
		g2.setStroke(new BasicStroke(5));


		Ellipse2D.Double infield = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(infield);
		g2.setStroke(new BasicStroke(1));
		
		Rectangle home = new Rectangle(100,200,100,100);
		g2.draw(home);
		g2.fill(home);
		
		g2.setStroke(new BasicStroke(20));
		g2.drawLine(100,300,100,50);
		g2.drawLine(100,300,350,300);
		

		g2.setStroke(new BasicStroke(5));
		g2.setColor(new Color (255,255,255));
		g2.drawLine(100,300,100,50);
		g2.drawLine(100,300,350,300);

		
		Rectangle grass = new Rectangle(125,200,75,75);
		g2.setStroke(new BasicStroke(1));
		g2.setColor(new Color(0,129,0));
		g2.draw(grass);
		g2.fill(grass);

		Rectangle first = new Rectangle(213,290,10,10);
		g2.setColor(new Color (255,255,255));
		g2.draw(first);
		g2.fill(first);

		Rectangle second = new Rectangle(213,177,10,10);
		g2.setColor(new Color (255,255,255));
		g2.draw(second);
		g2.fill(second);

		Rectangle secondbase = new Rectangle(100,177,10,10);
		g2.setColor(new Color (255,255,255));
		g2.draw(secondbase);
		g2.fill(secondbase);
		
		
		g2.setStroke(new BasicStroke(1));

   	// comment this out once you have finished
        //drawGrid(g2);
    }
    //public void drawGrid(Graphics g2){
        //g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        //for(int x = 0; x < 1000; x += 50){
            //g2.drawLine(x, 0, x, 1000);
            //g2.drawString("" + x, x, 10);
        //}
        
        // Draw horizontal lines
        //for(int y = 50; y < 1000; y += 50){
            //g2.drawLine(0, y, 1000, y);
            //g2.drawString("" + y, 0, y);
        //}
    //}
}
