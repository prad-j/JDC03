package pkg02;

public class Enum005A {
	public static void main(String args[]){
		for(Enum005B infos: Enum005B.values()){
			System.out.printf("%s\t%s\t%02d\t%s\n", infos, infos.getPlace(), infos.getAge(), infos.getMS());
		}
	}
}
