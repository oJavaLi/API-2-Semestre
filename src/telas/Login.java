package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;

public class Login extends JFrame {
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pitag\\Downloads\\Group 6.png"));
		getContentPane().setBackground(new Color(24, 35, 57));
		getContentPane().setLayout(null);
		setResizable(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Group 6.png"));
		lblNewLabel.setBounds(275, 35, 326, 209);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Acessar");
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setHideActionText(true);
		btnNewButton.setInheritsPopupMenu(true);
		btnNewButton.setIgnoreRepaint(true);
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Botao Acessar (1).png"));
		btnNewButton.setForeground(new Color(40, 50, 30));
		btnNewButton.setBackground(new Color(24, 35, 57));
		btnNewButton.setBounds(234, 482, 338, 60);
		getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setMargin(new Insets(2, 10, 2, 2));
		passwordField.setFont(new Font("Roboto", Font.PLAIN, 30));
		passwordField.setBounds(160, 390, 480, 60);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(160, 367, 69, 20);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setCaretColor(new Color(24, 35, 57));
		textField.setMargin(new Insets(2, 10, 2, 2));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Roboto", Font.PLAIN, 30));
		textField.setBounds(160, 286, 480, 60);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuário");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(160, 256, 69, 20);
		getContentPane().add(lblNewLabel_1_1);
		setBackground(new Color(24, 35, 57));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800,800);
	}
}
