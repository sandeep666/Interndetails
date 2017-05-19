package Control;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

import model.*;
import pdfGenration.Pdfgen;
import view.*;

public class MainController {
	public static void main(String[] args) throws DocumentException, IOException  {
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		Menu m = new Menu();
		Name name = new Name();
		InternHandler c = new InternHandler();
		InternHolder holder = new InternHolder();
		do {
			int option = m.displayMenu();
			switch (option) {
			case 1:
				c.createIntern(holder);
				flag = true;
				break;
			case 2:
				c.ShowContact(holder);
				break;
			case 3:
				System.out.println("please select the index");
				
				int input = in.nextInt();
				c.getContact(holder, input);
				break;
			case 4:
				System.out.println("please select the index that has to be deleted");
				int input1 = in.nextInt();
				c.deleteContact(holder, input1);
				break;
			default:
				System.out.println("PLEASE ENTER THE CORRECT OPTION");
				flag = true;
			}

		} while (flag);
	}

}