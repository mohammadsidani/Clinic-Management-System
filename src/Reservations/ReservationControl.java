package Reservations;

import Doctors.DoctorControl;
import Patients.PatientControl;
import java.util.Scanner;

public class ReservationControl {
	CircularQueue<Reservation> list = new CircularQueue<>();
	Scanner input = new Scanner(System.in);
	PatientControl p1 = new PatientControl();
	DoctorControl d1 = new DoctorControl();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int numberOfReserve() {
		return list.size();
	}

	public void addReserve() {

		p1.addPatient();
		d1.addDoctor();
		Reservation r = new Reservation();
		System.out.println("Enter the reservation Id please:");
		r.setId(input.nextInt());
		System.out.println("Enter the reservation date please:");
		r.setReserveDate(input.nextLine());
		r.setReserveDate(input.nextLine());
		System.out.println("Enter the reserve price please:");
		r.setPrice(input.nextInt());
		list.enqueue(r);
	}

	public Reservation deleteReserve(int id) {
		p1.removePatient(id);
		d1.removeDoctor(id);
		if (numberOfReserve() > 0) {
			boolean check = false;
			while (!check) {
				if (list.first().getId() == id) {
					check = true;
					list.dequeue();
					System.out.println("The data is deleted successfully.");
					return null;
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

		return null;
	}

	public void printReserve(int id) {
		p1.printPatient(id);
		d1.printDoctor(id);
		if (numberOfReserve() > 0) {
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

	public void printAllReserve() {
		p1.printPatientall();
		d1.printAllDoctor();

		int n = numberOfReserve();
		if (numberOfReserve() > 0) {
			for (int i = 0; i < n; i++) {
				list.first().toString();
				list.rotate();
			}
		} else {
			System.out.println("There is no data to show.");
		}
	}
}