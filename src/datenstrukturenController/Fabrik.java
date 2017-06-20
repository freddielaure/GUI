package datenstrukturenController;

import java.util.ArrayList;

public class Fabrik {
    Warenspeicher warenspeicher;
	private double guthaben;
	private double testguthaben=0;
	protected String name;
	ArrayList<Maschine> maschinen;
	static int anzanl;
	private double price_All_Maschine;

	public Fabrik(double guthaben, String name) { 
		warenspeicher = new Warenspeicher();
		this.testguthaben = guthaben;
		this.name = name;
		this.maschinen = new ArrayList<Maschine>();
	}

	public Warenspeicher getWarenspeicher() {
		return warenspeicher;
	}

	public double getTestguthaben() {
		return testguthaben;
	}
	
	public double getGuthaben() {
		return guthaben;
	}
	
	
	public String getName() {
		return name;
	}

	public void fuegeMaschineHinzu(Maschine maschine) {
		maschine.setFabrik(this);
		maschinen.add(maschine);
		/*
		 * EineMaschinewirdgekauft. 
		 * Reduzieren Sie hier zusätzlich das Testguthaben
		 *  um die Kosten der übergebenen Maschine.
		 */
		for(int i=0; i< maschinen.size();i++){
		testguthaben = testguthaben - maschinen.get(i).getKosten();
		
		}
	
		
		// System.out.println(maschine.getName()+ "hat die Arbeit genommen");

	}

	public int anzahlMachine(String machineName) {
		int anzahlMachine = 0;
		for (int i = 0; i < this.maschinen.size(); i++) {
			if (this.maschinen.get(i).getName().equals(machineName)) {
				anzahlMachine++;
			}
		}
		return anzahlMachine;
	}
	
	
	
	
	
	
	
	

	public int zaehleMachine(String name) {
		int anzahlMachine = 0;
		for (int i = 0; i < this.maschinen.size(); i++) {
			if (this.maschinen.get(i).getName().equals(name)) {
				anzahlMachine++;
			}
		}
		return anzahlMachine;
	}

	
	
	

	public int getAnzanl() {
		return maschinen.size();
	}

	public double getprice_All_Maschine() {

		for (int i = 0; i < maschinen.size(); i++) {
			price_All_Maschine = maschinen.get(i).getKosten() + price_All_Maschine;
		}
		return price_All_Maschine;
	}

	public boolean entferneMaschine(int index) {

		boolean wert1 = false;
		/* Eine Maschine wird verkauft. Erhöhen Sie das
		Testguthaben um die Kosten der Maschine, 
		bevor Sie diese entfernen.
		*/
		for (int i = 0; i < maschinen.size(); i++) {
			 testguthaben += maschinen.get(i).getKosten();
		}
		
		try {

			maschinen.remove(index);
			wert1 = true;

		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		return wert1;
	}
	
	
	
	

	public double testguthabenReduzieren(double kosten) {
		return Math.abs(kosten - this.testguthaben);

	}

	public double firmaTesten(int rundenanzahl) {
		 //testguthaben = guthaben ;
		 double erloes=0.0;
		 //testguthaben = guthaben - getprice_All_Maschine();
		for (int i = 0; i < rundenanzahl; i++) {
			maschinen.get(i).maschineStarten();
		}
		erloes += warenspeicher.warenVerkaufen();
		return testguthaben +=erloes;
	}
/*	
 * 
 * 
 * ---------------------------------PRAKTIKUMSAUFGABE II ERWEITERUNG------------------------------------------------
 * 
 * 
 * 
 * 
 */
  //Getter-MethodefürdieArrayListderMaschinen.
	public ArrayList<Maschine> getMaschinen() {
		return this.maschinen;
	}

	/*
	 * Diese Methode setzt den Wert des Testguthabens auf den Wert
des Firmenguthabens zurück und entfernt alle Maschinen aus der ArrayList.
	 */
	public void resetFabrik(){
		testguthaben = guthaben;
		this.maschinen.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
