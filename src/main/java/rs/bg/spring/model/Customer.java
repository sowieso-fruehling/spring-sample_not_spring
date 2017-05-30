package rs.bg.spring.model;

public class Customer {
	
	private String name;
	private String surname;
	
	public Customer()
	{}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
