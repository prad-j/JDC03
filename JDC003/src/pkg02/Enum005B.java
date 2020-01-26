package pkg02;

public enum Enum005B {
	Mangesh("Dhule", 31, "Married"),
	Suresh("Jalgaon", 35, "Married"),
	Sandesh("Mumbai", 33, "Unmarried");
	
	private final String place;
	private final int age;
	private final String mStatus;
	
	Enum005B(String tPlace, int tAge, String tStatus){
		place=tPlace;
		age=tAge;
		mStatus=tStatus;
	}
	public String getPlace(){
		return place;
	}
	public int getAge(){
		return age;
	}
	public String getMS(){
		return mStatus;
	}
}
