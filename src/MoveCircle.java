import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


@SuppressWarnings("serial")
public class MoveCircle extends JPanel implements ActionListener,KeyListener{

Timer t = new Timer(7,this);
double x = 0, y = 0, velx = 0, vely = 0;
public MoveCircle() {
t.start();
addKeyListener(this);
setFocusable(true);
setFocusTraversalKeysEnabled(false);

}
public void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2 =(Graphics2D) g;
g2.setColor(Color.GREEN);
g2.fill(new Ellipse2D.Double(x,y,40,40));

}
public void actionPerformed(ActionEvent e) {
repaint();
x += velx; 
y += vely;
}

public void up() {
vely = -3;
velx = 0;
if(y<0) {
y = 0;	
}

}
public void down() {
vely = 3;
velx = 0;
}
public void left() {
velx = -3;
vely = 0;
}
public void right() {
velx = 3;
vely = 0;
}


public void keyPressed(KeyEvent e) {
int code = e.getKeyCode();
if(code == KeyEvent.VK_UP) {
up();
}
if(code == KeyEvent.VK_DOWN) {
down();	
}
if(code == KeyEvent.VK_LEFT) {
left();	
}
if(code == KeyEvent.VK_RIGHT) {
right();	
}
}
public void keyTyped(KeyEvent e) {}
public void keyReleased(KeyEvent e) {
velx = 0;
vely = 0;
}
}