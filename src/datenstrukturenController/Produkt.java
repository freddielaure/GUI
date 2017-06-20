package datenstrukturenController;

public class Produkt {
	private double kosten;
	private String name;
	private double verkaufswert;

	public Produkt(double kosten, String name, double verkaufswert) {
		super();
		this.kosten = kosten;
		this.name = name;
		this.verkaufswert = verkaufswert;
	}

	public double getKosten() {
		return kosten;
	}

	public String getName() {
		return name;
	}

	public double getVerkaufswert() {
		return verkaufswert;
	}

}
