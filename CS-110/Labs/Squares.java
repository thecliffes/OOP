import java.util.Scanner;

public class Squares {
    String[] names = new String[10];
    int[] age = new int[10];
	boolean allBool = true;
	Scanner in = new Scanner(System.in);
	
	while(allBool){
		System.out.println("Enter a name");
		names[names.length] = String.nextString();
		allBool = false;
	}
	
	System.out.println(names[names.length]);
}