package odev4.core.concretes;

import odev4.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendToMail(String message) {
		System.out.println("Doðrulam linki gönderildi " + message);

	}

	@Override
	public boolean getClick() {
		
		return false;
	}

}
