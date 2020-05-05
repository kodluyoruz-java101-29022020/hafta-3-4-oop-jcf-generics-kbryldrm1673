package insurance;

import java.util.ArrayList;
import java.util.Date;

import adress.Address;

public class User {

	// Bu s�n�f kullan�c� bilgilerini tutar kullan�c� bilgilerine d��ar�dan eri�im
	// olmas� i�in getter setter metodlar�na ihtiyac�m vard�r.
	// Bu s�n�ftan nesne olu�turdu�um da da belirli parametreler g�ndermek i�in
	// kurucuya ihtiyac�m var.

	private String name;
	private String lastName;
	private String email;
	private String password;
	private String job;
	private int age;
	private ArrayList<Address> adress;
	private Date systemDeadLine;

	public User() {

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Address> getAdress() {
		return adress;
	}

	public void setAdress(ArrayList<Address> adress) {
		this.adress = adress;
	}

	public Date getSystemDeadLine() {
		return systemDeadLine;
	}

	public void setSystemDeadLine(Date systemDeadLine) {
		this.systemDeadLine = systemDeadLine;
	}
}
