package entityModelConverion;

import model.Flight.Route;
import model.Flight.RouteMasterDataModel;
import serviceDAO.Entity.Flight.RouteEntity;
import serviceDAO.Entity.Flight.RouteMasterData;


public class RouteMasterDataConverter {

	public static  RouteMasterDataModel convertEntityToModel (RouteMasterData RouteMasterDataEntity)
	{
		
		RouteMasterDataModel  RouteMasterDataModel = new RouteMasterDataModel();
		RouteMasterDataModel.setRouteId(RouteMasterDataEntity.getRouteId());
		RouteMasterDataModel.setDepAirportName(RouteMasterDataEntity.getDepAirportName());
		RouteMasterDataModel.setDepCityName(RouteMasterDataEntity.getDepCityName());
		RouteMasterDataModel.setArrCityName(RouteMasterDataEntity.getArrCityName());
		RouteMasterDataModel.setArrAirportName(RouteMasterDataEntity.getArrAirportName());
		
		return RouteMasterDataModel;
		
		
	}
	

}
