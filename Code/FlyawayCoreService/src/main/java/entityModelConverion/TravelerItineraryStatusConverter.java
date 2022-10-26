package entityModelConverion;

import model.Reservation.TravelerItineraryStatus;
import serviceDAO.Entity.Reservation.TravelerItineraryStatusEntity;

public class TravelerItineraryStatusConverter {

	public static  TravelerItineraryStatus convertEntityToModel (TravelerItineraryStatusEntity travelerItineraryStatusEntity)
	{
				
		TravelerItineraryStatus travelerItineraryStatusModel = new TravelerItineraryStatus();
		travelerItineraryStatusModel.setTravelerItineraryStatusCode(travelerItineraryStatusEntity.getTravelerItineraryStatusCode());
		travelerItineraryStatusModel.setTravelerItineraryStatusDesc(travelerItineraryStatusEntity.getTravelerItineraryStatusDesc());
		travelerItineraryStatusModel.setTravelerItineraryStatusId(travelerItineraryStatusEntity.getTravelerItineraryStatusId());
		return travelerItineraryStatusModel;
		
		
	}
	
	public static  TravelerItineraryStatusEntity convertModelToEntity ( TravelerItineraryStatus travelerItineraryStatusModel)
	{
				
		TravelerItineraryStatusEntity travelerItineraryStatusEntity = new TravelerItineraryStatusEntity();
		travelerItineraryStatusEntity.setTravelerItineraryStatusCode(travelerItineraryStatusModel.getTravelerItineraryStatusCode());
		travelerItineraryStatusEntity.setTravelerItineraryStatusDesc(travelerItineraryStatusModel.getTravelerItineraryStatusDesc());
		travelerItineraryStatusEntity.setTravelerItineraryStatusId(travelerItineraryStatusModel.getTravelerItineraryStatusId());
		return travelerItineraryStatusEntity;
		
		
	}


}
