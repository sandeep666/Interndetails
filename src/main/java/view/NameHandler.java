package view;

import java.util.Scanner;

import model.Name;

public class NameHandler {

	public void showName(Name name) {

		System.out.println("First Name - " + name.getFName());
		System.out.println("Second Name - " + name.getLName());
		

	}
	
	public String printname(Name name){
		return name.getFName() + name.getLName();
	}
	
	public void addName(Name name) {
		Scanner in = new Scanner(System.in);
		System.out.println("add first name");
		name.setFname(in.nextLine());
		System.out.println("add second name");
		name.setLName(in.nextLine());

	}
}
