package odev4.dataAccess.concretes;

import java.util.List;

import odev4.dataAccess.abstracts.UserDao;
import odev4.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Kayýt baþarýlý " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
