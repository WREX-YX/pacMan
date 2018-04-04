//Created by Garrett Petersen

import java.awt.Image
  import java.awt.Graphics2D;
import javax.swing.ImageIcon;

private Image enemy;
private Image player1, player1up, player1down, player1left, player1right;
private Image player2, player2up, player2down, player2left, player2right;

private void loadImages() {

  enemy = new ImageIcon("images/enemy.png").getImage();

  player1 = new ImageIcon("images/player1.png").getImage();
  player1up = new ImageIcon("images/player1up.png").getImage();
  player1down = new ImageIcon("images/player1down.png").getImage();
  player1left = new ImageIcon("images/player1left.png").getImage();
  player1right = new ImageIcon("images/player1right.png").getImage();

  player2 = new ImageIcon("images/pacmanp2.png").getImage();
  player2up = new ImageIcon("images/player2up.png").getImage();
  player2down = new ImageIcon("images/player2down.png").getImage();
  player2left = new ImageIcon("images/player2left.png").getImage();
  player2right = new ImageIcon("images/player2right.png").getImage();
}

//--