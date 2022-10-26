package entityModelConverion;

import model.Flight.Flight;
import model.Flight.FlightMasterDataModel;
import serviceDAO.Entity.Flight.FlightEntity;
import serviceDAO.Entity.Flight.FlightMasterData;


public class FlightMasterDataConverter {

	public static  FlightMasterDataModel convertEntityToModel (FlightMasterData FlightMasterDataEntity)
	{
		
		FlightMasterDataModel  FlightMasterDataModel = new FlightMasterDataModel();
		FlightMasterDataModel.setFlightId(FlightMasterDataEntity.getFlightId());
		FlightMasterDataModel.setAircraftId(FlightMasterDataEntity.getAircraftId());
		FlightMasterDataModel.setFlightNumber(FlightMasterDataEntity.getFlightNumber());
		FlightMasterDataModel.setLocalArrivalDateTime(FlightMasterDataEntity.getLocalArrivalDateTime());
		FlightMasterDataModel.setLocalDepartureDateTime(FlightMasterDataEntity.getLocalDepartureDateTime());
		FlightMasterDataModel.setRouteId(FlightMasterDataEntity.getRouteId());
		FlightMasterDataModel.setSeatCapacity(FlightMasterDataEntity.getSeatCapacity());
		FlightMasterDataModel.setSeatRemaining(FlightMasterDataEntity.getSeatRemaining());
		
		FlightMasterDataModel.setDepAirportName(FlightMasterDataEntity.getDepAirportName());
		FlightMasterDataModel.setDepCity(FlightMasterDataEntity.getDepCity());
		FlightMasterDataModel.setArrCity(FlightMasterDataEntity.getArrCity());
		FlightMasterDataModel.setArrAirportName(FlightMasterDataEntity.getArrAirportName());
		FlightMasterDataModel.setAircraftType(FlightMasterDataEntity.getAircraftType());		
		return FlightMasterDataModel;
		
		
	}
	

}
