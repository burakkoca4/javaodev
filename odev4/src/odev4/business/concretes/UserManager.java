package odev4.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import odev4.business.abstracts.UserService;
import odev4.core.abstracts.EmailService;
import odev4.dataAccess.abstracts.UserDao;
import odev4.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void register(User user, String[] mails) {
		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(user.getEmail());
		boolean matchFound = matcher.find();

		for (String mail : mails) {
			if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
				System.out.println("ad ve soyad en az 2 karakter uzunluðunda olmalýdýr");
				return;
			}
			if (!matchFound) {
				System.out.println("Email formatý uygun deðil");
				return;
			}
			if (mail==user.getEmail()) {
				System.out.println("Email mevcut");
				return;
			}
			if(user.getPassword().length()<5 ) {
				System.out.println("Þifre en az 6 karakter olmalýdýr");
				return;
				
			}
			if(this.emailService.getClick()==false) {
				System.out.println("Doðrulama hatasý üyelik kabul edilmedi");
				return;
			}
			
			this.userDao.register(user);
		}

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
