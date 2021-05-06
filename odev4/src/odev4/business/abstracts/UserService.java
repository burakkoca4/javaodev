package odev4.business.abstracts;

import java.util.List;

import odev4.entities.concretes.User;

public interface UserService {
	void register(User user,String[] mails);
	List<User> getAll();

}
