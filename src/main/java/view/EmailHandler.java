package view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.Email;
import model.Name;

public class EmailHandler {
	public void addEmail(Email emails) {
		Scanner in = new Scanner(System.in);
		Map<String, Set<String>> email = emails.getEmails();
		Set<String> emailId = new HashSet<String>();
		System.out.println("Please enter the type of email ID");
		emailId.add(in.nextLine());
		System.out.println("Please enter the valid email ID");
		String type = in.nextLine();
		email.put(type, emailId);

	}

	

	public void showEmail(Email emails) {
		Map<String, Set<String>> email = emails.getEmails();
		for (Map.Entry<String, Set<String>> entry : email.entrySet()) {
			System.out.println("Email Info");
			System.out.println(entry.getKey());
			Set<String> Emailset = entry.getValue();
			Iterator itr = Emailset.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next() + ":");
			}

		}
	}

	public String printEmail(Email emails) {
		Map<String, Set<String>> email = emails.getEmails();
		String e = null;
		for (Map.Entry<String, Set<String>> entry : email.entrySet()) {
			Set<String> Emailset = entry.getValue();
			e = entry.getKey();
			Iterator itr = Emailset.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next() + ":");
			}


		}
		
		return e;
	}

}
