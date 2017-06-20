package datenstrukturenView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datenstrukturenController.Produkt;
import datenstrukturenController.Warenspeicher;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Warenverwaltung extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPNAME;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warenverwaltung frame = new Warenverwaltung();
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
	public Warenverwaltung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldPNAME = new JTextField("");
		textFieldPNAME.setBounds(6, 42, 130, 26);
		contentPane.add(textFieldPNAME);
		textFieldPNAME.setColumns(10);

		JLabel lblAnzalProduct = new JLabel("Produkte_Gleicher_Name");
		lblAnzalProduct.setBounds(176, 47, 164, 16);
		contentPane.add(lblAnzalProduct);

		JButton btnNewButton = new JButton("Zahl anzeigen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double kosten = 100;
				String name = "Bier";
				double verkaufswert = 23;
				Produkt p = new Produkt(kosten, name, verkaufswert);

				Warenspeicher w = new Warenspeicher();
				w.fuegeProduktHinzu(p);
				w.fuegeProduktHinzu(new Produkt(100, "Tomaten", 1));
				w.fuegeProduktHinzu(new Produkt(100, "Tomaten", 5));
				w.fuegeProduktHinzu(new Produkt(100, "Paprika", 5));
				w.fuegeProduktHinzu(new Produkt(100, "Reis", 122));
				w.fuegeProduktHinzu(new Produkt(100, "Reis", 122));
				w.fuegeProduktHinzu(new Produkt(100, "Reis", 122));
				w.fuegeProduktHinzu(new Produkt(100, "Reis", 122));
				w.fuegeProduktHinzu(new Produkt(100, "Reis", 122));

				lblAnzalProduct.setText(w.anzahlImSpeicher(textFieldPNAME.getText()) + "");
			}
		});
		btnNewButton.setBounds(6, 93, 130, 26);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Warenverwaltung");
		label.setBounds(146, 6, 123, 16);
		contentPane.add(label);
		
		JButton button = new JButton("Löschen");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(130, 93, 96, 26);
		contentPane.add(button);
	}
}
