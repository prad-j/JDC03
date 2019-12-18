package pkg02;

public class ConstructB002 {
	private String crplay;
	
	public ConstructB002(String name){
		crplay=name;
	}	
	public String plname(){
		return crplay;
	}
	public void say(){
		System.out.println(plname()+" is my favorit cricketer.");
	}
}
