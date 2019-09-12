package vehicle2;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.text.SimpleDateFormat; 





 public class Maker2 {
	

		String Company; 
		  Date mintDate;
		   String PlantLocation; 
		   ImageIcon logo; 
		  int ContactInfo; 
		 String webSite; 
		
		 
	 Maker2() {
		Company = "Dodge";
		 try {  mintDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-31");}
		  catch (Exception e) {;}
		   PlantLocation = "Conway, Ar"; 
			logo = new ImageIcon("dodgelogo.jpg"); 
		     ContactInfo = 999999999;
		      String WebSite = "mopar.com"; 
	}     
	 

	 {
			JPanel pnl = new JPanel();

			ClassLoader ldr = this.getClass().getClassLoader();

			ImageIcon logo = new ImageIcon( ldr.getResource("dodgelogo.jpg"));

			
			
			JLabel lbl1 = new JLabel( "ram" ) ;
			JLabel lbl2 = new JLabel( "doge 1500" ) ;
			//JLabel lbl3 = new JLabel( "dodge", dodge, JLabel.CENTER ) ;

			 void logo()
			{
				super("Swing Window");
				setSize( 500,200 );
				setDefaultCloseOperation( EXIT_ON_CLOSE );
				add(pnl);

				//lbl3.setHorizontalTextPosition(JLabel.CENTER);
				//lbl3.setVerticalTextPosition(JLabel.BOTTOM);
				

				lbl1.setToolTipText( "Mopar" ) ;
				
				pnl.add( lbl1 ) ;
				pnl.add( lbl2 ) ;
				//pnl.add( lbl3 ) ;

				setVisible( true );
			

			
			
			}
			 
		

		    
	 Maker2(String c, Date md, ImageIcon lg, int ci, String ws) {
		Company = c; 
		 mintDate = md;
		  logo = lg; 
		   ContactInfo = ci; 
			webSite = ws; 
				
		

	 }



	public void setCompany(String company) {
		Company = company;
	}



	public void setMintDate(Date mintDate) {
		this.mintDate = mintDate;
	}



	public void setPlantLocation(String plantLocation) {
		PlantLocation = plantLocation;
	}



	public void setlogo(ImageIcon logo) {
		this.logo = logo;
	}



	public void setContactInfo(int contactInfo) {
		ContactInfo = contactInfo;
	}



	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	

	}
		



