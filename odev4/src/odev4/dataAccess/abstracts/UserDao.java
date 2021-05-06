package odev4.dataAccess.abstracts;

import java.util.List;

import odev4.entities.concretes.User;

public interface UserDao {
	void register(User user);
	User get(int id);
	List<User> getAll();

}
