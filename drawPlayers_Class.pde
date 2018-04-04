//Created by Garrett Petersen

import java.awt.Graphics2D;

private void drawPlayerUp(Graphics2D g2d) {
  switch (playerAnimPos) {
  case 1:
    g2d.drawImage(player1up, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(player2up, player_x + 1, player_y + 1, this);
    break;
  case 3:
    g2d.drawImage(enemyup, player_x + 1, player_y + 1, this);
    break;
  }
}

private void drawPlayerDown(Graphics2D g2d) {
  switch (playerAnimPos) {
  case 1:
    g2d.drawImage(player1down, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(player2down, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(enemy1down, player_x + 1, player_y + 1, this);
    break;
  }
}

private void drawPlayerLeft(Graphics2D g2d) {
  switch (playerAnimPos) {
  case 1:
    g2d.drawImage(player1left, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(player2left, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(enemy1left, player_x + 1, player_y + 1, this);
    break;
  }
}

private void drawPlayerRight(Graphics2D g2d) {
  switch (playerAnimPos) {
  case 1:
    g2d.drawImage(player1right, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(player2right, player_x + 1, player_y + 1, this);
    break;
  case 2:
    g2d.drawImage(enemy1right, player_x + 1, player_y + 1, this);
    break;
  }
}

//--