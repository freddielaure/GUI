package datenstrukturenController;

public class Verwerter extends Erzeuger {
	Produkt abhaengigkeit;
	int anzahl =0;
	
	public Verwerter(String name, double kosten, Produkt abhaengigkeit,Produkt erzeugnis,int anzahl,String typ){
		super(name,kosten,erzeugnis,typ);
		this.abhaengigkeit =abhaengigkeit;
		this.name=name;
		this.kosten=kosten;
		this.anzahl=anzahl;
		this.erzeugnis=erzeugnis;

	}

	public  boolean checkAbhaengigkeit(){
	    boolean wert =false;
	
		  if(this.anzahl<fabrik.warenspeicher.anzahlImSpeicher(abhaengigkeit.getName())){
			  wert = true;
		  
	  }
	  System.out.println("Es sind genau "+ fabrik.warenspeicher.anzahlProdukte() + " Produkte vorhanden");
	return wert;
	  
	}
	
	 public void produktErzeugen(){
		 super. produktErzeugen();
		 super.maschineStarten();
		  if(checkAbhaengigkeit());
		System.out.println(this.name + " wurde produziert");
 	
	 }
	 
	 public Produkt getAbhaengigkeit() {
			return abhaengigkeit;
		}

	 public int getAnzahl() {
			return anzahl;
		}

	 
	 
}
