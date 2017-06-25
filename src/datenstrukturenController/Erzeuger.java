package datenstrukturenController;

public class Erzeuger extends Maschine {
	Produkt erzeugnis;
	public Erzeuger(String name, double kosten, Produkt erzeugnis, String typ) {
		super(name, kosten,typ);
		this.erzeugnis =erzeugnis;
		
	}

	public void produktErzeugen() {
	
		if (fabrik.getGuthaben() > erzeugnis.getKosten()) {
			fabrik.getWarenspeicher().fuegeProduktHinzu(erzeugnis);
			fabrik.testguthabenReduzieren(erzeugnis.getKosten());
			System.out.println(erzeugnis.getName() + " wurde erfolgreich erzeugt.");
			System.out.println( "Es sind jetzt " + getFabrik().getWarenspeicher().anzahlProdukte() + " Produkten im Warenspeicher");

		  
		} else {
			System.out.println(erzeugnis.getName() + " konnte aufgrund fehlenden Guthabens nicht erzeugt werden.");
		}
	}

	@Override
	public void maschineStarten() {
		super.maschineStarten();
		produktErzeugen();
	}

	public Produkt getErzeugnis() {
		return erzeugnis;
	}

	
	
	
}
