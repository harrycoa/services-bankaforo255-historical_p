package com.app.aforo255.historical_p.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction_p")
public class Transaction_p {
	
	private String id ;
	private double importe_cuota;
	private int cuota;
	private String creationDate ;	
	private int nroprestamo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getImporte_cuota() {
		return importe_cuota;
	}
	public void setImporte_cuota(double importe_cuota) {
		this.importe_cuota = importe_cuota;
	}
	public int getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public int getNroprestamo() {
		return nroprestamo;
	}
	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}
	
	

}





