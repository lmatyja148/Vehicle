package vehicle;

			
		
	public class vehicleLUKE {
		public static void main (String [] args) {
			// construct complete vehicles
			Automobile minivan = new Automobile (6,17,15) ;
			 Automobile sportscar = new Automobile (2,15,18) ;
			   String hornSound = " aruuuga " ;
			    
			  double gallons;
			   double refillnumber;
			    int dist = 252; 
			     gallons = minivan.fuelneeded(dist); 
				 
				
				 
				 
				 
			
			   System.out.println(" to go "  +  dist  +  " miles minivan needs " +  gallons +  " gallons of fuel. "  );
				gallons = sportscar.fuelneeded(dist);
			
			     System.out.println(" To go " + dist +  " miles sportscar needs " +  gallons + " gallons of fuel. ") ;
		          gallons = minivan.fuelneeded(dist); 
			
			        System.out.println (" To go " + dist  + " the minivan will use up " +  minivan.refuel(dist) + " of tank." );
			
			         System.out.println (" To go " + dist  + " the sportscar will use up " +  sportscar.refuel(dist) + " of tank.") ;
					 
					   
					   
				
					  
						System.out.println(minivan.hornSound()) ; 
						
							System.out.println(hornSound); 
						
								System.out.println(minivan.brake()); 
						
									System.out.println(minivan.startCar("this key") ? "woot woot you win" : "Bum bum bummmmm you fail"); //CHARLES ADDED

										System.out.println(minivan.startCar(" 1234 ") ? "woot woot you win" : "Bum bum bummmmm you fail"); //CHARLES ADD
						
			 
				
		
				}
			
			}
			
			
	
			