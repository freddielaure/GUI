package DatenStrukturNewView;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datenstrukturenController.Fabrik;
import datenstrukturenController.Maschine;
import datenstrukturenController.Produkt;

import datenstrukturenController.test2;

import java.awt.Panel;

public class PanelManager extends JFrame {

	private JPanel contentPane;
	private ArrayList<Produkt> produktEntwuerfe;
	private ArrayList<Maschine> maschinenEntwuerfe;
	private Fabrik fabrik;
	private InputPanelView inputPanel = new InputPanelView(this);

	public PanelManager(ArrayList<Produkt> produktEntwuerfe,	 ArrayList<Maschine> maschinenEntwuerfe) {

	    //produktEntwuerfe = new ArrayList<Produkt>();
		//maschinenEntwuerfe = new ArrayList<Maschine>();
		this.produktEntwuerfe=produktEntwuerfe;
		this.maschinenEntwuerfe=maschinenEntwuerfe;
		start();

		/**
		 * Create the frame.
		 */

	}

	/**
	 * JFrame application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PanelManager();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	

	public void addOrReplaceProduktentwurf(Produkt produkt) {
		
		//produktEntwuerfe.add(produkt);
		for (int i = 0; i < this.produktEntwuerfe.size(); i++) {
			if (produktEntwuerfe.get(i).getName().equals(produkt.getName())){
		
		produktEntwuerfe.set(i, produkt);
		//produktEntwuerfe.remove(produkt);
		//produktEntwuerfe.add(produkt);
		System.out.println(produktEntwuerfe.size());
		break;
		
			} else {
				produktEntwuerfe.add(produkt);
				System.out.println(produktEntwuerfe.size());
				break;
			}
			
		}
		
		
		/*for (int i = 0; i < this.produktEntwuerfe.size(); i++) {
			if (produktEntwuerfe.get(i).getName().equals(produkt.getName())){
				
				produktEntwuerfe.remove( produkt.getName());
				System.out.println(produktEntwuerfe.size());
				break;
				
				
			} else {
				produktEntwuerfe.add(produkt);
				System.out.println(produktEntwuerfe.size());
				
				break;
			}
		}*/
		
	}
	
	public ArrayList<Produkt> getProduktEntwueft(){
		return this.produktEntwuerfe;
	}

	
	
	public void addOrReplaceMaschinenentwurf(Maschine maschine) {
		for (int i = 0; i < this.maschinenEntwuerfe.size(); i++) {
			if (maschinenEntwuerfe.get(i).getName().equals(maschine.getName())){
		
				maschinenEntwuerfe.set(i, maschine);
		//maschinenEntwuerfe.remove(maschine);
		//maschinenEntwuerfe.add(maschine);
		System.out.println(maschinenEntwuerfe.size());
		break;
		
			} else {
				maschinenEntwuerfe.add(maschine);
				System.out.println(produktEntwuerfe.size());
				break;
			}
	}
	}

	public ArrayList<Maschine> getMaschinenentwürfe() {
		return maschinenEntwuerfe;
	}

	public ArrayList<Produkt> getProduktentwürfe() {
		return produktEntwuerfe;
	}

	public void addMaschineToFabrik(int index) {
		fabrik.fuegeMaschineHinzu(maschinenEntwuerfe.get(index));
	}

	public void removeMaschineFromFabrik(int index) {
		fabrik.entferneMaschine(index);
	}

	public void resetFabrik() {
		fabrik.resetFabrik();
	}

	public ArrayList<Maschine> getAktiveMaschinen() {
		return fabrik.getMaschinen();
	}

	public double getTestguthaben() {
		return fabrik.getTestguthaben();

	}

	public void start() {

		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout(0, 0));
		inputPanel.setPreferredSize(new Dimension(500, 500));
		add(inputPanel, BorderLayout.WEST);
		inputPanel.updateData();
		}

	
	
	
	
	
}
