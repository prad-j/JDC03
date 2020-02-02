package pkg02;

public class Final001B {
	private int sum=0;
	private final int NUM;
	
	public Final001B(int x){
		NUM=x;
	}
	public void add(){
		sum+=NUM;
	}
	public String toString(){
		return String.format("Sum = %s\n", sum);
	}
}
