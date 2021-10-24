package ocp;

public class Pacient {

	private String name;
	private int age;
	private boolean isAlergic;

	public Pacient(String name, int age, boolean isAlergic) {
		this.name = name;
		this.age = age;
		this.isAlergic = isAlergic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAlergic() {
		return isAlergic;
	}

	public void setAlergic(boolean isAlergic) {
		this.isAlergic = isAlergic;
	}

}
