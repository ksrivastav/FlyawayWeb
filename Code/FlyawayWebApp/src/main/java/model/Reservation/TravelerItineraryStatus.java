package model.Reservation;

public class TravelerItineraryStatus {
	
	private int travelerItineraryStatusId;
	private String travelerItineraryStatusCode;
	private String travelerItineraryStatusDesc;
	
	

	public TravelerItineraryStatus() {
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
