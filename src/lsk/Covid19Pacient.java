package lsk;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	private Map<Symptom, Integer> symptoms = new HashMap<>();
	private ImpactCalculator ic = new ImpactCalculator();

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
		return ic.calculateImpact(symptoms, getAge());
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

	public void showSymptoms() {
		for (Symptom s : symptoms.keySet())
			s.show();
	}

	public void cure() {
		for (Symptom s : symptoms.keySet())
			s.cure();
	}

}
