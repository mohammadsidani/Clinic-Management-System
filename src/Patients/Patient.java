package Patients;

import Utility.Person;

public class Patient extends Person {

	public Patient() {
	}

	public Patient(int id, String name, String address, int phoneNumber, int age, String gender) {
		super(id, name, address, phoneNumber, age, gender);
	}

	public String toString() {
		System.out.println("The patient's Id:" + getId()+"\n");
		System.out.println("The patient's name:" + getName()+"\n");
		System.out.println("The patient's gender:" + getGender()+"\n");
		System.out.println("The patient's age:" + getAge()+"\n");
		System.out.println("The patient's phone number:" + getPhoneNumber()+"\n");
		System.out.println("The patient's address:" + getAddress()+"\n");
		System.out.println("*******************************NEW PATIENT*********************************\n");
		return null;
	}
}
