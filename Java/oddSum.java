import java.util.Scanner;

public class oddSum {
	public static void main(String[] args){
		int oddSumMax = 2;
		Scanner in = new Scanner(System.in);
		while((oddSumMax % 2) == 0){
			System.out.println("What number should it go up to?");
			oddSumMax = in.nextInt();
		}
		
		int i=1;
		int total=0;
		while (i != oddSumMax){
			i = i + 2;
			total = i + total;
		}
		System.out.println(total + 1);
	}
}
