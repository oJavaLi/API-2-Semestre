package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;

public class Funcionarios extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionarios frame = new Funcionarios();
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
	public Funcionarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\Group 6.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(2, 32, 65));
		panel.setBounds(0, 0, 858, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\image 2.png"));
		lblNewLabel.setBounds(32, 8, 92, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FUNCIONÁRIOS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(321, 12, 268, 32);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(46, 82, 118));
		panel_1.setBounds(0, 131, 824, 64);
		contentPane.add(panel_1);
		
		Label label = new Label("DATA");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Roboto", Font.BOLD, 16));
		label.setBounds(96, 10, 146, 48);
		panel_1.add(label);
		
		Label label_1 = new Label("TIPO");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Roboto", Font.BOLD, 16));
		label_1.setBounds(271, 10, 146, 48);
		panel_1.add(label_1);
		
		Label label_2 = new Label("PROJETO");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Roboto", Font.BOLD, 16));
		label_2.setBounds(423, 10, 146, 48);
		panel_1.add(label_2);
		
		Label label_3 = new Label("HORAS");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Roboto", Font.BOLD, 16));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(560, 10, 120, 28);
		panel_1.add(label_3);
		
		Label label_4 = new Label("APONTADAS");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Roboto", Font.BOLD, 16));
		label_4.setBounds(575, 36, 146, 22);
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(21, 246, 741, 423);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 56, 554, 315);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
	}
}
