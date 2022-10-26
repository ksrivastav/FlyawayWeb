package requestHandler;

import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
import java.util.ArrayList;

import org.json.JSONObject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jsonModelConverion.JSONConverter;
import model.Flight.FlightMasterDataModel;
import model.MasterData.City;
import model.Member.AdminAccount;
import model.Member.DocumentType;
import model.Member.MemberAccount;
import model.Member.MemberAccountAddress;
import model.Member.MemberAccountContactDetail;
import model.Member.Passenger;
import model.Reservation.Reservation;
import serviceDAO.Entity.Flight.FlightMasterData;
import services.Flight.FlightService;
import services.Member.AdminAccountService;
import services.Member.DocumentTypeService;
import services.Member.MemberAccountAddressService;
import services.Member.MemberAccountContactDetailService;
import services.Member.MemberAccountService;
import services.Member.PassengerService;
import services.Reservation.ReservationService;

@Path("/member")
public class MemberRequestHandler {

	public MemberRequestHandler() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/newMemberAccount/firstName={firstName}&lastName={lastName}&email={email}&password={password}")
	@Produces(MediaType.TEXT_PLAIN)
	public String createMember(@PathParam("email") String email, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName,@PathParam("password") String password)
	{
		MemberAccount member= new MemberAccount();
		member.setEmail(email);
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setAccountStatusId(1);		
		member.setPassword(password);		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		member.setAccountCreationDateTime(now);
		MemberAccountService memberAccountService = new MemberAccountService();
		int id =memberAccountService.createMember(member);
		
		/*
		 * DocumentType docType = new DocumentType(); docType.setDocumentTypeCode("PP");
		 * docType.setDocumentTypeDesc("Passport"); DocumentTypeService docService = new
		 * DocumentTypeService(); int id2= docService .createDocumentType(docType);
		 */
		return Integer.toString(id);
		
		
	}
	
	@GET
	@Path("/newAdmin/email={email}&firstName={firstName}&lastName={lastName}&password={password}")
	@Produces(MediaType.TEXT_PLAIN)
	public String createAdmin(@PathParam("email") String email, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName,@PathParam("password") String password)
	{
		AdminAccount Admin= new AdminAccount();
		Admin.setEmail(email);
		Admin.setFirstName(firstName);
		Admin.setLastName(lastName);
		Admin.setAccountStatusId(1);		
		Admin.setPassword(password);
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		Admin.setAccountCreationDateTime(now);
		AdminAccountService AdminAccountService = new AdminAccountService();
		int id =AdminAccountService.createAdmin(Admin);
		
		/*
		 * DocumentType docType = new DocumentType(); docType.setDocumentTypeCode("PP");
		 * docType.setDocumentTypeDesc("Passport"); DocumentTypeService docService = new
		 * DocumentTypeService(); int id2= docService .createDocumentType(docType);
		 */
		return Integer.toString(id);
		
		
	}
	
	@GET
	@Path("/updateAdmin/email={email}&firstName={firstName}&lastName={lastName}&password={password}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateAdmin(@PathParam("email") String email, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName,@PathParam("password") String password)
	{
		int id=0;
		try
		{
			AdminAccountService adminAccountService = new AdminAccountService();
			AdminAccount admin= adminAccountService.getAdminAccount(email);		
			admin.setFirstName(firstName);
			admin.setLastName(lastName);
			admin.setAccountStatusId(1);		
			admin.setPassword(password);
			//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			admin.setAccountUpdateDateTime(now);
			AdminAccountService AdminAccountService = new AdminAccountService();
			id =AdminAccountService.updateAdmin(admin);
			
		}
		catch( Exception e)
		{
			System.out.println("Account Update failed-> "+ e.getMessage());
			return Integer.toString(id);
			
		}
		/*
		 * DocumentType docType = new DocumentType(); docType.setDocumentTypeCode("PP");
		 * docType.setDocumentTypeDesc("Passport"); DocumentTypeService docService = new
		 * DocumentTypeService(); int id2= docService .createDocumentType(docType);
		 */
		return Integer.toString(id);
		
		
	}
	
	@GET
	@Path("/getAdmin/email={email}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAdminAccountDetails(@PathParam("email") String email)
	{
	
		String adminAccountJSON ="";
		try
		{
			AdminAccountService adminAccountService = new AdminAccountService();
			AdminAccount admin= adminAccountService.getAdminAccount(email);	
			System.out.println(admin.toString());
			if (admin.getAdminAccountId()> 0)
			{
			JSONConverter<AdminAccount> jConv  = new JSONConverter<AdminAccount>();
			adminAccountJSON = jConv.modelToJSON(admin).toString();
			}
			
			System.out.println(adminAccountJSON);
			return adminAccountJSON;
		}
		catch( Exception e)
		{
			System.out.println("Account Update failed-> "+ e.getMessage());
			return "Account Update failed";
			
		}
	}
	
	
	
	@GET
	@Path("/loginAdmin/email={email}&password={password}")
	@Produces(MediaType.TEXT_PLAIN)
	public String loginAdmin(@PathParam("email") String email, @PathParam("password") String password)
	{
		
		AdminAccountService adminService = new AdminAccountService();
		System.out.println(email);
		AdminAccount adminAccount = adminService.getAdminAccount(email);
		System.out.println( adminAccount.getPassword());
		JSONConverter jConv  = new JSONConverter();
		if(adminAccount.getPassword().equals(password))
		{
			System.out.println(  jConv.modelToJSON(adminAccount).toString());
			return  jConv.modelToJSON(adminAccount).toString();
			
		}
		else
		{
			return "0";
		}
		
		
	}
	
	@GET
	@Path("/loginMemberAccount/email={email}&password={password}")
	@Produces(MediaType.TEXT_PLAIN)
	public String loginMemberAccount(@PathParam("email") String email, @PathParam("password") String password)
	{
		
		MemberAccount member= new MemberAccount();
				
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		member.setAccountCreationDateTime(now);
		MemberAccountService memberAccountService = new MemberAccountService();
		member =memberAccountService.getMemberAccount(email);
		 if(member.getPassword().equals(password))
		 {
			 JSONConverter<MemberAccount> jConv  = new JSONConverter<MemberAccount>();
			 return  jConv.modelToJSON(member).toString();
			 
		 }
		else
		{
			return "0";
		}
		
		
	}
	
	
	
	
	
	
	
	@GET
	@Path("/newMemberContact/email={email}&contactNum={contactNum}&contactTypeId={contactTypeId}&countryCodeId={countryCodeId}")
	public String createMemberContact(@PathParam("email") String email, @PathParam("contactNum") String contactNum, @PathParam("contactTypeId") String contactTypeId, @PathParam("countryCodeId") String countryCodeId)
	{
		int id=0;
		MemberAccountContactDetailService memberAccountContactDetailService= new MemberAccountContactDetailService(); 
		System.out.println("email---> "+email);
		MemberAccountService memberService = new MemberAccountService();
		try
		{
			MemberAccount memberAccount = memberService.getMemberAccount(email);
			
			System.out.println("member details : " + memberAccount.toString());

			System.out.println(email+ " "+ " "+ contactNum+ " "+ contactTypeId+ " "+ countryCodeId);
			  MemberAccountContactDetail memberAccountContact = new
			  MemberAccountContactDetail();
			  memberAccountContact.setContactNumber(Integer.parseInt(contactNum));
			  memberAccountContact.setContactTypeId(Integer.parseInt(contactTypeId));
			  memberAccountContact.setCountryCodeId(Integer.parseInt(countryCodeId));
			  memberAccountContact.setMemberAccountId(1);
			 id= memberAccountContactDetailService.CreateMemberAccountContactDetails(memberAccountContact); 
			 
			return Integer.toString(id);
			
		}
		catch(Exception c)
		{
			System.out.println(c.getMessage());
			return "failed";
		}
		
				
	}
	
	@GET
	@Path("/newMemberAddress/email={email}&addressLine1={addressLine1}&addressLine2={addressLine2}&addressLine3={addressLine3}&cityId={cityId}&countryId={countryId}")
	public String createMemberAddress(@PathParam("email") String email, @PathParam("addressLine1") String addressLine1 ,@PathParam("addressLine2") String addressLine2, @PathParam("addressLine3") String addressLine3,@PathParam("cityId") String cityId , @PathParam("countryId") String countryId )
	{ 
		int id=0;
		try {
		
		MemberAccountService memberService = new MemberAccountService();
		MemberAccount memberAccount = memberService.getMemberAccount(email);
		
		
		MemberAccountAddress memberAddress = new MemberAccountAddress();
		memberAddress.setMemberAccountId(memberAccount.getMemberAccountId());
		memberAddress.setAddressLine1(addressLine1);
		memberAddress.setAddressLine2(addressLine2);
		memberAddress.setAddressLine3(addressLine3);
		memberAddress.setCityId(Integer.parseInt(cityId));
		memberAddress.setCountryId(Integer.parseInt(countryId));
		MemberAccountAddressService memberAddressService = new MemberAccountAddressService();
		id =memberAddressService.createMemberAccountAddress(memberAddress);
		return Integer.toString(id);
		}
		catch(Exception e)
		{
			System.out.println("MemberAccountAddressCreation Failed: "+ e.getMessage());
			return Integer.toString(id);
		}
	}
		
		@GET
		@Path("/insertPassenger/memberAccountId={memberAccountId}&flightId={flightId}&prefix={prefix}&firstName={firstName}&lastName={lastName}&age={age}&gender={gender}&reservationId={reservationId}")
		public String insertPassenger(@PathParam("memberAccountId") int memberAccountId , @PathParam("flightId") int flightId, @PathParam("prefix") String prefix, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName,  @PathParam("age") int age,@PathParam("reservationId") int reservationId)
		{
			Passenger passenger = new Passenger();
			passenger.setFirstName(firstName);
			passenger.setLastName(lastName);
			passenger.setAge(age);
			passenger.setFlightid(flightId);
			passenger.setPrefix(prefix);
			passenger.setMemberAccountId(memberAccountId);
			passenger.setReservationId(reservationId);
			
			PassengerService pasService = new PassengerService();
			int id= pasService.createPassenger(passenger);
			return Integer.toString(id);
			
			
		}
		
		
		@GET
		@Path("/getMemberAccountDetails/email={email}")
		public String getMemberAccountDetails(@PathParam("email") String email)
		{
			
			MemberAccount member = new MemberAccount();
			MemberAccountService memberService = new MemberAccountService();
			member= memberService.getMemberAccount(email);
			
			
			JSONConverter<MemberAccount> jConv  = new JSONConverter<MemberAccount>();
			String memberText = jConv.modelToJSON(member).toString();
			return memberText;
		
		}
		
		@GET
		@Path("/getPassengersByBooking/reservationId={reservationId}")
		public String getPassengersByBooking(@PathParam("reservationId") int reservationId)
		{
			

			ArrayList<Passenger> passenger = new ArrayList<Passenger>();
			PassengerService passService = new PassengerService();
			passenger= passService.getPassengerByBooking(reservationId);
			
			
			JSONConverter<Passenger> jConv  = new JSONConverter<Passenger>();
			String memberText = jConv.listToJSON(passenger).toString();
			return memberText;
			
		}
		
		
	


}
