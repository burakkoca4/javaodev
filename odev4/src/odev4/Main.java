package odev4;

import odev4.business.concretes.UserManager;
import odev4.core.concretes.EmailManager;
import odev4.core.concretes.GoogleAdapter;
import odev4.dataAccess.concretes.HibernateUserDao;
import odev4.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Burak","Koca","burak@gmail.com","123456");
		User user2=new User(2,"Buket","Koca","burak@gmail.com","1234");
		
		String[] mails = {user1.getEmail()};
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new EmailManager());
		
		userManager.register(user1, mails);
		
		GoogleAdapter adapter=new GoogleAdapter(new EmailManager());
		adapter.register(user2);

	}

}
