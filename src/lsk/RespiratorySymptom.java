package lsk;

public class RespiratorySymptom extends Symptom {

	public RespiratorySymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
		icure = new IsCurable();
	}

}