import java.util.ArrayList;

public class Profile {
	protected String Lname;
	protected String Fname;
	protected int DoBDay;
	protected int DoBMonth;
	protected int DoBYear;
	protected String Email;
	protected String[] Interests;
	protected String[] Activities;
	protected Profile[] Friends;
	protected ArrayList<Profile> FriendsList = new ArrayList<Profile>();
	
	public void insertFriend(Profile p){
		FriendsList.add(p);
		Friends = FriendsList.toArray(new Profile[FriendsList.size()]);
	}
	
	public Profile getFriend(int i) {
		return Friends[i];
	}
	
	public int numOfFriends() {
		return Friends.length;
	}
		
	
	
	public Profile(String fname, String lname, int doBDay, int doBMonth, int doBYear, String email,
			String[] interests, String[] activities) {
		super();
		setLname(lname);
		setFname(fname);
		setDateOfBirth(doBDay,doBMonth,doBYear);
		setEmail(email);
		setInterests(interests);
		setActivities(activities);
	}

	public String toString() {
		return Fname + ", " + Lname + ", " + DoBDay + "-" + DoBMonth
				+ "-" + DoBYear + ", " + Email;
	}

	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getDateOfBirth() {
		return String.valueOf(DoBDay) + "-"+ String.valueOf(DoBMonth) +"-"+ String.valueOf(DoBYear);
	}
	public void setDateOfBirth(int doBDay, int doBMonth, int doBYear) {
		DoBDay = doBDay;
		DoBMonth = doBMonth;
		DoBYear = doBYear;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String[] getInterests() {
		return Interests;
	}
	public void setInterests(String[] interests) {
		Interests = interests;
	}
	public String[] getActivities() {
		return Activities;
	}
	public void setActivities(String[] activities) {
		Activities = activities;
	}
}
