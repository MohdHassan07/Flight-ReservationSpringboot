package com.Tyao.SpringBoot.flight.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
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
	return "Reservation [checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", pass=" + pass + ", fli=" + fli
			+ "]";
}

}
