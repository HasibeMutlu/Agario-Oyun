import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstFrame extends JFrame {

	private FirstPanel contentPane;
	
	/**
	 * Oyun baslama ekranin main metodunda cagirilmasi
	 */
	public static void main(String[] args) {
		FirstFrame frame = new FirstFrame();
		//frame.pack();
		frame.setVisible(true);
		
	}

	/**
	 * Giris form ekraninin ayarlari
	 */
	public FirstFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new FirstPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("AGARIO 2017 JAVA");
	}

}
