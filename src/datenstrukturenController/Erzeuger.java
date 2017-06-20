package datenstrukturenController;

public class Erzeuger extends Maschine {
	Produkt erzeugnis;
	public Erzeuger(String name, double kosten, Produkt erzeugnis,String typ) {
		super(name, kosten,typ);
		this.erzeugnis =erzeugnis;
		this.typ= typ;
	}

	public void produktErzeugen() {
	
		if (fabrik.getGuthaben() > erzeugnis.getKosten()) {
			fabrik.getWarenspeicher().fuegeProduktHinzu(erzeugnis);
			System.out.println(fabrik.getName() + " wurde erfolgreich erzeugt.");
			System.out.println( "Es sind jetzt " + getFabrik().getWarenspeicher().anzahlProdukte() + " Produkten im Warenspeicher");

		  
		} else {
			System.out.println(fabrik.getName() + " konnte aufgrund fehlenden Guthabens nicht erzeugt werden.");
		}
	}

	@Override
	public void maschineStarten() {
		super.maschineStarten();
		System.out.println(this.name + " wurde produziert");
	}

	public Produkt getErzeugnis() {
		return erzeugnis;
	}

	
	
	
}
