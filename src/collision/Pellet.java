import javax.swing.*;
import java.awt.*;

public class Pellet extends JFrame{

    private int x;
    private int y;
    private Image image;
    public Rectangle rect2 = new Rectangle(x, y, 72, 72);

    public Pellet(int x, int y) {
        ImageIcon i = new ImageIcon("pellets.png");
        image = i.getImage();
        this.x = x;
        this.y = y;
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

    public Rectangle getBounds(){
        return rect2;
    }
    
}

//TD

