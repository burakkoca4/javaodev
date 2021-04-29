package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getUserName());
	}
	
	public void add(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

}
