import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	public Main(){
		initUI();
	}

	private void initUI() {
		add(new Board());
		setSize(800,800);
		setResizable(false);
		setTitle("Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				Main m = new Main();
				m.setVisible(true);
			}
		});
	}
}	

//TD

