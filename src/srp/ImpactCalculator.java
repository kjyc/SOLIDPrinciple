package srp;

import java.util.Map;

public class ImpactCalculator {

	private AfectionCalculator ac = new AfectionCalculator();
	private IncrementCalculator ic = new IncrementCalculator();

	public double calculateImpact(Map<ISymptom, Integer> symptoms, int age) {
		double impact;

		if (age < 10) {
			impact = 0;
		} else {
			double afection = ac.calculateAfection(symptoms);
			double increment = ic.calculateIncrement(age, afection);
			impact = afection + increment;
		}

		return impact;
	}

}
