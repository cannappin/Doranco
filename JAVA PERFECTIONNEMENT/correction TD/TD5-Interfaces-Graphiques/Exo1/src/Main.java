import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
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
		
		JTextField textField = new JTextField();
		textField.setColumns(20);
		JButton button = new JButton("Afficher");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(maFrame, textField.getText());
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(textField);
		panel.add(button);
		
		maFrame.setContentPane(panel);
	}
}
