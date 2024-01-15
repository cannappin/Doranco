import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame maFrame = new JFrame();
		//MyJFrame maFrame = new MyJFrame();
		//Mettre un titre à la fenêtre
		maFrame.setTitle("Points Cardinaux");
		//Taille de la fenetre
		maFrame.setSize(400,300);
		//Empeche le redimensionnement de la fenetre
		maFrame.setResizable(false);
		//Click sur la croix entraine la fermeture de la fenetre
		maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Centrer la fenetre sur l'écran
		maFrame.setLocationRelativeTo(null);
		maFrame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton button1 = new JButton("Nord");
		panel.add(button1,BorderLayout.PAGE_START);		
		JButton button2 = new JButton("Est");
		panel.add(button2,BorderLayout.LINE_START);
		JButton button3 = new JButton("Centre");
		panel.add(button3,BorderLayout.CENTER);
		JButton button4 = new JButton("Ouest");
		panel.add(button4,BorderLayout.LINE_END);
		JButton button5 = new JButton("Sud");
		panel.add(button5,BorderLayout.PAGE_END);
		
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, "Je suis le Nord");
			}
		});
		
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, "Je suis l'est");
			}
		});
		
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, "Je suis le centre");
			}
		});
		
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, "Je suis l'ouest");
			}
		});
		
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, "Je suis le sud");
			}
		});
		
		maFrame.setContentPane(panel);
	}
}
