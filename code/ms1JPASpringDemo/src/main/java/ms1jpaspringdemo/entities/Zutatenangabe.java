package ms1jpaspringdemo.entities;

import javax.persistence.*;

@Embeddable
public class Zutatenangabe {
	private int menge;
	
	@ManyToOne
	private Zutat zutat;
	
	// Hier muss ein Default-Konstrukor hin, weil eine Zutatenangabe bevor der Zutat erstellt werden muss
	public Zutatenangabe() {};
	
	public Zutatenangabe(Zutat zutat, int menge) {
		this.zutat = zutat;
		this.menge = menge;
	}
	
	@Override
	public String toString() {
		return "Zutat: " + String.format("%-10s Anzahl: %-3d", zutat, menge);
	}
}
