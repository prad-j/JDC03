package pkg02;

public enum Enum002B {
	Suresh("Jalgaon", "10"),
	Vijay("Vadodara", "15"),
	Mangesh("Pune", "5"),
	Rajendra("Mumbai", "12");
	
	private final String City;
	private final String Time;
	
	Enum002B(String place, String years){
		City=place;
		Time=years;
	}
	public String getCity(){
		return City;
	}
	public String getTime(){
		return Time;
	}
	
}
