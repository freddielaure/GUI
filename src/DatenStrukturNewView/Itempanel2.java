package DatenStrukturNewView;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Itempanel2 extends JPanel {
	JLabel lbTypName = new JLabel("Name:");
	JLabel lblTyp1 = new JLabel();
	JLabel lblLabel2 = new JLabel();
	JLabel lblherstellungskosten = new JLabel();

	public Itempanel2() {
		setLayout(null);
		lbTypName.setBounds(10, 11, 70, 14);
		add(lbTypName);
		
		lblTyp1.setBounds(116, 11, 183, 14);
		add(lblTyp1);

		JLabel lbllabel = new JLabel("HKosten:");
		lbllabel.setBounds(10, 36, 66, 14);
		add(lbllabel);
		
		lblherstellungskosten.setBounds(116, 36, 66, 14);
		add(lblherstellungskosten);
		

	
		lblLabel2.setBounds(116, 61, 96, 14);
		add(lblLabel2);

		JLabel lblVerkauftwert = new JLabel("Verkauftwert:");
		lblVerkauftwert.setBounds(10, 61, 96, 14);
		add(lblVerkauftwert);

		
		
		
		

	}

	
	
	public void setName(String name) {
		this.lblTyp1.setText(name);
	}
	
	public void setHerstellungskosten(double lblherstellungskosten) {
	this.lblherstellungskosten.setText(Double.toString(lblherstellungskosten));
	}
	
	public void setVerkauftwert(double lblVerkauftwert) {
		this.lblLabel2.setText(Double.toString(lblVerkauftwert));
		}
	
	
	
}