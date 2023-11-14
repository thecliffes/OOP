import java.util.Scanner;

public class richter {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("What magnitude was felt");
		double magnitude = in.nextDouble();
		
		if(magnitude <= 1.9){
			System.out.println("It is barely felt");
		}
		else if (magnitude <= 2.9 && magnitude >= 2.0){
			System.out.println("Felt by some people");
		}
		else if (magnitude <= 3.9 && magnitude >=3.0){
			System.out.println("Often felt by people");
		}
		else{
			System.out.println("Noticable shaking");
		}
			
	}
}