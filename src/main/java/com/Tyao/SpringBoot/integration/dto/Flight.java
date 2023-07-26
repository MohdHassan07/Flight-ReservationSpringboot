package com.Tyao.SpringBoot.integration.dto;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


public class Flight {
	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String depatureCity;
	private String arrivalCity;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.DATE)
	
	private Date dateOfDepatrure;
	private Timestamp estimatedDepatureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepatureCity() {
		return depatureCity;
	}

	public void setDepatureCity(String depatureCity) {
		this.depatureCity = depatureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDepatrure() {
		return dateOfDepatrure;
	}

	public void setDateOfDepatrure(Date dateOfDepatrure) {
		this.dateOfDepatrure = dateOfDepatrure;
	}

	public Timestamp getEstimatedDepatureTime() {
		return estimatedDepatureTime;
	}

	public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
		this.estimatedDepatureTime = estimatedDepatureTime;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines
				+ ", depatureCity=" + depatureCity + ", arrivalCity=" + arrivalCity + ", dateOfDepatrure="
				+ dateOfDepatrure + ", estimatedDepatureTime=" + estimatedDepatureTime + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
