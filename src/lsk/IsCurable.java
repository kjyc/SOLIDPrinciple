package lsk;

public class IsCurable implements ICure {

	public void cure(int affectedDays) {
		System.out.println("treatment applied to: " + affectedDays + " days");
	}

}
