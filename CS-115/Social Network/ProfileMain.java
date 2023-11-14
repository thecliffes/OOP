public class ProfileMain {
	public static void main(String[] args) {
		Profile p = new Profile("cliffe", "ben",15,5,2002,"bencliffe1@gmail.com",null,null);
		
		Profile p1 = new Profile("cliffe", "nen",15,5,2002,"bencliffe1@gmail.com",null,null);
		Profile p2 = new Profile("cliffe", "den",15,5,2002,"bencliffe1@gmail.com",null,null);
		Profile p3 = new Profile("cliffe", "fen",15,5,2002,"bencliffe1@gmail.com",null,null);
		Profile p4 = new Profile("cliffe", "gen",15,5,2002,"bencliffe1@gmail.com",null,null);
		
		p.insertFriend(p1);
		p.insertFriend(p2);
		p.insertFriend(p3);
		p.insertFriend(p4);
		System.out.println(p.getFriend(0));
		System.out.println(p.getFriend(1));
		System.out.println(p.getFriend(2));
		System.out.println(p.getFriend(3));
		System.out.println(p.numOfFriends());
	}
}
