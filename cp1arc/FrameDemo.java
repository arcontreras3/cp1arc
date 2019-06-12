import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //creates the title of the frame. creating the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //tells it to end program when you exit screen
		frame.setSize(400, 400); //sets width and height of the frame
		
		Shapes r = new Shapes();//creates the shapes object
		frame.add(r);//adds the object to the frame
		
		frame.setVisible(true); //makes it visible
	}
}
