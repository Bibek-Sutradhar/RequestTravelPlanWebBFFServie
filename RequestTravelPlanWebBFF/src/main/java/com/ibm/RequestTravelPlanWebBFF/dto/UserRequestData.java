package com.ibm.RequestTravelPlanWebBFF.dto;

public class UserRequestData {
	
	private String originLocation;
	private String destinationLocation;
	private String departureDate;
	private String returnDate;
	private String numOfTravellers;
	private boolean attractions;
	private boolean hotels;
	private boolean flights;
	public String getOriginLocation() {
		return originLocation;
	}
	public void setOriginLocation(String originLocation) {
		this.originLocation = originLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getNumOfTravellers() {
		return numOfTravellers;
	}
	public void setNumOfTravellers(String numOfTravellers) {
		this.numOfTravellers = numOfTravellers;
	}
	public boolean isAttractions() {
		return attractions;
	}
	public void setAttractions(boolean attractions) {
		this.attractions = attractions;
	}
	public boolean isHotels() {
		return hotels;
	}
	public void setHotels(boolean hotels) {
		this.hotels = hotels;
	}
	public boolean isFlights() {
		return flights;
	}
	public void setFlights(boolean flights) {
		this.flights = flights;
	}
	@Override
	public String toString() {
		return "UserRequestData [originLocation=" + originLocation + ", destinationLocation=" + destinationLocation
				+ ", departureDate=" + departureDate + ", returnDate=" + returnDate + ", numOfTravellers="
				+ numOfTravellers + ", attractions=" + attractions + ", hotels=" + hotels + ", flights=" + flights
				+ "]";
	}
}
