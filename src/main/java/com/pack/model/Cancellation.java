package com.pack.model;

public class Cancellation {
	
	private Integer passenger_id;
	private String cancellation_id;
	private String cancellation_Date;
	private String flight_code;
	private String ticket_id;
	
	public Integer getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Integer passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getCancellation_id() {
		return cancellation_id;
	}
	public void setCancellation_id(String cancellation_id) {
		this.cancellation_id = cancellation_id;
	}
	public String getCancellation_Date() {
		return cancellation_Date;
	}
	public void setCancellation_Date(String cancellation_Date) {
		this.cancellation_Date = cancellation_Date;
	}
	public String getFlight_code() {
		return flight_code;
	}
	public void setFlight_code(String flight_code) {
		this.flight_code = flight_code;
	}
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	
	
	
}
