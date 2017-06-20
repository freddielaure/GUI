package datenstrukturenController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Warenspeicher {
	protected ArrayList<Produkt> produkte;

	public Warenspeicher() {
		this.produkte = new ArrayList<Produkt>();
	}

	public void fuegeProduktHinzu(Produkt produkt) {
		produkte.add(produkt);

	}

	public int anzahlImSpeicher(String gesuchtesProdukt) {
		int anzahlProdukte = 0;
		for (int i = 0; i < this.produkte.size(); i++) {
			if (this.produkte.get(i).getName().equals(gesuchtesProdukt)) {
				anzahlProdukte++;
			}
		}
		return anzahlProdukte;

	}
	
	public int anzahlProdukte() {
		int anzahlprodukt = 0;
		for (int i = 0; i < this.produkte.size(); i++) {
			
				anzahlprodukt++;
		}
		return anzahlprodukt;
	}
	
	

	public void entferneProdukt(String unerwuenschtesProdukt) {
		
		for (int i = 0; i < this.produkte.size(); i++) {
			if (this.produkte.get(i).getName().equals(unerwuenschtesProdukt)) {
				produkte.remove(i);
		System.out.println("Produkt wurde entfernt");
		          break;
		  
		}else {
			System.out.println("Produkt wurde nicht entfernt");
		}
			}
		
			}
		
	

	public void entferneProdukt(String unerwuenschtesProdukt, int anzahl) {

		int v = 0;
		v = anzahlImSpeicher(unerwuenschtesProdukt);
		if (v >= anzahl) {
			for(int j = 0;j < anzahl; j++)
				entferneProdukt(unerwuenschtesProdukt);
			
		} else {
			System.out.println("Sie haben einen Error");
		}
	}

	public double warenVerkaufen() {
		double verkaufswert = 0;
//		for(Produkt produkte: produkte){
//			verkaufswert += produkte.getVerkaufswert();
//		}
		for (int i = 0; i < this.produkte.size(); i++) {

			verkaufswert += produkte.get(i).getVerkaufswert();
		}
		this.produkte.clear();
		return verkaufswert;
	}

}
