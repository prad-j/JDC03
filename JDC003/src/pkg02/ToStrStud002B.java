package pkg02;

public class ToStrStud002B {
	int rollno;  
	 String name;  
	 String city;  
	  
	 ToStrStud002B(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }
	 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
	 }
}
