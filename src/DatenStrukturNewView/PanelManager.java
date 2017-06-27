package DatenStrukturNewView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import datenstrukturenController.Fabrik;
import datenstrukturenController.Maschine;
import datenstrukturenController.Produkt;
import datenstrukturenController.Verwerter;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class PanelManager extends JFrame {

	private JPanel contentPane;
	private JPanel jPanelList = new JPanel();
	private JPanel title = new JPanel();
	private ArrayList<Produkt> produktEntwuerfe;
	private ArrayList<Maschine> maschinenEntwuerfe;
	private Fabrik fabrik;
	private InputPanelView inputPanel = new InputPanelView(this);
	private MaschinenPanel machinePanel = new MaschinenPanel(this);
	public AuswahlPanel  auswahlPanel  = new AuswahlPanel (this);
	 JButton labelAll =new JButton("bbbbbbbb");

	public PanelManager(ArrayList<Produkt> produktEntwuerfe, ArrayList<Maschine> maschinenEntwuerfe, Fabrik fabrik) {

		// produktEntwuerfe = new ArrayList<Produkt>();
		// maschinenEntwuerfe = new ArrayList<Maschine>();
		this.produktEntwuerfe = produktEntwuerfe;
		this.maschinenEntwuerfe = maschinenEntwuerfe;
		this.auswahlPanel =auswahlPanel;
		this.fabrik = fabrik;
		start();

		/**
		 * Create the frame.
		 */

	}

	/**
	 * JFrame application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { new PanelManager(); } catch
	 * (Exception e) { e.printStackTrace(); } } }); }
	 */

	public ArrayList<Produkt> getProduktentwürfe() {
		return produktEntwuerfe;
	}

	public void addOrReplaceProduktentwurf(Produkt produkt) {

		for (int i = 0; i < this.produktEntwuerfe.size(); i++) {
			if (produktEntwuerfe.get(i).getName().equals(produkt.getName())) {

				produktEntwuerfe.set(i, produkt);
				// produktEntwuerfe.remove(produkt);
				// produktEntwuerfe.add(produkt);

				System.out.println("set " + produktEntwuerfe.size());

				return;

			}

		}
		produktEntwuerfe.add(produkt);

		System.out.println("add " + produktEntwuerfe.size());

		/*
		 * for (int i = 0; i < this.produktEntwuerfe.size(); i++) { if
		 * (produktEntwuerfe.get(i).getName().equals(produkt.getName())){
		 * 
		 * produktEntwuerfe.remove( produkt.getName());
		 * System.out.println(produktEntwuerfe.size()); break;
		 * 
		 * 
		 * } else { produktEntwuerfe.add(produkt);
		 * System.out.println(produktEntwuerfe.size());
		 * 
		 * break; } }
		 */

	}

	public ArrayList<Produkt> getProduktEntwueft() {
		return this.produktEntwuerfe;
	}

	public void addOrReplaceMaschinenentwurf(Maschine maschine) {
		for (int i = 0; i < this.maschinenEntwuerfe.size(); i++) {
			if (maschinenEntwuerfe.get(i).getName().equals(maschine.getName())) {
				maschinenEntwuerfe.set(i, maschine);
				System.out.println("set " + maschinenEntwuerfe.size());
				return;
			}
		}
		maschinenEntwuerfe.add(maschine);
		System.out.println("set " + maschinenEntwuerfe.size());
	}

	public ArrayList<Maschine> getMaschinenentwürfe() {
		return maschinenEntwuerfe;
	}
	
	

	public void addMaschineToFabrik(int index) {
		fabrik.fuegeMaschineHinzu(maschinenEntwuerfe.get(index));
		inputPanel.updateData();
	}

	public void removeMaschineFromFabrik(int index) {
		fabrik.entferneMaschine(index);
		inputPanel.updateData();
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
 
 
		setSize(1000, 600);
		setTitle("AI-Aufgabe2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		inputPanel.setPreferredSize(new Dimension(500, 500));
		getContentPane().add(inputPanel, BorderLayout.WEST);
		inputPanel.updateData();
		inputPanel.setCheckboxDisable();
		getContentPane().add(jPanelList, BorderLayout.CENTER);
		jPanelList.setLayout(new GridLayout(1, 0, 0, 0));
		// setJpanelToGrid();
		JFrame j = new JFrame();
        j.setSize(400, 600);
		j.setTitle("Ihre AuswahlListe");
		j.add(auswahlPanel);
		 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     j.setVisible(true);
		
       
        

		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		jPanelList.setLayout(gbl_panel_1);
		
		
		
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;

		jPanelList.add(labelAll, gbc_panel_2);
		
		
      JLabel label2=new JLabel("eeeeeebbb");
		
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.CENTER;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;

		jPanelList.add(label2, gbc_panel_3);
		
		
		
		
		JLabel label3=new JLabel("eeeerr");
				
				GridBagConstraints gbc_panel_4 = new GridBagConstraints();
				gbc_panel_4.fill = GridBagConstraints.FIRST_LINE_END;
				gbc_panel_4.gridx = 2;
				gbc_panel_4.gridy = 0;

				jPanelList.add(label3, gbc_panel_4);
		
		
				
				
	
	}
	
       

	public void setJpanelToGrid(MaschinenPanel machinePanel, int a, int b) {

		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = a;
		gbc_panel.gridy = b;

		jPanelList.add(machinePanel, gbc_panel);

		//
		// JButton btnNewButton_1 = new JButton("New button");
		// GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		// gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		// gbc_btnNewButton_1.gridx = 0;
		// gbc_btnNewButton_1.gridy = 0;
		// jPanelList.add(btnNewButton_1, gbc_btnNewButton_1);
		
	

	}
	
	
	
	
	

}
