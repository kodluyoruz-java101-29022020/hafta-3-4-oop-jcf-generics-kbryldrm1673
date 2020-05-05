package insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Status.AuthenticationStatus;
import insurancePolicy.Enterprise;

public abstract class Account implements Comparable {

	User user = new User();
	List<Insurance> listInsurance = new ArrayList<Insurance>();
	
	private AuthenticationStatus status1 = AuthenticationStatus.FAIL;

	private String email;
	private String password;

	public AuthenticationStatus accountLogin(User userEmail, User userPassword, AuthenticationStatus status)
			throws InvalidAuthenticationException {

		// AuthenticationStatus status1 = AuthenticationStatus.FAIL;

		if (email.equals(userEmail.getEmail()) && password.equals(userPassword.getPassword())) {

			status1 = AuthenticationStatus.SUCCESS;
		} else {

			status1 = AuthenticationStatus.FAIL;

			throw new InvalidAuthenticationException("Login not success");

		}

		return status1;

	}

	public void addingUserAddress() {

	}

	public void removingUserAddress() {

	}

	public final void showUserInfo() {

		System.out.println("Müþteri Bilgilerini ekrana yazdýran fonksiyon");

	}

	public abstract void userInformation();

	public abstract void addInsurancePolicy();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
