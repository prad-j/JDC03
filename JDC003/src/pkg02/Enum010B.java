package pkg02;

public enum Enum010B {
	virat("Athlet", 29),
	Sandhu("Badminton", 25),
	Ranbir("Bollywood", 35),
	Narendra("Politics", 69);
	
	private final String prof;
	private final int age;
	
	Enum010B(String iProf, int iAge){
		prof = iProf;
		age = iAge;
	}
	public String getProf(){
		return prof;
	}
	public int getAge(){
		return age;
	}
}
