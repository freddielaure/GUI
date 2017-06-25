package datenstrukturenController;

public class Verwerter extends Erzeuger {
	Produkt abhaengigkeit;
	int anzahl =0;
	
	public Verwerter(String name, double kosten, Produkt abhaengigkeit,Produkt erzeugnis,int anzahl, String typ){
		super(name,kosten,erzeugnis,typ);
		this.abhaengigkeit =abhaengigkeit;
		this.name=name;
		this.kosten=kosten;
		this.anzahl=anzahl;
		this.erzeugnis=erzeugnis;

	}

	public  boolean checkAbhaengigkeit(){
	   return (fabrik.getWarenspeicher().anzahlImSpeicher(abhaengigkeit.getName())> anzahl );
	}
	
	 public void produktErzeugen(){

		  if(checkAbhaengigkeit()==true){
			  super.produktErzeugen();
			  fabrik.warenspeicher.entferneProdukt(abhaengigkeit.getName(), anzahl);
		  }else{
			  System.out.println("Guthabens reicht nicht aus ");
		  }
	
 	
	 }
	 
	 public Produkt getAbhaengigkeit() {
			return abhaengigkeit;
		}

	 public int getAnzahl() {
			return anzahl;
		}

	 
	 
}
