import javax.swing.JFrame;
import java.awt.Color;
public class CircleH {
public static void main(String [] args) {
JFrame f = new JFrame();
MoveCircle mc = new MoveCircle();
mc.setBackground(new Color(0, 0, 255));
f.getContentPane().add(mc);
mc.setLayout(null);
f.setTitle("MoveCircle");
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,500);
System.out.println("Instructions\n-----------");
System.out.println("Press the arrow keys to move the circle.\n Release the key to stop the circle.");
}
}
