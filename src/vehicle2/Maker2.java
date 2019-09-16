package vehicle2;
import java.util.Date;
import javax.swing.ImageIcon;
import java.text.SimpleDateFormat; 




 public class Maker2 {

	 	ImageIcon imgdodge = new ImageIcon("dodgelogo.png");
		String Company; 
		  Date mintDate;
		   String PlantLocation; 
		   ImageIcon logo; 
		  
		 @Override
		public String toString() {
			return "Maker2 Company = " + Company + ", mintDate = " + mintDate + ", PlantLocation = " + PlantLocation
					+ ", ContactInfo = " +  ", webSite = " + webSite + ", phone = " + phone + "||";
		}

		String webSite; 
		String phone; 
		 
	 Maker2() {
		Company = "Dodge";
		 try {  mintDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-31");}
		  catch (Exception e) {;}
		   PlantLocation = "Conway, Ar"; 
			logo = imgdodge; 
		     phone = "514-885-5925";
		       webSite = "http://www.mopar.com"; 
		       
	}     
	 
	 	Maker2(String co, String pl, String ws, String pn, Date md, ImageIcon lgo) {
	 		Company = co; 
	 		PlantLocation = pl;
	 		  webSite = ws;
	 		 phone = pn;
	 		mintDate = md; 
	 	   logo = lgo; 
	 	}
	 
		

	 



/*(	public void setCompany(String company) {
		Company = company;




	public void setMintDate(Date mintDate) {
	//	this.mintDate = mintDate;
	



	/*public void setPlantLocation(String plantLocation) {
	//	PlantLocation = plantLocation;
*/	



	ImageIcon getLogo() {
		return logo;
	}
	
	public void getMake() {
			//new Popupwindow(logo, Company, mintDate, PlantLocation, webSite, phone); 
			new Popupwindow(logo, toString()); 
	
	}

	/*public void setContactInfo(int contactInfo) {
		ContactInfo = contactInfo;
	}



	public void setWebSite(String webSite) {
		//this.webSite = webSite;
	}*/
	

	}
		



