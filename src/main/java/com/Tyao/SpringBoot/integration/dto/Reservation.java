package com.Tyao.SpringBoot.integration.dto;


import javax.persistence.OneToOne;


public class Reservation {
	private Long id;
private Boolean checkedIn;
private int numberOfBags;
@OneToOne
private Passenger pass;
@OneToOne
private Flight fli;
public Boolean getCheckedIn() {
	return checkedIn;
}
public void setCheckedIn(Boolean checkedIn) {
	this.checkedIn = checkedIn;
}
public int getNumberOfBags() {
	return numberOfBags;
}
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}
public Passenger getPass() {
	return pass;
}
public void setPass(Passenger pass) {
	this.pass = pass;
}
public Flight getFli() {
	return fli;
}
public void setFli(Flight fli) {
	this.fli = fli;
}
@Override
public String toString() {
	return "Reservation [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", pass=" + pass
			+ ", fli=" + fli + "]";
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}


}
