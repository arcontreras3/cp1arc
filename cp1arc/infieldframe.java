import javax.swing.JFrame;

public class infieldframe
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        field picture = new field();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
