package DatenStrukturNewView;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Itempanel3 extends JPanel {
	JLabel lbTypName = new JLabel("Name:");
	JLabel lblTyp = new JLabel();
	JLabel lblAnzahl = new JLabel("Anzahl:");
	JLabel lblOuputAnhazl = new JLabel();
	JLabel lblVerkauftwert = new JLabel();
	JLabel lblherstellungskosten = new JLabel();

	public Itempanel3() {
		setLayout(null);
		lbTypName.setBounds(10, 11, 40, 14);
		add(lbTypName);
		lblTyp.setBounds(71, 11, 116, 14);
		add(lblTyp);
		
		
		lblAnzahl.setBounds(10, 75, 96, 22);
		add(lblAnzahl);
		
		lblOuputAnhazl.setBounds(67, 75, 100, 22);
		add(lblOuputAnhazl);


		JLabel lblLabel1 = new JLabel("Hkosten:");
		lblLabel1.setBounds(10, 36, 70, 14);
		add(lblLabel1);
		
		lblherstellungskosten.setBounds(96, 36, 96, 14);
		add(lblherstellungskosten);


	
		lblVerkauftwert.setBounds(100, 61, 96, 14);
		add(lblVerkauftwert);

		JLabel lblLabel2 = new JLabel("Verkauftwert:");
		lblLabel2.setBounds(10, 61, 96, 14);
		add(lblLabel2);
		
		
	}

	public void setTyp(String typ) {
		this.lblTyp.setText(typ);
	}
	
	public void setName(String name) {
		this.lblTyp.setText(name);
	}
	
	public void setHerstellungskosten(double lblherstellungskosten) {
	this.lblherstellungskosten.setText(Double.toString(lblherstellungskosten));
	}
	
	public void setVerkauftwert(double lblVerkauftwert) {
		this.lblVerkauftwert.setText(Double.toString(lblVerkauftwert));
		}
	
	public void setlblOuputAnzahl(double lblOuputAnhazl) {
		this.lblOuputAnhazl.setText(Double.toString(lblOuputAnhazl));
		}
	
	
	
	
}