package lsk;

public class CardioVascularSymptom extends Symptom {

	public CardioVascularSymptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		super(name, covidImpact, severityIndex, affectedDays);
		icure = new IsCurable();
	}

}