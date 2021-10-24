package lsk;

public class Symptom {

	protected String name;
	protected int covidImpact;
	protected int severityIndex;
	protected int affectedDays;
	protected ICure icure;
	
	public Symptom(String name, int covidImpact, int severityIndex, int affectedDays) {
		this.name = name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = affectedDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}

	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public int getAffectedDays() {
		return affectedDays;
	}

	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}

	public void show() {
		System.out.println(
				"Symptom value: " + name + " SeverityIndex: " + severityIndex + " CovidImpact: " + covidImpact);
	}

	public void cure() {
		icure.cure(affectedDays);
	}

}
