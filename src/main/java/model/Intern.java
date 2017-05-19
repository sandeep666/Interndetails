package model;


public class Intern {

	Name name = new Name();
	Email Email = new Email();
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Email getEmail() {
		return Email;
	}
	public void setEmail(Email email) {
		Email = email;
	}

}