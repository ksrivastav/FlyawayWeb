package entityModelConverion;

import model.Reservation.TravelerItinerary;
import serviceDAO.Entity.Reservation.TravelerItineraryEntity;

public class TravelerItineraryConverter {


	
	public static TravelerItinerary convertEntityToModel(TravelerItineraryEntity travelerItineraryEntity)
	{
		TravelerItinerary travelerItineraryModel = new TravelerItinerary();
		
		travelerItineraryModel.setBoardedFlag(travelerItineraryEntity.isBoardedFlag());
		travelerItineraryModel.setboardedNumber(travelerItineraryEntity.getboardedNumber());
		travelerItineraryModel.setCheckedInFlag(travelerItineraryEntity.isCheckedInFlag());
		travelerItineraryModel.setFlightId(travelerItineraryEntity.getFlightId());
		travelerItineraryModel.setIsActive(travelerItineraryEntity.getIsActive());
		travelerItineraryModel.setPasengerId(travelerItineraryEntity.getPasengerId());
		travelerItineraryModel.setReservationId(travelerItineraryEntity.getReservationId());
		travelerItineraryModel.setSeatNumber(travelerItineraryEntity.getSeatNumber());
		travelerItineraryModel.setTravelerItineraryId(travelerItineraryEntity.getTravelerItineraryId());
		travelerItineraryModel.setTravelerItineraryStatusId(travelerItineraryEntity.getTravelerItineraryStatusId());
		
		return travelerItineraryModel ;
		
	}
	
	public static TravelerItineraryEntity convertModelToEntity(TravelerItinerary travelerItineraryModel)
	{
		TravelerItineraryEntity travelerItineraryEntity = new TravelerItineraryEntity();
		
		travelerItineraryEntity.setBoardedFlag(travelerItineraryModel.isBoardedFlag());
		travelerItineraryEntity.setboardedNumber(travelerItineraryModel.getboardedNumber());
		travelerItineraryEntity.setCheckedInFlag(travelerItineraryModel.isCheckedInFlag());
		travelerItineraryEntity.setFlightId(travelerItineraryModel.getFlightId());
		travelerItineraryEntity.setIsActive(travelerItineraryModel.getIsActive());
		travelerItineraryEntity.setPasengerId(travelerItineraryModel.getPasengerId());
		travelerItineraryEntity.setReservationId(travelerItineraryModel.getReservationId());
		travelerItineraryEntity.setSeatNumber(travelerItineraryModel.getSeatNumber());
		travelerItineraryEntity.setTravelerItineraryId(travelerItineraryModel.getTravelerItineraryId());
		travelerItineraryEntity.setTravelerItineraryStatusId(travelerItineraryModel.getTravelerItineraryStatusId());
		
		return travelerItineraryEntity ;
		
	}

}
