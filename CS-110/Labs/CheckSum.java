import java.util.Scanner;

public class CheckSum {
	static String str;
	public static void main(String[] args){
		input();
		process();
	}
	
	public static void input() { //takes string input
		Scanner Str = new Scanner(System.in);
		System.out.println("What is the string to be computed");
		str = Str.nextLine();
	}
	
	public static void process() {
		long k = 7;
		long checksum=0; 
		for (int i = 0; i < str.length(); i++) {
			k = k * 23;
			k +=  str.charAt(i);
			k = k * 13;
			k = k % 1000000009;
		}
		System.out.println(k);
		
	}
}
