package pkg02;

public class Enum003A {
	public static void main(String args[]){
		for(Enum003B people: Enum003B.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getPro(), people.getAge());
		}
	}
}
