package entityModelConverion;

import model.Member.Passenger;
import serviceDAO.Entity.Member.PassengerEntity;

public class PassengerConverter {

	public static PassengerEntity convertModelToEntity(Passenger passenger)
	{
		
		PassengerEntity passEntity = new PassengerEntity();
		passEntity.setPassengerId(passenger.getPassengerId());
		passEntity.setFirstName(passenger.getFirstName());
		passEntity.setLastName(passenger.getLastName());
		passEntity.setAge(passenger.getAge());
		passEntity.setFlightid(passenger.getFlightid());
		passEntity.setPrefix(passenger.getPrefix());
		passEntity.setGender(passenger.getGender());
		passEntity.setMemberAccountId(passenger.getMemberAccountId());
		passEntity.setReservationId(passenger.getReservationId());
		return passEntity;
	}
	
	public static Passenger convertEntityTotModel(PassengerEntity passEntity)
	{
		
		Passenger passenger = new Passenger();
		passenger.setPassengerId(passEntity.getPassengerId());
		passenger.setFirstName(passEntity.getFirstName());
		passenger.setLastName(passEntity.getLastName());
		passenger.setAge(passEntity.getAge());
		passenger.setFlightid(passEntity.getFlightid());
		passenger.setPrefix(passEntity.getPrefix());
		passenger.setGender(passEntity.getGender());
		passenger.setMemberAccountId(passEntity.getMemberAccountId());
		passenger.setReservationId(passEntity.getReservationId());
		return passenger;
	}

}
