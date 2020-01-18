package pkg02;

public class TimeDisplay003B {
	private int hr;
	private int mn;
	private int sc;
	
	public void stm(int h, int m, int s){
		hr=((h>=0 && h<24)? h : 0);
		mn=((m>=0 && mn<60)? h : 0);
		sc=((s>=0 && s<60)? m : 0);
	}
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hr, mn, sc);
	}
}
