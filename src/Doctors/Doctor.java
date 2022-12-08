package Doctors;

import Utility.Person;

public class Doctor extends Person {

	Person p = new Person();
	private String qualfication;
	private String hiredDate;
	private String gender;

	public Doctor() {
		super();
	}

	public Doctor(int id, int phoneNumber, String name, String address, String qualfication, String hiredDate,
			String gender, int age) {
		super(id, name, address, phoneNumber, age, gender);
		this.qualfication = qualfication;
		this.hiredDate = hiredDate;
	}

	public String getQualfication() {
		return qualfication;
	}

	public void setQualfication(String qualfication) {
		this.qualfication = qualfication;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {

		System.out.println("The doctor's Id:" + getId() + "\n");
		System.out.println("The doctor's name:" + getName() + "\n");
		System.out.println("The doctor's gender:" + getGender() + "\n");
		System.out.println("The doctor's age:" + getAge() + "\n");
		System.out.println("The doctor's address:" + getAddress() + "\n");
		System.out.println("The doctor's qualfication:" + qualfication + "\n");
		System.out.println("The doctor's hired date:" + hiredDate + "\n");
		System.out.println("*************************************************************************");
		return null;
	}

}
