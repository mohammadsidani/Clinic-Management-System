package Main;

import Doctors.DoctorControl;
import Patients.PatientControl;
import Doctors.DoctorControl;
import Reservations.ReservationControl;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		PatientControl p = new PatientControl();
		DoctorControl d = new DoctorControl();
		ReservationControl r = new ReservationControl();

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("*****************************");
			System.out.println("Welcome to Beirut Clinic.\nIn your service 24/7.\n");
			System.out.println("*****************************");
			System.out.println("Choose your option:");
			System.out.println("1- Doctors");
			System.out.println("2- Add Doctor");
			System.out.println("3- Remove Doctor");
			System.out.println("4- Patients");
			System.out.println("5- Add Patient");
			System.out.println("6- Remove Patient");
			System.out.println("7- Update Patient");
			System.out.println("8- Reservations");
			System.out.println("9- Add Reservation");
			System.out.println("10- Remove Reservation");
			System.out.println("11- Exit");

			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7
					&& choice != 8 && choice != 9 && choice != 10 && choice != 11) {
				System.out.println("Wrong choice");
			}
			switch (choice) {
			case 1:

				d.printAllDoctor();
				break;
			case 2:
				d.addDoctor();

				break;
			case 3:
				d.printAllDoctor();
				System.out.println("Please enter the Id of doctor you want to remove:");
				int id = sc.nextInt();

				d.removeDoctor(id);

				System.out.println("Doctor of Id " + id + " is removed.");

				break;
			case 4:
				p.printPatientall();

				break;
			case 5:

				p.addPatient();
				break;
			case 6:
				p.printPatientall();
				System.out.println("Please enter the Id of patient you want to remove:");
				id = sc.nextInt();

				System.out.println("Patient of Id " + id + " is removed.");
				p.removePatient(id);
				break;
			case 7:
				p.printPatientall();
				System.out.println("Please enter the Id of patient you want to update:");
				id = sc.nextInt();
				p.updataPatient(id);
				break;
			case 8:
				r.printAllReserve();
				break;
			case 9:
				r.addReserve();
				break;
			case 10:

				r.printAllReserve();
				System.out.println("Please enter the Id of reserve you want to remove:");
				id = sc.nextInt();
				r.deleteReserve(id);
				System.out.println("Reservation " + id + " is removed successfully.");
				break;
			}

		} while (choice != 11);
		System.out.println("Welcome to Beirut Clinic and thank you for the visit!");
	}
}
