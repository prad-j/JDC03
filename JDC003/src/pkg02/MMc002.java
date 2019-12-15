package pkg02;

public class MMc002 {
	private String car;
	
	public void setCar(String cname){
		car=cname;
	}
	
	public String fcnm(){
		return car;
	}
	
	public void say(){
		System.out.println("The first car i drove "+ fcnm());
	}
	
}
