import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener{

	private Timer timer;
	private Player player;
	private Pellet pellet;
	private final int DELAY = 10;
    	public Rectangle rect1;
    	public Rectangle rect2;
	//Random random = new Random();
    	//int r = random.nextInt(790) + 10;

	public Board() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.WHITE);

		player = new Player(10, 100);
		pellet = new Pellet(300,100);


		timer = new Timer(DELAY, this);
		timer.start();
        
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}

	 private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
        if (collision()){
            remove(pellet);
	    //g2d.drawImage(pellet.getImage(), r, r, this);
        } else{
            g2d.drawImage(pellet.getImage(), pellet.getX(), pellet.getY(), this); 
         }
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();  
   }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        boolean retval = collision();
        if (retval){
            g2d.drawString("collision", 10, 10);
        }
    }
    
    public boolean collision() {
        Rectangle rect1 = new Rectangle(player.getX(), player.getY(), 144, 144);
        Rectangle rect2 = new Rectangle(pellet.getX(), pellet.getY(), 72, 72);
        Rectangle r1 = rect1.getBounds();
        Rectangle r2 = rect2.getBounds();

        if (r1.intersects(r2)){
            return(true);
        }
        else{
            return(false);
        }
     }
}

//TD
