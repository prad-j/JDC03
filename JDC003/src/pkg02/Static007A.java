package pkg02;

public class Static007A {
	public static void main(String args[]){
		Static007B obj = new Static007B("Sachin", "Tendulkar");
		Static007B obj1 = new Static007B("Sunil", "Gavaskar");
		Static007B obj2 = new Static007B("Mahendra Singh", "Dhoni");
		Static007B obj3 = new Static007B("Viarat", "Kohli");
		
		System.out.println("-----------------------------");
		System.out.println(obj1.getFName());
		System.out.println(obj1.getLName());
		System.out.println(obj1.getMembers());
		
		System.out.println("-----------------------------");
		
		System.out.println(Static007B.getMembers());
	}
}
