package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;

public class AddFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFuncionario frame = new AddFuncionario();
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
	public AddFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Group 6.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(2, 32, 65));
		panel.setBounds(0, 0, 858, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\image 2.png"));
		lblNewLabel.setBounds(32, 8, 92, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADICIONAR FUNCIONÁRIO\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(76, 8, 630, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Completo:");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(32, 79, 129, 19);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto", Font.PLAIN, 16));
		textField.setBounds(32, 108, 736, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Categoria:");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(32, 225, 129, 19);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Roberto", "Rodrigo", "Ronaldo"}));
		comboBox.setBounds(32, 254, 360, 32);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Matrícula:");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(408, 225, 129, 19);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(408, 255, 360, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Senha:");
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(32, 366, 129, 19);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Confirmar Senha:");
		lblNewLabel_2_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblNewLabel_2_1_1_2.setBounds(408, 366, 129, 19);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(32, 395, 360, 32);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(408, 395, 360, 32);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(307, 581, 151, 32);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(307, 644, 151, 32);
		contentPane.add(btnCancelar);
	}
}
