package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class Apontamentos extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apontamentos frame = new Apontamentos();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Apontamentos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pitag\\Downloads\\Group 6.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(243, 243, 243));
		panel_2.setBounds(-237, 212, 1117, 425);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(282, 10, 692, 413);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFocusTraversalKeysEnabled(false);
		table.setFocusable(false);
		table.setRequestFocusEnabled(false);
		table.setAutoscrolls(false);
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setSelectionForeground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Alan", "Corte", new Double(10.0)},
				{"eqweqw", "eqwe", "eweqwq", "qewq"},
				{"wqeqw", "qweqw", "eqweqwqw", "eqweqwe"},
				{"eqwe", null, "eqwe", null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(2, 32, 65));
		panel.setBounds(0, 0, 858, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\projetos-eclipse\\Full Mad Agilist\\src\\imagens\\image 2.png"));
		lblNewLabel.setBounds(32, 8, 92, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("APONTAMENTOS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(321, 12, 268, 32);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 82, 118));
		panel_1.setBounds(0, 137, 824, 64);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Label label = new Label("DATA");
		label.setForeground(new Color(255, 255, 255));
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
		label_3.setBounds(560, 10, 120, 28);
		panel_1.add(label_3);
		label_3.setAlignment(Label.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Roboto", Font.BOLD, 16));
		
		Label label_4 = new Label("APONTADAS");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Roboto", Font.BOLD, 16));
		label_4.setBounds(575, 36, 146, 22);
		panel_1.add(label_4);
		
		JButton btnNewButton = new JButton("+ Apontar Hora Extra");
		btnNewButton.setBounds(10, 677, 200, 40);
		contentPane.add(btnNewButton);
		
		JButton btnApontarSobre = new JButton("+ Apontar Sobre Aviso");
		btnApontarSobre.setBounds(291, 677, 200, 40);
		contentPane.add(btnApontarSobre);
		
		JButton btnSair = new JButton("Sair\r\n");
		btnSair.setBounds(576, 677, 200, 40);
		contentPane.add(btnSair);
	}
}
