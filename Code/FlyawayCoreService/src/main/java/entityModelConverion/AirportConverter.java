package entityModelConverion;


import model.Flight.Airport;
import serviceDAO.Entity.Flight.AirportEntity;

public class AirportConverter {

	public static  Airport convertEntityToModel (AirportEntity airportEntity)
	{
				
		Airport airportModel = new Airport();
		airportModel.setAiportId(airportEntity.getAirportId());
		airportModel.setAirportCode(airportEntity.getAirportCode());
		airportModel.setCityid(airportEntity.getCityid());
		airportModel.setCountryId(airportEntity.getCountryId());
		airportModel.setAirportName(airportEntity.getAirportName());
		return airportModel;
		
		
	}
	

	public static  AirportEntity convertModelToEntity (Airport airportModel)
	{
				
		AirportEntity airportEntity = new AirportEntity();
		airportEntity.setAirportId(airportModel.getAiportId());
		airportEntity.setAirportCode(airportModel.getAirportCode());
		airportEntity.setCityid(airportModel.getCityid());
		airportEntity.setCountryId(airportModel.getCountryId());
		airportEntity.setAirportName(airportModel.getAirportName());
		return airportEntity ;
		
		
	}
	

}
