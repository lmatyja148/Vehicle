package vehicle2;






public class Makerdemo2 {	
	
	public static void main (String [] args) {
		
		Model2 mo1 = new Model2();
		Maker2 mal = new Maker2();
		
			mo1.setTrimPackage(new String[] {"Wheels", "4","MPG","12", "Color", "Yellow", "Seats", "3","fuelcap","21", "tonage", "4.111" }) ;
		
		Auto truck = new Auto(5,2019,140,mal,mo1); 
		Auto car = new Auto(); 
		car.getMakeandModel(); 
		
		Makerdemo2 gui = new Makerdemo2(); 
		
		
		 System.out.println("The size of your tires are " + truck.tireSize); 
		
		  System.out.println(truck.color ); 
		   
		  System.out.println(truck.hornSound );
		 
		  	System.out.println(truck);
		  	System.out.println(car);
		   
	}
	

	 
		
		
		
		
		 
	}



