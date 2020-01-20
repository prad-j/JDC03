package pkg02;

public class TimeDisplay008B {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s){
		hour=((h >= 0 && h<24) ? h : 0);
		minute=((m >= 0&& m<60) ? m : 0);
		second=((s >= 0 && s<60) ? s : 0);
	}
	public String to24Hr(){
		return String.format("%s\n%02d:%02d:%02d", "24 Hour format display", hour, minute, second);
	}
	public String to12Hr(){
		return String.format("%s\n%02d:%02d:%02d %s", "12 Hour format display", ((hour==0||hour==12?hour:hour%12)), minute, second, (hour<12?"AM":"PM"));
	}
}
