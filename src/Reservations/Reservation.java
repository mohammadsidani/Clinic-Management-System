package Reservations;

import Doctors.DoctorControl;
import Patients.PatientControl;

public class Reservation {

	private PatientControl patientInfo;
	private DoctorControl doctorInfo;
	private int id;
	private String reserveDate;
	private int price;

	public Reservation(PatientControl p, DoctorControl d, int id, String reserveDate, int price) {
		this.patientInfo = p;
		this.doctorInfo = d;
		this.id = id;
		this.reserveDate = reserveDate;
		this.price = price;
	}

	public Reservation() {
	}

	public Reservation(int id, String reserveDate, int price) {
		this.id = id;
		this.reserveDate = reserveDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(String reserveDate) {
		this.reserveDate = reserveDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		
		System.out.print("The reserve Id:" + getId() + "\t\t\t");
		System.out.print("The reserve date:" + getReserveDate() + "\t\t");
		System.out.print("The reserve price:" + getPrice() + "$" + "\t\t\n\n");
		System.out.println("*******************************NEW RESERVATION*********************************\n");
		return null;

	}

}