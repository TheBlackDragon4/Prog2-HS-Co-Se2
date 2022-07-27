package uebung_1_2_EmployeeSalary_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		long employeeNumber = 0;
		String employeeName;
		double hourlySalary = 0.00;
		double weeklyTime = 0.00;
		double regularTime, overtime;
		double regularPay, overtimePay, netPay;

		System.out.print("Enter Employee Number (00000): ");
		try {
			employeeNumber = scnr.nextLong();
		} catch (InputMismatchException e0) {
			System.out.println("The input must be a long and no double.");
		} catch (InternalError inEr) {
			System.out.println("Internal Error");
		}

		if (employeeNumber == 82500)
			employeeName = "Peter Baker";
		else if (employeeNumber == 92746)
			employeeName = "John Kouma";
		else if (employeeNumber == 54080)
			employeeName = "Steg Larson";
		else if (employeeNumber == 86285)
			employeeName = "Gertrude Monay";
		else
			employeeName = "Unknown";

		System.out.print("Enter Hourly Salary: ");
		try {
			hourlySalary = scnr.nextDouble();
		} catch (InputMismatchException e1) {
			System.out.println("The input must be a double.");
		} catch (InternalError inEr) {
			System.out.println("Internal Error");
		}

		if (hourlySalary <= 0) {
			try {
				throw new InputMismatchException(); // Wirt eine neue InputMismatchException
			} catch (InputMismatchException e2) {
				System.out.println("The hourly salary must be positiv.");
				System.exit(0); // Sorgt dafür, dass das Programm gestopt wird
			}
		}

		System.out.print("Enter Weekly Time: ");
		try {
			weeklyTime = scnr.nextDouble();
		} catch (InputMismatchException e3) {
			System.out.println("The input must be a double.");
		} catch (InternalError inEr) {
			System.out.println("Internal Error");
		}

		if (weeklyTime <= 0) {
			try {
				throw new InputMismatchException(); // Wirt eine neue InputMismatchException
			} catch (InputMismatchException e4) {
				System.out.println("The weekly Time must be positiv.");
				System.exit(0); // Sorgt dafür, dass das Programm gestopt wird
			}
		}

		if (weeklyTime < 40) {
			regularTime = weeklyTime;
			overtime = 0;
			regularPay = hourlySalary * regularTime;
			overtimePay = 0;
			netPay = regularPay;
		} else {
			regularTime = 40;
			overtime = weeklyTime - 40;
			regularPay = hourlySalary * 40;
			overtimePay = hourlySalary * overtime;
			netPay = regularPay + overtimePay;
		}

		System.out.println("======================");
		System.out.println("==-=-= Employee Payroll =-=-==");
		System.out.println("-------------------------------------------");
		System.out.printf("Employee #:    %d\n", employeeNumber);
		System.out.printf("Employee Name: %s\n", employeeName);
		System.out.printf("Hourly Salary: %.2f\n", hourlySalary);
		System.out.printf("Weekly Time:   %.2f\n", weeklyTime);
		System.out.printf("Regular Pay:   %.2f\n", regularPay);
		System.out.printf("Overtime Pay:  %.2f\n", overtimePay);
		System.out.printf("Total Pay:     %.2f\n", netPay);
		System.out.println("======================");
		scnr.close();
	}

}
