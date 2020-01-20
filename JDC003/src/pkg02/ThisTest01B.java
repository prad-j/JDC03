package pkg02;

public class ThisTest01B {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int hour, int minute, int second){
		this.hour=5;
		this.minute=6;
		this.second=7;
	}
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
