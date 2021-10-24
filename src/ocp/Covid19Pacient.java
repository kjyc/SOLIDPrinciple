package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	private Map<ISymptom, Integer> symptoms = new HashMap<>();

	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);
	}

	public Map<ISymptom, Integer> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(Map<ISymptom, Integer> symptoms) {
		this.symptoms = symptoms;
	}

	public void addSymptom(ISymptom c, Integer weight) {
		symptoms.put(c, weight);
	}

	public double covid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;

		for (ISymptom c : symptoms.keySet()) {
			afection = afection + c.getSeverityIndex() * symptoms.get(c);
		}
		afection = afection / symptoms.size();

		if (getAge() > 65) {
			increment = afection * 0.5;
		}

		impact = afection + increment;

		return impact;
	}

	public int sanatedDays() {
		int days = 0;

		for (ISymptom c : symptoms.keySet()) {
			if (c.getAffectedDays() > days) {
				days = c.getAffectedDays();
			}
		}

		return days;
	}

}
