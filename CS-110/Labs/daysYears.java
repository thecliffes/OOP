import java.util.Scanner;

public class daysYears {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("What is the month");
		int month = in.nextInt();
		
		
		System.out.println("What is the day"); //30 days: 4,6,9,11 31 days: 1,3,5,7,8,10,12
		int day = in.nextInt();
		
		System.out.println("What year is it?");
		int year = in.nextInt();
		boolean leap = false;
		
		if (year%4 == 0 && year%100 != 0){
				leap = true;
		}
		else if (year%400 == 0){
			leap = true;
		}
			
		
		if (month == 4){
			if(day <= 30 && day >= 0){
				System.out.println("valid");
			}
			else{
				System.out.print("invalid");
			}
		}
		else if(month ==6){
			if(day <= 30 && day >=0){
				System.out.println("valid");
			}
			else{
				System.out.print("invalid");
			}
		}
		else if(month == 9){
			if(day <= 30 && day >= 0){
				System.out.println("valid");
			}
			else{
				System.out.print("invalid");
			}
		}
		else if (month == 11){
			if(day <= 30 && day >= 0){
				System.out.println("valid");
			}
			else{
				System.out.print("invalid");
			}
		}
		
		
		
		else if (month == 2){
			if(day <= 28 && day >= 0){
				System.out.println("valid");
			}
			else if (day <= 29 && leap == true && day >= 0){
				System.out.println("valid");
			}
			else{
				System.out.print("invalid");
			}
		}
		
		
		else if(day <= 31 && month <= 12 && month >= 0 && day >= 0){
			System.out.println("valid");
		}
		
		else{
			System.out.println("invalid");
		}
		
		
	}
}