package lsk;

public class ShowOnlySymptom extends Symptom {

	public ShowOnlySymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
		icure = new IsNotCurable();
	}

}