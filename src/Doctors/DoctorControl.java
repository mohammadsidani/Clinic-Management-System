package Doctors;

import java.util.Scanner;

import Patients.Patient;
import Utility.CircularLinkedList;

public class DoctorControl {
	CircularLinkedList<Doctor> list = new CircularLinkedList<>();
	Scanner input = new Scanner(System.in);

	public void addDoctor() {
		Doctor d = new Doctor();
		System.out.println("Enter the doctor's Id please:");
		d.setId(input.nextInt());
		System.out.println("Enter the doctor's name please:");
		d.setName(input.nextLine());
		d.setName(input.nextLine());
		System.out.println("Enter the doctor's gender please:");
		d.setGender(input.nextLine());
		System.out.println("Enter the doctor's age please:");
		d.setAge(input.nextInt());
		System.out.println("Enter the doctor's address please:");
		d.setAddress(input.nextLine());
		d.setAddress(input.nextLine());
		System.out.println("Enter the doctor's qualfication please:");
		d.setQualfication(input.nextLine());
		System.out.println("Enter the doctor's hired date please(dd/mm/yy):");
		d.setHiredDate(input.nextLine());

		list.addLast(d);

	}

	public void removeDoctor(int id) {
		if (NumberOfDoctor() > 0) {
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

	public int NumberOfDoctor() {
		return list.size();
	}

	public void printDoctor(int id) {
		if (NumberOfDoctor() > 0) {
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

	public void printAllDoctor() {

		int n = NumberOfDoctor();
		if (NumberOfDoctor() > 0) {
			for (int i = 0; i < n; i++) {
				list.first().toString();
				list.rotate();
			}
		} else {
			System.out.println("There is no data.");
		}
	}

}
