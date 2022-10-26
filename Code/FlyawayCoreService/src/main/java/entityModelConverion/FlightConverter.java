package entityModelConverion;

import model.Flight.Flight;
import serviceDAO.Entity.Flight.FlightEntity;


public class FlightConverter {

	public static  Flight convertEntityToModel (FlightEntity FlightEntity)
	{
		
		Flight FlightModel = new Flight();
		FlightModel.setFlightId(FlightEntity.getFlightId());
		FlightModel.setaircraftId(FlightEntity.getaircraftId());
		FlightModel.setFlightNumber(FlightEntity.getFlightNumber());
		FlightModel.setLocalDepartureDateTime(FlightEntity.getLocalArrivalDateTime());
		FlightModel.setLocalDepartureDateTime(FlightEntity.getLocalDepartureDateTime());
		FlightModel.setRouteId(FlightEntity.getRouteId());
		FlightModel.setSeatCapacity(FlightEntity.getSeatCapacity());
		FlightModel.setSeatRemaining(FlightEntity.getSeatRemaining());
		
		return FlightModel;
		
		
	}
	

	public static  FlightEntity convertModelToEntity (Flight flightModel)
	{
		
		FlightEntity flightEntity = new FlightEntity();
		flightEntity.setFlightId(flightModel.getFlightId());
		flightEntity.setaircraftId(flightModel.getaircraftId());
		flightEntity.setFlightNumber(flightModel.getFlightNumber());
		flightEntity.setLocalArrivalDateTime(flightModel.getLocalArrivalDateTime());
		flightEntity.setLocalDepartureDateTime(flightModel.getLocalDepartureDateTime());
		flightEntity.setRouteId(flightModel.getRouteId());
		flightEntity.setSeatCapacity(flightModel.getSeatCapacity());
		flightEntity.setSeatRemaining(flightModel.getSeatRemaining());
		
		return flightEntity;
		
		
	}

}
