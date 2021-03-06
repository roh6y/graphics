import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
@SuppressWarnings("serial")
///start o.///
public class Hatto extends JFrame{
public Hatto() {
setTitle("Hatto");
setSize(280,280);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
getContentPane().setLayout(null);
JButton d1 = new JButton("default");
d1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	setSize(280,280);
	}
});
d1.setFont(new Font("Tahoma", Font.BOLD, 11));
d1.setForeground(Color.RED);
d1.setBounds(6, 208, 106, 23);
getContentPane().add(d1);
JButton ls = new JButton("Landscape");
ls.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		setSize(1050,500);
	}
});
ls.setBounds(122, 208, 116, 23);
getContentPane().add(ls);
JLabel view = new JLabel("Views");
view.setFont(new Font("Tahoma", Font.BOLD, 13));
view.setBounds(90, 185, 66, 23);
getContentPane().add(view);
//center pos. (setLocationRelativeTo(null);) 
//280x280 square display. Value millimeter. All rights reserved.
}
public void paint(Graphics g) {
super.paint(g);
g.setColor(Color.black);
g.fillOval(100, 60, 70, 40);
g.setColor(Color.gray);
g.fillOval(100, 80, 70, 50);
g.setColor(Color.RED);
g.fillRect(100,140,70,60);
g.fillOval(90, 130, 90, 30);
g.setColor(Color.GREEN);
g.drawRect(50, 50, 170, 170);
}
public static void main(String[] args) {
Hatto h = new Hatto();
h.setVisible(true);
}
}
