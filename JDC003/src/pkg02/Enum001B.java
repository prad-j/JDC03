package pkg02;

public enum Enum001B {
	Phy("80","20"),
	Che("80", "20"),
	Math("100", "NA"),
	Ele("100", "100"),
	Eng("96","NA");
	
	private final String theory;
	private final String practicle;
	
	Enum001B(String theoryp, String practm){
		theory=theoryp;
		practicle=practm;
	}
	public String getTheory(){
		return theory;
	}
	public String getPracticle(){
		return practicle;
	}
}
