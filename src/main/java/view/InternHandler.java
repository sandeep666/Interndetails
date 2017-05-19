package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.itextpdf.text.DocumentException;

import model.*;
import pdfGenration.Pdfgen;

public class InternHandler {
	public void createIntern(InternHolder holder) {

		ArrayList<Intern> interns_list = holder.getInternslist();
		Intern intern = new Intern();
		Name name = new Name();
		NameHandler namehandler = new NameHandler();
		namehandler.addName(name);
		intern.setName(name);
		Email email = new Email();
		EmailHandler emailhandler = new EmailHandler();
		emailhandler.addEmail(email);
		intern.setEmail(email);
		interns_list.add(intern);

	}

	public void ShowContact(InternHolder holder) {
		ArrayList<Intern> interns_list = holder.getInternslist();
		Iterator<Intern> itr = interns_list.iterator();

		while (itr.hasNext()) {
			Intern c = itr.next();
			Name name = c.getName();
			NameHandler namehandler = new NameHandler();
			namehandler.showName(name);
			Email email = c.getEmail();
			EmailHandler emailhandler = new EmailHandler();
			emailhandler.showEmail(email);

		}
	}

	public void getContact(InternHolder holder, int option) throws DocumentException, IOException {
		final String RESULT = "C:\\Users\\User\\Desktop\\New folder\\javaoutfile1.pdf";
		Pdfgen pdf = new Pdfgen();
		ArrayList<Intern> contact_list = holder.getInternslist();
		Intern intern = contact_list.get(option);
		Name name = intern.getName();
		NameHandler namehandler = new NameHandler();
		namehandler.showName(name);
		Email email = intern.getEmail();
		EmailHandler emailhandler = new EmailHandler();
		pdf.createPdf(RESULT, namehandler.printname(name), emailhandler.printEmail(email));
		
	}
	public void deleteContact(InternHolder holder, int option)  {
		ArrayList<Intern> contact_list = holder.getInternslist();
		Intern intern = contact_list.remove(option);
		Name name = intern.getName();
		NameHandler namehandler = new NameHandler();
		namehandler.showName(name);
		Email email = intern.getEmail();
		EmailHandler emailhandler = new EmailHandler();
		
	}

}
