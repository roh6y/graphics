import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener{
private JButton bt;
public Main() {
setTitle("Circle");
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
getContentPane().setLayout(null);
bt = new JButton("Information");
bt.setBounds(292, 277, 157, 31);
bt.setFont(new Font("Comic Sans MS", 18,18));
bt.addActionListener(this);
getContentPane().add(bt);
setVisible(true);
}
public void paint(Graphics g) {
super.paint(g);
g.setColor(Color.GREEN);
g.fillOval(80, 200, 40, 40);
g.setColor(Color.RED);
g.fillOval(125, 180, 40, 40);
g.setColor(Color.YELLOW);
g.fillOval(20, 50, 70, 70);
}
public static void main(String[] args) {
new Main();
}
@Override
public void actionPerformed(ActionEvent a) {
if(a.getSource() == bt) {
System.out.println("Name = Main\nDate Released = 19/7/2020\nTime = 12:29pm\nHC Code = TG3X1\n Made By = Rohit Krishnan J");
System.out.close();
}
	
}
}
