import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		JFrame maFrame = new JFrame();
		//MyJFrame maFrame = new MyJFrame();
		//Mettre un titre à la fenêtre
		maFrame.setTitle("My First Window");
		//Taille de la fenetre
		maFrame.setSize(400,300);
		//Empeche le redimensionnement de la fenetre
		maFrame.setResizable(false);
		//Click sur la croix entraine la fermeture de la fenetre
		maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Centrer la fenetre sur l'écran
		maFrame.setLocationRelativeTo(null);
		maFrame.setVisible(true);
		
		JTextField textField1 = new JTextField();
		textField1.setColumns(5);
		JLabel label = new JLabel("+");
		
		JTextField textField2 = new JTextField();
		textField2.setColumns(5);
		
		JTextField textField3 = new JTextField();
		textField3.setColumns(5);
		textField3.setEditable(false);
		
		JButton button = new JButton("=");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = Integer.parseInt(textField1.getText());
				int j = Integer.parseInt(textField2.getText());
				textField3.setText(""+(i+j));
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(textField1);
		panel.add(label);
		panel.add(textField2);
		panel.add(button);
		panel.add(textField3);
		
		maFrame.setContentPane(panel);
		maFrame.pack();
	}
}
