package org.hbrs.se1.ws24.exercises.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2024"; // Default-Wert
	private String[] correctOutput = {
			"eins",
			"zwei",
			"drei",
			"vier",
			"fünf",
			"sechs",
			"sieben",
			"acht",
			"neun",
			"zehn"
	};

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		// Eingaben 1 - 10 liefern korrekten Ergebnisse
		if (number < 1 || number > 10) {
			return "Übersetzung der Zahl " +
					number +
					" nicht möglich (Translator Version " + version + ")";
		}
		return correctOutput[number - 1];
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
	 * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
