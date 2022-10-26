package entityModelConverion;

import model.MasterData.Country;
import serviceDAO.Entity.MasterData.CountryEntity;

public class CountryConverter {

	public static CountryEntity convertModelToEntity(Country countryModel)
	{
		CountryEntity countryEntity  = new CountryEntity();
		countryEntity.setCountryId(countryModel.getCountryId());
		countryEntity.setCountryCode(countryModel.getCountryCode());
		countryEntity.setCountryName(countryModel.getCountryName());
		
		return countryEntity;

	}
	
	
	public static Country convertEntityToModel(CountryEntity countryEntity)
	{
		Country countryModel  = new Country();
		countryModel.setCountryId(countryEntity.getCountryId());
		countryModel.setCountryCode(countryEntity.getCountryCode());
		countryModel.setCountryName(countryEntity.getCountryName());
		
		return countryModel;

	}

}
