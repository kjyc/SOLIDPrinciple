package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	private Map<Symptom, Integer> symptoms = new HashMap<>();

	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);
	}

	public Map<Symptom, Integer> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(Map<Symptom, Integer> symptoms) {
		this.symptoms = symptoms;
	}

	public void addSymptom(Symptom c, Integer weight) {
		symptoms.put(c, weight);
	}

	public double covid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;

		for (Symptom c : symptoms.keySet()) {
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

		for (Symptom c : symptoms.keySet()) {
			if (c.getAffectedDays() > days) {
				days = c.getAffectedDays();
			}
		}

		return days;
	}

}
