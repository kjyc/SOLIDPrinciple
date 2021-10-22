package ocp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	private Map<CardioVascularSymptom, Integer> cardios = new HashMap<>();
	private Map<NeuroMuscularSymptom, Integer> neuros = new HashMap<>();
	private Map<RespiratorySymptom, Integer> respirs = new HashMap<>();

	public Covid19Pacient(String name, int age, boolean isAlergic) {
		super(name, age, isAlergic);
	}

	public Map<CardioVascularSymptom, Integer> getCardios() {
		return cardios;
	}

	public void setCardios(Map<CardioVascularSymptom, Integer> cardios) {
		this.cardios = cardios;
	}

	public Map<NeuroMuscularSymptom, Integer> getNeuros() {
		return neuros;
	}

	public void setNeuros(Map<NeuroMuscularSymptom, Integer> neuros) {
		this.neuros = neuros;
	}

	public Map<RespiratorySymptom, Integer> getRespirs() {
		return respirs;
	}

	public void setRespirs(Map<RespiratorySymptom, Integer> respirs) {
		this.respirs = respirs;
	}

	public void addCardioSymptom(CardioVascularSymptom c, Integer weight) {
		cardios.put(c, weight);
	}

	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer weight) {
		neuros.put(nm, weight);
	}

	public void addRespiratorySymptom(RespiratorySymptom r, Integer weight) {
		respirs.put(r, weight);
	}

	public double covid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
		// calculate afection
		for (CardioVascularSymptom c : cardios.keySet())
			afection = afection + c.getSeverityIndex() * cardios.get(c);
		for (NeuroMuscularSymptom c : neuros.keySet())
			afection = afection + c.getSeverityIndex() * neuros.get(c);
		for (RespiratorySymptom c : respirs.keySet())
			afection = afection + c.getSeverityIndex() * respirs.get(c);
		afection = afection / (cardios.size() + neuros.size() + respirs.size());
		// calculate increment
		if (getAge() > 65)
			increment = afection * 0.5;
		// calculate impact
		impact = afection + increment;
		return impact;
	}
}
