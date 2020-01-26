package pkg02;

public class Cdesc001A {
	public static void main(String args[]){
		for(Cdesc001B people: Cdesc001B.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getPro(), people.getYears());
		}
	}
}
