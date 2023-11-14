public class test {
	public static void main(String[] args){
		boolean a = true;
		boolean b = true;
		boolean c = false;
		System.out.println(true && c || (!a ^ b) && !c && 7 < 11);
	}
}