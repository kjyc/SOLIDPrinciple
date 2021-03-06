package lsk;

import java.util.Map;

public class AfectionCalculator {

	public double calculateAfection(Map<Symptom, Integer> symptoms) {
		double afection = 0;
		int elems = 1;

		for (Symptom s : symptoms.keySet()) {
			if (s.getCovidImpact() > 50) {
				afection = afection + s.getSeverityIndex() * symptoms.get(s);
				elems++;
			}
		}

		afection = afection / elems;

		return afection;
	}

}
