import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JFrame{

	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image image;
    public Rectangle rect1 = new Rectangle(x, y, 144, 144);

    public Player(int x, int y) {
        ImageIcon ii = new ImageIcon("circle.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }

	public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
       return x;
    }

    public int getY() {
       return y;
    }

    public Image getImage() {
       return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    public Rectangle getBounds(){     
       return rect1;
    }
}

//TD

