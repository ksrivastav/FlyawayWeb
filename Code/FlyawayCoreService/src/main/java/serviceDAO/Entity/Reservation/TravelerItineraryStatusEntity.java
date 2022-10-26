package serviceDAO.Entity.Reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TravelerItineraryStatus")
public class TravelerItineraryStatusEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TravelerItineraryStatusId")
	private int travelerItineraryStatusId;
	
	@Column(name="TravelerItineraryStatusCode")
	private String travelerItineraryStatusCode;
	
	@Column(name="TravelerItineraryStatusDesc")
	private String travelerItineraryStatusDesc;
	
	

	public TravelerItineraryStatusEntity() {
		// TODO Auto-generated constructor stub
	}



	public int getTravelerItineraryStatusId() {
		return travelerItineraryStatusId;
	}



	public void setTravelerItineraryStatusId(int travelerItineraryStatusId) {
		this.travelerItineraryStatusId = travelerItineraryStatusId;
	}



	public String getTravelerItineraryStatusCode() {
		return travelerItineraryStatusCode;
	}



	public void setTravelerItineraryStatusCode(String travelerItineraryStatusCode) {
		this.travelerItineraryStatusCode = travelerItineraryStatusCode;
	}



	public String getTravelerItineraryStatusDesc() {
		return travelerItineraryStatusDesc;
	}



	public void setTravelerItineraryStatusDesc(String travelerItineraryStatusDesc) {
		this.travelerItineraryStatusDesc = travelerItineraryStatusDesc;
	}



	@Override
	public String toString() {
		return "TravelerItineraryStatus [travelerItineraryStatusId=" + travelerItineraryStatusId
				+ ", travelerItineraryStatusCode=" + travelerItineraryStatusCode + ", travelerItineraryStatusDesc="
				+ travelerItineraryStatusDesc + "]";
	}
	
	

}
