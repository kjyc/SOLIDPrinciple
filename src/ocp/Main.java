package ocp;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient cp = new Covid19Pacient("Juan", 53, false);

		Symptom c = new CardioVascularSymptom("Dolor pecho", 34, 3, 5);
		Symptom r = new RespiratorySymptom("Silvido", 56, 5, 2);
		Symptom n = new NeuroMuscularSymptom("Dificultad Hablar", 78, 5, 10);

		cp.addSymptom(c, 3);
		cp.addSymptom(r, 2);
		cp.addSymptom(n, 3);

		System.out.println("El impacto del paciente Covid " + cp.getName() + " es " + cp.covid19Impact());
		System.out.println("El paciente se recuperará en: " + cp.sanatedDays() + " días.");
	}

}