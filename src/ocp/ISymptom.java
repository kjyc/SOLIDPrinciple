package ocp;

public interface ISymptom {

	String getName();

	void setName(String name);

	int getCovidImpact();

	void setCovidImpact(int covidImpact);

	int getSeverityIndex();

	void setSeverityIndex(int severityIndex);

	int getAffectedDays();

	void setAffectedDays(int affectedDays);

}
