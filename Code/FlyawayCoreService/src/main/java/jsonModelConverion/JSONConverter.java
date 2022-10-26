package jsonModelConverion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONArray;




public class JSONConverter <T> {

	public JSONConverter() {
		// TODO Auto-generated constructor stub
	}
	
	private static Gson getGSonObject()
	{
		 GsonBuilder gsonBuilder = new GsonBuilder();
	        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerialize());
	        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserialize());
	        
	        Gson gson = gsonBuilder.setPrettyPrinting().setDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz").create();
		
		return gson;
		
	}
	
	public  <T> JSONObject  modelToJSON(T obj)
	{
		Gson gson= getGSonObject();
		String jsonInString = gson.toJson(obj);		 
		JSONObject mJSONObject =  new JSONObject(jsonInString);  
		return mJSONObject;
		
	}
	
	public  JSONArray listToJSON(ArrayList<T> obj)
	{
		Gson gson= getGSonObject();
	    String jsonInString = gson.toJson(obj);	
	    System.out.println(jsonInString);
		JSONArray jsonArray = new JSONArray(jsonInString);
		return jsonArray;
		
	}

}
