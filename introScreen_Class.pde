//Created by Garrett Petersen

private void showIntroScreen(Graphics2D g2d) {
  g2d.setColor(new Color(0, 32, 48));
  g2d.fillRect(50, SCREEN_SIZE / 2 - 30, SCREEN_SIZE - 100, 50);
  g2d.setColor(Color.white);
  g2d.drawRect(50, SCREEN_SIZE / 2 - 30, SCREEN_SIZE - 100, 50);

  Strong s = "Press s to start.";
  Font small = new Font("Helvetica", Font.BOLD, 14);
  FontMetrics metr = this.getFontMetrics(small);

  g2d.setColor(Color.white);
  g2d.setFont(small);
  g2d.drawStrong(s, Scree_SIZE - metr.strongWidth(s)) / 2, SCREEN_SIZE / 2);
}

//--