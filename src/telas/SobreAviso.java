package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JTextArea;

public class SobreAviso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SobreAviso frame = new SobreAviso();
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
	public SobreAviso() {
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
		
		JLabel lblNewLabel_1 = new JLabel("APONTAMENTOS SOBRE AVISO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(76, 8, 630, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Vector.png"));
		lblNewLabel_2.setBounds(36, 79, 45, 21);
		contentPane.add(lblNewLabel_2);
		
		Label label = new Label("Entrada:");
		label.setFont(new Font("Roboto", Font.PLAIN, 14));
		label.setBounds(60, 79, 84, 21);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(32, 103, 360, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Vector.png"));
		lblNewLabel_2_1.setBounds(420, 79, 45, 21);
		contentPane.add(lblNewLabel_2_1);
		
		Label label_1 = new Label("Saída:");
		label_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_1.setBounds(444, 79, 84, 21);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(416, 103, 360, 32);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\building-solid 1.png"));
		lblNewLabel_2_2.setBounds(40, 145, 27, 21);
		contentPane.add(lblNewLabel_2_2);
		
		Label label_2 = new Label("Cliente:");
		label_2.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_2.setBounds(64, 145, 201, 21);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(36, 169, 235, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\folder-solid 1.png"));
		lblNewLabel_2_2_1.setBounds(297, 145, 27, 21);
		contentPane.add(lblNewLabel_2_2_1);
		
		Label label_2_1 = new Label("Projeto:");
		label_2_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_2_1.setBounds(321, 145, 201, 21);
		contentPane.add(label_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(293, 169, 235, 32);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("");
		lblNewLabel_2_2_2.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\building-user-solid 1.png"));
		lblNewLabel_2_2_2.setBounds(545, 145, 27, 21);
		contentPane.add(lblNewLabel_2_2_2);
		
		Label label_2_2 = new Label("Solicitante:");
		label_2_2.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_2_2.setBounds(569, 145, 201, 21);
		contentPane.add(label_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(541, 169, 235, 32);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(36, 235, 360, 32);
		contentPane.add(textField_5);
		
		Label label_1_1 = new Label("CR:");
		label_1_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_1_1.setBounds(64, 211, 84, 21);
		contentPane.add(label_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\file-invoice-dollar-solid 1.png"));
		lblNewLabel_2_1_1.setBounds(40, 211, 27, 21);
		contentPane.add(lblNewLabel_2_1_1);
		
		Label label_1_2 = new Label("Saída:");
		label_1_2.setFont(new Font("Roboto", Font.PLAIN, 14));
		label_1_2.setBounds(60, 277, 84, 21);
		contentPane.add(label_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\ROnaldo.png"));
		lblNewLabel_2_1_2.setBounds(36, 277, 45, 21);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton = new JButton("Submeter Hora Extra");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnNewButton.setBounds(297, 654, 200, 40);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnCancelar.setBounds(297, 713, 200, 40);
		contentPane.add(btnCancelar);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Roboto", Font.PLAIN, 16));
		textArea.setTabSize(1);
		textArea.setRows(67);
		textArea.setLineWrap(true);
		textArea.setColumns(1);
		textArea.setBounds(36, 304, 740, 141);
		contentPane.add(textArea);
	}
}
