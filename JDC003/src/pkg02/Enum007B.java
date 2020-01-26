package pkg02;

public enum Enum007B {
	Virat("Cricket", 31),
	Mary("Boxing", 37),
	Bhutia("Football", 36),
	Sandhu("Badmenton", 25),
	Manjit("Hocky", 37),
	Sarena("Tennis", 34);
	
	private final String sport;
	private final int age;
	
	Enum007B(String iSport, int iAge){
		sport=iSport;
		age=iAge;
	}
	public String getSport(){
		return sport;
	}
	public int getAge(){
		return age;
	}
}
