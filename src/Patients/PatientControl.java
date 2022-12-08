package Patients;

import Utility.CircularLinkedList;
import java.util.Scanner;

public class PatientControl {

	CircularLinkedList<Patient> list = new CircularLinkedList<>();
	Scanner input = new Scanner(System.in);

	public void addPatient() {
		Patient p = new Patient();
		System.out.println("Enter the patient's Id please:");
		p.setId(input.nextInt());
		System.out.println("Enter the patient's name please:");
		p.setName(input.nextLine());
		p.setName(input.nextLine());
		System.out.println("Enter the patient's gender please:");
		p.setGender(input.nextLine());
		System.out.println("Enter the patient's age please:");
		p.setAge(input.nextInt());
		System.out.println("Enter the patient's phone number please:");
		p.setPhoneNumber(input.nextInt());
		System.out.println("Enter the patient address please:");
		p.setAddress(input.nextLine());
		p.setAddress(input.nextLine());

		list.addLast(p);

	}

	public void removePatient(int id) {
		if (NumberOfPatient() > 0) {
			boolean check = false;
			while (!check) {
				if (list.first().getId() == id) {
					check = true;
					list.removeFirst();
					System.out.println("The data is deleted successfully.");
					return;
				} else {
					list.rotate();
				}

			}
			if (!check) {
				System.out.println("The data is not exit.");
			}
		} else {
			System.out.println("There is no data.");
		}

	}

	public int NumberOfPatient() {
		return list.size();
	}

	public void printPatient(int id) {
		if (NumberOfPatient() > 0) {
			boolean check = false;
			while (!check) {
				if (list.first().getId() == id) {
					check = true;
					System.out.println(list.first().toString());
					System.out.println("The data is deleted successfully.");
					return;
				} else {
					list.rotate();
				}

			}
			if (!check) {
				System.out.println("The data is not exit.");
			}
		} else {
			System.out.println("There is no data.");
		}

	}

	public void updataPatient(int id) {
		removePatient(id);
		Patient p = new Patient();
		p.setId(id);
		System.out.println("Enter the patient's Id please:");
		p.setId(input.nextInt());
		System.out.println("Enter the patient's name please:");
		p.setName(input.nextLine());
		p.setName(input.nextLine());
		System.out.println("Enter the patient's gender please:");
		p.setGender(input.nextLine());
		System.out.println("Enter the patient's age please:");
		p.setAge(input.nextInt());
		System.out.println("Enter the patient's phone number please:");
		p.setPhoneNumber(input.nextInt());
		System.out.println("Enter the patient's address please:");
		p.setAddress(input.nextLine());
		p.setAddress(input.nextLine());

		list.addLast(p);

	}

	public void printPatientall() {

		int n = NumberOfPatient();
		if (NumberOfPatient() > 0) {
			for (int i = 0; i < n; i++) {
				list.first().toString();
				list.rotate();
			}
		} else {
			System.out.println("There is no data.");
		}
	}

}