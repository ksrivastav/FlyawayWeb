package entityModelConverion;

import model.Flight.Aircraft;
import serviceDAO.Entity.Flight.AircraftEntity;

public class AircraftConverter {

	
		public static  Aircraft convertEntityToModel (AircraftEntity aircraftEntity)
		{
					
			Aircraft aircraftModel = new Aircraft();
			aircraftModel.setAircraftId(aircraftEntity.getAircraftId());
			aircraftModel.setAircraftType(aircraftEntity.getAircraftType());
			aircraftModel.setseatConfigId(aircraftEntity.getseatConfigId());
			return aircraftModel;
			
			
		}
		

		public static  AircraftEntity convertModelToEntity (Aircraft aircraftModel)
		{
					
			AircraftEntity aircraftEntity = new AircraftEntity();
			aircraftEntity.setAircraftId(aircraftModel.getAircraftId());
			aircraftEntity.setAircraftType(aircraftModel.getAircraftType());
			aircraftEntity.setseatConfigId(aircraftModel.getseatConfigId());
			return aircraftEntity;
						
		}
}
