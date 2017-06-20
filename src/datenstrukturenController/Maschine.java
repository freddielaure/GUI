package datenstrukturenController;

public class Maschine {
	protected String name;
	protected double kosten;
	protected Fabrik fabrik = null;
	protected String typ; 

	public Maschine(String name, double kosten,String typ) {
		super();
		this.name = name;
		this.kosten = kosten;
		this.typ  = typ;
	}

	public String getName() {
		return name;
	}

	public double getKosten() {
		return kosten;
	}

	public void setFabrik(Fabrik fabrik) {
		this.fabrik = fabrik;
	}

	public Fabrik getFabrik() {
		return this.fabrik;
	}
	
	public String getTyp() {
		return typ;
	}


	public void maschineStarten() {

		System.out.println(this.name + " hat die Arbeit aufgenommen");
	}
}
