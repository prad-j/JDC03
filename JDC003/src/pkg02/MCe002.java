package pkg02;

public class MCe002 {
	private String cname;
	public void nms(String nm){
		cname=nm;
	}
	public String nmcar(){
		return cname;
	}
	public void saying(){
		System.out.printf("The car you owned is %s", nmcar());
	}
}
