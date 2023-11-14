import java.util.Scanner;

public class timeCalc {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("What time is it");
		int hour = in.nextInt();
		
		if (hour >= 5 && hour <= 11){
			System.out.println("It is morning");
		}
		else if(hour >= 12 && hour <= 18){
			System.out.println("It is the afternoon");
		}
		
		else{
			System.out.println("It is night");
		}
		
	}
}