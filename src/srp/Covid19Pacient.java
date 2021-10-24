package srp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	private Map<ISymptom, Integer> symptoms = new HashMap<>();
	private ImpactCalculator ic = new ImpactCalculator();

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
		return ic.calculateImpact(symptoms, getAge());
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
