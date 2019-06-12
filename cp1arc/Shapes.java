import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;//importing graphics 2D

		Rectangle box = new Rectangle(5, 10, 50, 30);//parameters of a rectangle
		g2.draw(box);//draw box

		g2.setColor(Color.blue);//sets color blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 100, 100);//first two are coordinates, then width, the height
		g2.fill(circle);//the circle is filled

	}
}
