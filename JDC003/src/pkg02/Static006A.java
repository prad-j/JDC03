package pkg02;

public class Static006A {
	public static void main(String args[]){
		Static006B obj = new Static006B("Sunil", "Gavaskar");
		Static006B obj1 = new Static006B("Sachin", "Tendulkar");
		Static006B obj2 = new Static006B("Dilip", "Vengasarkar");
		Static006B obj3 = new Static006B("Kapil", "Dev");
		Static006B obj4 = new Static006B("Ravi", "Shastri");
		Static006B obj5 = new Static006B("Saurav", "Ganguli");
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.println(obj1.getFname());
		System.out.println(obj1.getLname());
		System.out.println(obj1.getRollno());
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.println(obj3.getFname());
		System.out.println(obj3.getLname());
		System.out.println(obj3.getRollno());
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		System.out.println(Static006B.getRollno());
		
	}
}
