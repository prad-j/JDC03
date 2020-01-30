package pkg02;

public enum Enum013B {
	Vijay("Vadodara", 46),
	Suresh("Jalgaon", 47),
	Amol("Pune", 44),
	Anil("Delhi", 48),
	Snagram("Erandol", 42),
	Kamlesh("Amadabad", 46),
	Vinay("Chennai", 40);
	
	public final String place;
	public final int age;
	
	Enum013B(String iPlace, int iAge){
		place=iPlace;
		age=iAge;
	}
	public String getPlace(){
		return place;
	}
	public int getAge(){
		return age;
	}
}
