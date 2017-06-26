package DatenStrukturNewView;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Itempanel extends JPanel {
	JLabel lbTypName = new JLabel("Typ");
	JLabel lblTyp = new JLabel();
	JLabel lblName = new JLabel();
	JLabel kosten = new JLabel();

	public Itempanel() {
		setLayout(null);
		lbTypName.setBounds(10, 11, 96, 14);
		add(lbTypName);
		lblTyp.setBounds(71, 11, 96, 14);
		add(lblTyp);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(10, 36, 96, 14);
		add(lblNewLabel_2);

	
		lblName.setBounds(71, 36, 96, 14);
		add(lblName);

		JLabel lblKosten = new JLabel("Kosten");
		lblKosten.setBounds(10, 61, 96, 14);
		add(lblKosten);

		
		kosten.setBounds(71, 61, 96, 14);
		add(kosten);

	}

	public void setTyp(String typ) {
		this.lblTyp.setText(typ);
	}
	
	public void setName(String name) {
		this.lblName.setText(name);
	}
	
	public void setKosten(double kosten) {
	this.kosten.setText(Double.toString(kosten));
	}
	
	
}