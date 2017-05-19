package model;

import java.util.ArrayList;

public class InternHolder {
	ArrayList<Intern> intern_list = new ArrayList<Intern>();

	public ArrayList<Intern> getInternslist() {
		return intern_list;
	}

	public void setInternslist(ArrayList<Intern> contact_list) {
		this.intern_list = contact_list;
	}
}
