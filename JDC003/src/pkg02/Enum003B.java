package pkg02;

public enum Enum003B {
	Virat("Cricket", "30"),
	Sundar("Techie", "46"),
	Mukesh("Business","65");
	
	private final String prof;
	private final String age;
	
	Enum003B(String profession, String years){
		prof=profession;
		age=years;
	}
	public String getPro(){
		return prof;
	}
	public String getAge(){
		return age;
	}
}
