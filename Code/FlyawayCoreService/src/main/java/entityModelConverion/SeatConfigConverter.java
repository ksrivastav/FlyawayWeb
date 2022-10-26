package entityModelConverion;

import model.Flight.SeatConfig;
import serviceDAO.Entity.Flight.SeatConfigEntity;

public class SeatConfigConverter {

	public static  SeatConfig convertEntityToModel (SeatConfigEntity seatConfigEntity)
	{
				
		SeatConfig seatConfigModel = new SeatConfig();
		seatConfigModel.setSeatConfigId(seatConfigEntity.getSeatConfigId());
		seatConfigModel.setSellableSeats(seatConfigEntity.getSellableSeats());
		seatConfigModel.setTotalSeats(seatConfigEntity.getTotalSeats());
		return seatConfigModel;
		
		
	}
	

	public static  SeatConfigEntity convertModelToEntity (SeatConfig seatConfigModel)
	{
				
		SeatConfigEntity seatConfigEntity = new SeatConfigEntity();
		seatConfigEntity.setSeatConfigId(seatConfigModel.getSeatConfigId());
		seatConfigEntity.setSellableSeats(seatConfigModel.getSellableSeats());
		seatConfigEntity.setTotalSeats(seatConfigModel.getTotalSeats());
		return seatConfigEntity;
		
		
	}

}
