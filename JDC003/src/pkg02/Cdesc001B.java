package pkg02;

public enum Cdesc001B {
	Virat("Athlet", "31"),
	Sundar("Techie", "46"),
	Narendra("Politics", "69"),
	Ranbir("Acting", "36");
	
	private final String prof;
	private final String age;
	
	Cdesc001B (String pro, String years){
		prof=pro;
		age=years;
	}
	public String getPro(){
		return prof;
	}
	public String getYears(){
		return age;
	}

}
