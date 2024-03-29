package TESTE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bd.Bd;

import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class InterfacaeVtoMunicipio extends JFrame {

	private JPanel contentPane;
	private JTable tabelaCadidato;
	private JTable tabelaMunicipio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacaeVtoMunicipio frame = new InterfacaeVtoMunicipio();
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
	public InterfacaeVtoMunicipio() {
		setTitle("Voto");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbMuni = new JComboBox();
		cbMuni.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String muni= cbMuni.getSelectedItem()+"";
				if(cbMuni.getSelectedItem()!= null) {
					cbMuni.setModel(new DefaultComboBoxModel(Bd.listarCandidatosFiltro(muni)));
				}
			}
		});
		cbMuni.setModel(new DefaultComboBoxModel(Bd.listarMunicipio()));
		cbMuni.setBounds(134, 29, 319, 22);
		contentPane.add(cbMuni);
		
		JLabel lblNewLabel = new JLabel("MUNICIPIO DE: ");
		lblNewLabel.setBounds(27, 33, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CADIDATO: ");
		lblNewLabel_1.setBounds(27, 77, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbCandidato = new JComboBox();
		cbCandidato.setModel(new DefaultComboBoxModel(Bd.listarCandidatos()));
		cbCandidato.setBounds(134, 73, 319, 22);
		
		contentPane.add(cbCandidato);
		
		JButton btnNewButton = new JButton("VOTAR");
		btnNewButton.setBounds(309, 124, 144, 33);
		contentPane.add(btnNewButton);
		
		JButton btnVotoBranco = new JButton("VOTO BRANCO");
		btnVotoBranco.setBounds(134, 124, 144, 33);
		contentPane.add(btnVotoBranco);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 168, 471, 131);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		tabelaCadidato = new JTable();
		scrollPane.setViewportView(tabelaCadidato);
		tabelaCadidato.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"#", "NOME", "BI", "HISTORICO", "VOTOS"
			}
		));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 310, 471, 138);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		
		tabelaMunicipio = new JTable();
		scrollPane_1.setViewportView(tabelaMunicipio);
		tabelaMunicipio.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"#", "MUNICIPIO", "DESCRICAO", "PROVINCIA", "QUANTIDADE DE RECENCIADOS", "VOTOS BRANCOS"
			}
		));
	}
}
