package odev4.core.concretes;

import odev4.core.abstracts.EmailService;
import odev4.core.abstracts.GoogleService;
import odev4.entities.concretes.User;
import odev4.jGoogle.JGoogleManager;

public class GoogleAdapter implements GoogleService {

	private EmailService emailService;

	public GoogleAdapter(EmailService emailService) {

		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
		JGoogleManager googleManager = new JGoogleManager();
		
		if (this.emailService.getClick()==false) {
			System.out.println("Doðrulama hatasý");
		}else {
			googleManager.register(user.getFirstName());
		}

	}

}
