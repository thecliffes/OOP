public class BSTMain {
	public static void main(String[] args) {
		BST bt = new BST();
		Profile p = new Profile("cliffe", "ben",15,5,2002,"bencliffe1@gmail.com",null,null);
		Profile p1 = new Profile("cliffe1", "dave",16,6,3002,"1bencliffe1@gmail.com",null,null);
		Profile p2 = new Profile("cliffe2", "een",17,6,4002,"2bencliffe1@gmail.com",null,null);
		Profile p3 = new Profile("cliffe3", "gen",18,7,5002,"3bencliffe1@gmail.com",null,null);
		Profile p4 = new Profile("cliffe4", "fen",19,8,6002,"4bencliffe1@gmail.com",null,null);
		Profile p5 = new Profile("cliffe4", "aen",19,8,6002,"4bencliffe1@gmail.com",null,null);
		
		
		bt.addProfile(p);
		bt.addProfile(p1);
		bt.addProfile(p2);
		bt.addProfile(p3);
		bt.addProfile(p4);
		bt.addProfile(p5);
		

		bt.printAlphabeticalASC();
	}
}
