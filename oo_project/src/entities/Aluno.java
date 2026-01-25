package entities;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double sumNote() {
		return n1+n2+n3;
	}
	public String passOrNot() {
		if (sumNote() >= 60.0) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}
	
	public double miss() {
		if (sumNote() < 60.0) {
			return 60.0 - sumNote();
		} else {
			return 0.0;
		}
	}
}
