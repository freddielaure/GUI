package datenstrukturenController;

import java.util.ArrayList;

import DatenStrukturNewView.InputPanelView;
import DatenStrukturNewView.PanelManager;

public class ApplicationTest {

	public static void main(String[] args) {
		String name="";
		Produkt Apfel = new Produkt(200, "Apfel", 100);
		Produkt Orange = new Produkt(200, "Orange", 100);
		
		
		Fabrik f = new Fabrik(1000, "Fabrik1");
		Maschine Kaffee = new Maschine("Kaffee", 300, "Erzeuger");
		Erzeuger ApfelMaschine = new Erzeuger(" ApfelMaschine",200,Apfel, name);
	    //   Verwerter kaffeMaschine = new Verwerter("kaffeMaschine", 20,Orange,Apfel,2);
		
		
		
		Warenspeicher w = new Warenspeicher();
		//w.fuegeProduktHinzu(p);
		w.fuegeProduktHinzu(new Produkt(1, "Tomaten", 5));
		w.fuegeProduktHinzu(new Produkt(1, "Tomaten", 10));
		
	

		//System.out.println("Anzahl:" + w.anzahlImSpeicher("Pomme"));
		// System.out.println(w.anzahlImSpeicher("Tomaten"));

	//   w.entferneProdukt("Tomaten");
		
	// System.out.println("Anzahl Tomaten:" + w.anzahlImSpeicher("Tomaten"));


				 




		

		
		// System.out.println("Anzahl Tomaten:" + w.anzahlImSpeicher("Tomaten"));

		// w.fuegeProduktHinzu(new Produkt(100, "Pomme", 122));
		// w.fuegeProduktHinzu(new Produkt(100, "Pomme", 122));
		// w.fuegeProduktHinzu(new Produkt(100, "Pomme", 122));
		// System.out.println("Lösche alles Pommea
		// "+w.entferneProdukt("Pomme",3));

		// System.out.println("Lösche alles Pomme "+w.entferneProdukt("Pomme"));
		// System.out.println("Lösche alles Pomme "+w.entferneProdukt("Pomme"));

	//	System.out.println("verkauftwert: " + w.warenVerkaufen());
	
/*-------------------------------------------------------------------------------------------------------------------
 * ------------------------------------Aufgabe C---------------------------------------------------------------------
 * ------------------------------------------------------------------------------------------------------------------
 */
		
		
		//f.fuegeMaschineHinzu(ApfelMaschine);
	//	f.fuegeMaschineHinzu(kaffeMaschine);
		
		
		//System.out.println( " Wir haben " +  f.zaehleMachine( "Kaffeemaschine") +  f.getName() );
		
		
		
	//	System.out.println(  w.warenVerkaufen() );
		 
	//	 System.out.println(  "Anzahl:"+ w.anzahlProdukte());
		
		
		
		
		
		
		//System.out.println(f.getName() +" hat die Arbeit genommen");
		
		
	
		//System.out.println(f.getAnzanl());
	//	System.out.println("Anzahl:" +f.anzahlMachine("Kaffeemaschine"));
		
	//	System.out.println("Maschine wurde entfernt: "+f.entferneMaschine(3));
		//System.out.println("Anzahl:" +f.anzahlMachine("Kaffeemaschine"));
		
	//	System.out.println(f.getAnzanl());
		//System.out.println(f.testguthabenReduzieren(20));
		//System.out.println("Anzahl:" +f.anzahlMachine("Kaffeemaschine"));
		
		//System.out.println("Test:" + m.testguthabenReduzieren());

	
		
		
		
		//System.out.println(f.firmaTesten(3));
	  
		
	  
		 

      // f.fuegeMaschineHinzu(e);
	 //    e.produktErzeugen();

	//	e.maschineStarten();
	     
	
		 	
		 //	System.out.println("Gibts  genug Produkte? : " +v.checkAbhaengigkeit());
		 	
		 //	v.produktErzeugen();
		//    v.maschineStarten();
		 
		 
		 /*
		  * 
		  * 
		  * ---------------------------------PRAKTIKUMSAUFGABE II ERWEITERUNG------------------------------------------------
		  * 
		  */
		
		ArrayList<Produkt> produktEntwuerfe=new ArrayList<Produkt>();
		ArrayList<Maschine> maschinenEntwuerfe=new ArrayList<Maschine>();
		produktEntwuerfe.add(Apfel);
		maschinenEntwuerfe.add(Kaffee);
	
		
		PanelManager p = new PanelManager(produktEntwuerfe,maschinenEntwuerfe,f);
		
		//p.addOrReplaceProduktentwurf(Orange);
		
		
		
	}
	
}
