package entityModelConverion;

import model.Flight.Route;
import serviceDAO.Entity.Flight.RouteEntity;

public class RouteConverter {

	public static  Route convertEntityToModel (RouteEntity routeEntity)
	{
		
		Route routetModel = new Route();
		routetModel.setarrAirportId(routeEntity.getarrAirportId());
		routetModel.setdepAirportId(routeEntity.getdepAirportId());
		routetModel.setrouteId(routeEntity.getrouteId());
		
		
		return routetModel;		
		
	}
	
	public static  RouteEntity convertModelToEntity (Route routetModel)
	{
		
		RouteEntity routeEntity = new RouteEntity(); 
		routeEntity.setarrAirportId(routetModel.getarrAirportId());
		routeEntity.setdepAirportId(routetModel.getdepAirportId());
		routeEntity.setrouteId(routetModel.getrouteId());
		
		
		return routeEntity;		
		
	}
}
