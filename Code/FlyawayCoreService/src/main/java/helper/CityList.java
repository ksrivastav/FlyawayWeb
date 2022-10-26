package helper;

import java.util.ArrayList;
import java.util.HashMap;

import model.MasterData.City;

public class CityList {

	private static HashMap<Integer, City> cityList = new HashMap<Integer, City>();
	private static ArrayList<City> cityArrayList = new ArrayList<City>();
	public CityList() {
		// TODO Auto-generated constructor stub
	}
	public static HashMap<Integer, City> getCityList() {
		return cityList;
	}
	
	public static ArrayList<City> getCityArrayList() {
		return cityArrayList;
	}
	
	public static void setCityList(HashMap<Integer, City> cityList) {
		CityList.cityList = cityList;
	}
	
	public static void setCityArrayList(ArrayList<City>  cityList) {
		CityList.cityArrayList  = cityList;
	}
	
	
	public static void addCity(City city)
	{
		cityList.put(city.getCityId(), city);
		//cityArrayList.add(city);
	}
	
	public static City getCity(int cityCodeid)
	{
		 return cityList.get(cityCodeid);
	}
	
	public City getCityById(int cityCodeId)
	{
		
		
		City city = cityList.get(cityCodeId);
		
		return  city;
	}
	
	

}
