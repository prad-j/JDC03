package pkg02;

public class ArrayStrTble001 {
	public static void main(String args[]){
		System.out.println("RollNo\tName");
		
		String name[]={"Sam","Peter","Maggi","Lucy","Stella"};
		
		for(int counter=0;counter<name.length;counter++){
			System.out.println(""+counter+"\t"+name[counter]);
		}
		
	}

}
