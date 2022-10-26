package helper;

import java.util.ArrayList;
import java.util.HashMap;

import model.MasterData.Country;


public class CountryList {

	private static HashMap<Integer, Country> countryList = new HashMap<Integer, Country>();
	private static ArrayList<Country> countryArrayList = new ArrayList<Country>();
	
	public CountryList() {
		// TODO Auto-generated constructor stub
	}
	
	public static HashMap<Integer, Country> getCountryList() {
		return countryList;
	}
	
	public static ArrayList<Country> getCountryArrayList() {
		return countryArrayList;
	}
	
	public static void setCountryArrayList(ArrayList<Country> arrayListCountry) {
		countryArrayList = arrayListCountry;
	}
	

	public static void addCountry(Country country ) {
		countryList.put(country.getCountryId(), country);
		countryArrayList.add(country);
	}
	
	public static Country getCountry(int countryCodeid)
	{
		 return countryList.get(countryCodeid);
	}
	
	
	public static int getCountryCode(int countryCodeId)
	{
		int countryCodeid;
		
		Country country = countryList.get(countryCodeId);
		
		countryCodeid = country.getCountryId();
		return countryCodeid;
	}
	

}
