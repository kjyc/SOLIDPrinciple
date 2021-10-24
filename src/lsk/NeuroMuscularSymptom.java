package lsk;

public class NeuroMuscularSymptom extends Symptom {

	public NeuroMuscularSymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
		icure = new IsCurable();
	}

}