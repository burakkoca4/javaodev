package kodlamaio.hrms.core.utilities.validations;

import kodlamaio.hrms.Services.Mernis;

public class IdentityValidation {
	public static boolean isRealPerson(String tcno) {
		Mernis mernis = new Mernis();
		return mernis.ValidateByPersonalInfo(tcno);
	}
}
