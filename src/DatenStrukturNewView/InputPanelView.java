package DatenStrukturNewView;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import datenstrukturenController.Produkt;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class InputPanelView extends JPanel {
	private JTextField tfName;
	private JTextField tfPKosten;
	private JTextField tfVWert;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private PanelManager panelManager;
	JComboBox comboBox = new JComboBox();

	/**
	 * Create the panel.
	 */
	public InputPanelView(PanelManager panelManager) {
		this.panelManager = panelManager;

		setBackground(Color.GRAY);
		setLayout(null);
		setSize(200, 200);
		setPreferredSize(new Dimension(500, 500));

		JLabel lblProdukt = new JLabel("Produkt");
		lblProdukt.setFont(new Font("Comic Sans MS", Font.PLAIN, 18)); // Schriftart
		lblProdukt.setForeground(Color.ORANGE);
		lblProdukt.setBounds(6, 6, 90, 16);
		add(lblProdukt);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(6, 34, 61, 16);
		add(lblName);

		JLabel lblMaschine = new JLabel("Maschine");
		lblMaschine.setForeground(Color.ORANGE);
		lblMaschine.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblMaschine.setBounds(6, 160, 90, 16);
		add(lblMaschine);

		JLabel lblFabriktests = new JLabel("Fabriktests");
		lblFabriktests.setForeground(Color.ORANGE);
		lblFabriktests.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblFabriktests.setBounds(6, 344, 99, 16);
		add(lblFabriktests);

		JLabel lblProduktkosten = new JLabel("ProduktKosten:");
		lblProduktkosten.setForeground(Color.WHITE);
		lblProduktkosten.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblProduktkosten.setBounds(6, 62, 116, 16);
		add(lblProduktkosten);

		JLabel lblVerkauftskauf = new JLabel("Verkauftskauf:");
		lblVerkauftskauf.setForeground(Color.WHITE);
		lblVerkauftskauf.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblVerkauftskauf.setBounds(6, 90, 99, 16);
		add(lblVerkauftskauf);

		tfName = new JTextField();
		tfName.setBounds(216, 30, 130, 26);
		add(tfName); // Textfild im Panel hinzufugen
		tfName.setColumns(10);

		tfPKosten = new JTextField();
		tfPKosten.setColumns(10);
		tfPKosten.setBounds(216, 58, 130, 26);
		add(tfPKosten);

		tfVWert = new JTextField();
		tfVWert.setColumns(10);
		tfVWert.setBounds(216, 86, 130, 26);
		add(tfVWert);

		JButton Produktanlegen = new JButton("Produkt anlegen");
		Produktanlegen.setForeground(Color.RED);
		Produktanlegen.setBounds(216, 118, 130, 29);
		add(Produktanlegen);

		JLabel label = new JLabel("Name:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label.setBounds(6, 188, 61, 16);
		add(label);

		JLabel lblKosten = new JLabel("Kosten:");
		lblKosten.setForeground(Color.WHITE);
		lblKosten.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblKosten.setBounds(6, 216, 61, 16);
		add(lblKosten);

		JLabel lblErzeugnis = new JLabel("Erzeugnis:");
		lblErzeugnis.setForeground(Color.WHITE);
		lblErzeugnis.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblErzeugnis.setBounds(6, 247, 78, 16);
		add(lblErzeugnis);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(216, 184, 130, 26);
		add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(216, 212, 130, 26);
		add(textField_4);

		comboBox.setBounds(216, 244, 130, 27);
		add(comboBox);

		JLabel lblBedingung = new JLabel("Bedingung?");
		lblBedingung.setForeground(Color.WHITE);
		lblBedingung.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBedingung.setBounds(35, 281, 95, 26);
		add(lblBedingung);

		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(6, 281, 34, 26);
		add(checkBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(216, 283, 130, 27);
		add(comboBox_1);

		JLabel lblTestguthabens = new JLabel("Testguthaben:");
		lblTestguthabens.setForeground(Color.WHITE);
		lblTestguthabens.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblTestguthabens.setBounds(6, 370, 99, 16);
		add(lblTestguthabens);

		JLabel label_1 = new JLabel("500,0");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		label_1.setBounds(216, 371, 61, 16);
		add(label_1);

		JLabel lblAnzahlDerRunden = new JLabel("Anzahl der Runden:");
		lblAnzahlDerRunden.setForeground(Color.WHITE);
		lblAnzahlDerRunden.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblAnzahlDerRunden.setBounds(6, 401, 148, 16);
		add(lblAnzahlDerRunden);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(216, 397, 130, 26);
		add(textField_5);
		

		JButton btnFabrikZurcktsetzen = new JButton("Fabrik zurücktsetzen");
		btnFabrikZurcktsetzen.setForeground(Color.RED);
		btnFabrikZurcktsetzen.setBounds(6, 437, 164, 29);
		add(btnFabrikZurcktsetzen);

		JButton btnTestStarten = new JButton("Test starten");
		btnTestStarten.setForeground(Color.RED);
		btnTestStarten.setBounds(216, 437, 130, 29);
		add(btnTestStarten);

		// Buttons werden dem Listener zugeordnet
		Produktanlegen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panelManager.addOrReplaceProduktentwurf(new Produkt(Double.parseDouble(tfPKosten.getText()),
						(tfName.getText()), Double.parseDouble(tfVWert.getText())));
				//updateData();
			}
		});
	}

	public void updateData() {
		comboBox.removeAllItems();
		for (Produkt p : panelManager.getProduktEntwueft()) {
			
			comboBox.addItem(p.getName());
			

		}

	}
}
