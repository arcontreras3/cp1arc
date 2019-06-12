/**
 * It is the BMW logo
 *
 * Anthony Contreras
 * January 25th
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class bmwlogo extends JComponent{
  
	public void paintComponent(Graphics g){

        	Graphics2D g2 = (Graphics2D)g;
        
		
		g2.setColor(Color.black);

		Rectangle topleft = new Rectangle(125,125,75,75);
		g2.draw(topleft);

		g2.setColor(Color.blue);
		g2.fill(topleft);

		g2.setColor(Color.black);
		Rectangle topright = new Rectangle(200,125,75,75);
		g2.draw(topright);

		Rectangle bottomleft = new Rectangle(125,200,75,75);
		g2.draw(bottomleft);

		Rectangle bottomright = new Rectangle(200,200,75,75);
		g2.draw(bottomright);

		g2.setColor(Color.blue);
		g2.fill(bottomright);

		g2.setColor(Color.black);
		Ellipse2D.Double outercircle = new Ellipse2D.Double(100,100,200,200);
		g2.setStroke(new BasicStroke(50));
		g2.draw(outercircle);


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
