package view;


import model.*;

import java.util.Scanner;



public class Menu {
	public int displayMenu() {
		System.out.println("**** WELCOME ****");
		System.out.println("1. Add Intern's Details");
		System.out.println("2. View Intern's Details");
		System.out.println("3. View Interns list and print pdf");
		System.out.println("4. Manage Intern's Data");
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		return option;
	}


	/*public void addName(Name name) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter first name");
		name.setFname(in.nextLine());
		System.out.println("enter second name");
		name.setLName(in.nextLine());
	}*/

}
