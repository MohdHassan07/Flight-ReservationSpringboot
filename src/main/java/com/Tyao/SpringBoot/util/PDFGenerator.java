package com.Tyao.SpringBoot.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.Tyao.SpringBoot.flight.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGenerator {
public void generatedItinerary(Reservation reservation,String filePath) {
	
	Document document =new Document();
	try {
		PdfWriter.getInstance(document,new FileOutputStream(filePath));
		document.open();
		document.add(generateTable(reservation));
		document.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
     private PdfPTable generateTable(Reservation reservation) {
    	 PdfPTable table=new PdfPTable(2);
    	 PdfPCell cell;
    	 
    	 cell=new PdfPCell(new Phrase("Flight Itinerary"));
    	 cell.setColspan(2);
    	 table.addCell(cell);
    	 
    	 cell=new PdfPCell(new Phrase("Flight Details"));
    	 cell.setColspan(2);
    	 table.addCell(cell);
    	 
    	 table.addCell("Airlines");
    	 table.addCell(reservation.getFli().getOperatingAirlines());
    	 
    	 table.addCell("Departure City");
    	 table.addCell(reservation.getFli().getDepatureCity());
    	 
    	 table.addCell("Arrival City");
    	 table.addCell(reservation.getFli().getArrivalCity());
    	 
    	 table.addCell("Flight Number");
    	 table.addCell(reservation.getFli().getFlightNumber());
    	 
    	 table.addCell("Departure Date");
    	 table.addCell(reservation.getFli().getDepatureCity());
    	 
    	 table.addCell("Departure Time");
    	 table.addCell(reservation.getFli().getEstimatedDepatureTime().toString());
    	 
    	 cell=new PdfPCell(new Phrase("Passenger Details"));
    	 cell.setColspan(2);
    	 table.addCell(cell);
    	 
    	 table.addCell("First Name");
    	 table.addCell(reservation.getPass().getFirstName());
    	 
    	 table.addCell("Last Name");
    	 table.addCell(reservation.getPass().getLastName());
    	 
    	 table.addCell("Email");
    	 table.addCell(reservation.getPass().getEmail());
    	 
    	 table.addCell("Phone");
    	 table.addCell(reservation.getPass().getPhone());
		return table;
	
}
}
