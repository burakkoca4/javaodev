package odev4.core.concretes;

import odev4.core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendToMail(String message) {
		System.out.println("Do�rulam linki g�nderildi " + message);

	}

	@Override
	public boolean getClick() {
		
		return false;
	}

}
