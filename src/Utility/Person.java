package Utility;

public class Person {

	private int id;
	private int phoneNumber;
	private String name;
	private String address;
	private int age;
	private String gender;

	public Person() {
	}

	public Person(int id, String name, String address, int phoneNumber, int age, String gender) {
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		if (9 >= String.valueOf(id).length())
			this.id = id;
		else {
			System.out.println("Id should be 9 numbers.");

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		if (8 >= String.valueOf(phoneNumber).length())
			this.phoneNumber = phoneNumber;
		else {
			System.out.println("Telephone number should be 8 numbers.");
		}

	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return "Person{" + "Id=" + id + ", name=" + name + ", phone number=" + phoneNumber + ", address=" + address
				+ '}';
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if (age <= 0) {
			this.age = age;
			System.out.println("Age must be greater than 0.");
		} else {
			System.out.println("Valid age !!!");
		}
	}
}
