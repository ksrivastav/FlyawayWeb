package entityModelConverion;

import model.MasterData.City;
import serviceDAO.Entity.MasterData.CityEntity;

public class CityConverter {

	public static CityEntity convertModelToEntity(City CityModel)
	{
		CityEntity CityEntity  = new CityEntity();
		CityEntity.setCityId(CityModel.getCityId());
		CityEntity.setCityCode(CityModel.getCityCode());
		CityEntity.setCityName(CityModel.getCityName());
		CityEntity.setCountryId(CityModel.getCountryId());
		
		return CityEntity;

	}
	
	
	public static City convertEntityToModel(CityEntity CityEntity)
	{
		City CityModel  = new City();
		CityModel.setCityId(CityEntity.getCityId());
		CityModel.setCityCode(CityEntity.getCityCode());
		CityModel.setCityName(CityEntity.getCityName());
		CityModel.setCountryId(CityEntity.getCountryId());
		
		
		return CityModel;

	}

}
