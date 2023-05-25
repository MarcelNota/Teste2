package Teste2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textBI;
	private JTextField textMunicipio;
	private JTextField textHistorico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(31, 28, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textNome.setBounds(129, 25, 189, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblBi = new JLabel("BI");
		lblBi.setBounds(31, 80, 46, 14);
		contentPane.add(lblBi);
		
		textBI = new JTextField();
		textBI.setBounds(129, 77, 189, 20);
		contentPane.add(textBI);
		textBI.setColumns(10);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(31, 132, 46, 14);
		contentPane.add(lblMunicipio);
		
		textMunicipio = new JTextField();
		textMunicipio.setBounds(129, 129, 189, 20);
		contentPane.add(textMunicipio);
		textMunicipio.setColumns(10);
		
		JLabel lblHistorico = new JLabel("Historico");
		lblHistorico.setBounds(31, 233, 46, 14);
		contentPane.add(lblHistorico);
		
		textHistorico = new JTextField();
		textHistorico.setBounds(129, 230, 189, 20);
		contentPane.add(textHistorico);
		textHistorico.setColumns(10);
		
		JButton btnHistorico = new JButton("Historico");
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHistorico.setBounds(173, 298, 89, 23);
		contentPane.add(btnHistorico);
	}
}
