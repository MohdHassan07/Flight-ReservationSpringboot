package com.Tyao.SpringBoot.flight.entities;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Flight extends AbstractEntity {
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
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", depatureCity="
				+ depatureCity + ", arrivalCity=" + arrivalCity + ", dateOfDepatrure=" + dateOfDepatrure
				+ ", estimatedDepatureTime=" + estimatedDepatureTime + "]";
	}

}
