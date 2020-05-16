package com.ibm.RequestTravelPlanWebBFF.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfigReader {
	
	@Value("${flightService.exchange.name}")
	private String flightServiceExchangeName;
	@Value("${flightService.queue.name}")
	private String flightServiceQueueName;
	@Value("${flightService.routing.key}")
	private String flightServiceRoutingKey;
	
	@Value("${attractionService.exchange.name}")
	private String attractionServiceExchangeName;
	@Value("${attractionService.queue.name}")
	private String attractionServiceQueueName;
	@Value("${attractionService.routing.key}")
	private String attractionServiceRoutingKey;
	
	@Value("${hotelService.exchange.name}")
	private String hotelServiceExchangeName;
	@Value("${hotelService.queue.name}")
	private String hotelServiceQueueName;
	@Value("${hotelService.routing.key}")
	private String hotelServiceRoutingKey;
	
	
	public String getFlightServiceExchangeName() {
		return flightServiceExchangeName;
	}
	public void setFlightServiceExchangeName(String flightServiceExchangeName) {
		this.flightServiceExchangeName = flightServiceExchangeName;
	}
	public String getFlightServiceQueueName() {
		return flightServiceQueueName;
	}
	public void setFlightServiceQueueName(String flightServiceQueueName) {
		this.flightServiceQueueName = flightServiceQueueName;
	}
	public String getFlightServiceRoutingKey() {
		return flightServiceRoutingKey;
	}
	public void setFlightServiceRoutingKey(String flightServiceRoutingKey) {
		this.flightServiceRoutingKey = flightServiceRoutingKey;
	}
	public String getAttractionServiceExchangeName() {
		return attractionServiceExchangeName;
	}
	public void setAttractionServiceExchangeName(String attractionServiceExchangeName) {
		this.attractionServiceExchangeName = attractionServiceExchangeName;
	}
	public String getAttractionServiceQueueName() {
		return attractionServiceQueueName;
	}
	public void setAttractionServiceQueueName(String attractionServiceQueueName) {
		this.attractionServiceQueueName = attractionServiceQueueName;
	}
	public String getAttractionServiceRoutingKey() {
		return attractionServiceRoutingKey;
	}
	public void setAttractionServiceRoutingKey(String attractionServiceRoutingKey) {
		this.attractionServiceRoutingKey = attractionServiceRoutingKey;
	}
	public String getHotelServiceExchangeName() {
		return hotelServiceExchangeName;
	}
	public void setHotelServiceExchangeName(String hotelServiceExchangeName) {
		this.hotelServiceExchangeName = hotelServiceExchangeName;
	}
	public String getHotelServiceQueueName() {
		return hotelServiceQueueName;
	}
	public void setHotelServiceQueueName(String hotelServiceQueueName) {
		this.hotelServiceQueueName = hotelServiceQueueName;
	}
	public String getHotelServiceRoutingKey() {
		return hotelServiceRoutingKey;
	}
	public void setHotelServiceRoutingKey(String hotelServiceRoutingKey) {
		this.hotelServiceRoutingKey = hotelServiceRoutingKey;
	}
}
