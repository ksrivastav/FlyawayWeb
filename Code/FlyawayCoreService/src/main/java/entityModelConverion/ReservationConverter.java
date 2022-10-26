package entityModelConverion;

import model.Reservation.Reservation;
import serviceDAO.Entity.Reservation.ReservationEntity;

public class ReservationConverter {


	public static Reservation convertEntityToModel(ReservationEntity resEntity)
	{
		Reservation reservationModel = new Reservation();
		
		reservationModel.setBookingCreationDateTime(resEntity.getBookingCreationDateTime());
		reservationModel.setBookingStatusId(resEntity.getBookingStatusId());		
		reservationModel.setBookingUpdateDateTime(resEntity.getBookingUpdateDateTime());
		reservationModel.setMemberAccountId(resEntity.getMemberAccountId());
		reservationModel.setReservationId(resEntity.getReservationId());
		
		return reservationModel;
		
	}
	
	public static ReservationEntity convertModelToEntity(Reservation reservationModel)
	{
		ReservationEntity resEntity = new ReservationEntity() ;	
		resEntity.setBookingCreationDateTime(reservationModel.getBookingCreationDateTime());
		
		resEntity.setBookingStatusId(reservationModel.getBookingStatusId());		
		resEntity.setBookingUpdateDateTime(reservationModel.getBookingUpdateDateTime());
		resEntity.setMemberAccountId(reservationModel.getMemberAccountId());
		resEntity.setReservationId(reservationModel.getReservationId());
		
		return resEntity;
	}
}
