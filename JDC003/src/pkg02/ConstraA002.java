package pkg02;

public class ConstraA002 {
	private String cname;
	
	public ConstraA002(String cnm){
		cname=cnm;
	}
	
	public String getName(){
		return cname;
	}
	
	public void say(){
		System.out.println("ur car name is "+getName());
	}

}
