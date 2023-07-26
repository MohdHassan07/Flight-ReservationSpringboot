package com.Tyao.SpringBoot.dto;

public class ReservationUpdateRequest {
	private Long id;
	private Boolean checkedIn;
	private int numberOfBags;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getcheckedIn() {
		return checkedIn;
	}
	public void setcheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	@Override
	public String toString() {
		return "ReservationUpdateRequest [id=" + id + ", checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + "]";
	}

	}


