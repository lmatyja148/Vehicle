package vehicle2;


public class Auto extends V2 {
	private String Owner; 
	 private String Title; 
	  private boolean Trunk; 
	   private boolean AC ; 
	  private boolean Tint; 
	 private Maker2 autoMaker; 
	private Model2 autoModel; 
	
	
     Auto(){
    	 super(); 
    	
     
		Owner = "Luke" ;
		 Title = "Held" ;
		  Trunk = true; 
		   AC = true ; 
		  Tint = false; 
		 autoMaker = new Maker2();
		autoModel = new Model2() ; 
		    updateVehicle(); 
		      
		     
		     
	}
     Auto(int p, int f, int m, Maker2 Ll, Model2 Mm) {
    	 super(p,f,m);
    	  autoMaker = Ll; 
    	   autoModel = Mm; 
    	   Owner = "Luke" ;
  		    Title = "Held" ;
  		   Trunk = true; 
  		  AC = true ; 
  		 Tint = false; 
    	   updateVehicle(); 
     }
     Auto(int p, int f, int m, Maker2 Ll, Model2 Mm, int d, int t, int w, int y, int z, String c){
    	 autoMaker = Ll; 
  	      autoModel = Mm; 
  	        Owner = "Luke" ;
		    Title = "Held" ;
		   Trunk = true; 
		  AC = true ; 
		 Tint = false;
		 	updateVehicle(); 
    	 
    	 
    	 
   }
	
	public Maker2 getAutoMaker() {
		return autoMaker;
	}

		public void setAutoMaker(Maker2 autoMaker) {
			this.autoMaker = autoMaker;
	}

		public Model2 getAutoModel() {
			return autoModel;
	}

			public void setAutoMode2(Model2 autoModel) {
				this.autoModel = autoModel;
	}

				public int getWheels() {
					String[] TrimPackage = autoModel.getTrimPackage();
						int wheelCount = 0;
					try {
						wheelCount = Integer.parseInt(TrimPackage[1]);
					}
					catch(Exception e ) {
						System.out.println("Bad Trim Pack");
					}
					return wheelCount; 
					}
	
	
				public int getDoors() {
					return super.doors;
	}

			public String getOwner() {
				return Owner;
	}

		public void setOwner(String owner) {
			Owner = owner;
	}

		public String getTitle() {
			return Title;
	}

			public void setTitle(String title) {
				Title = title;
	}

				public boolean isTrunk() {
					return Trunk;
	}

					public void setTrunk(boolean trunk) {
						Trunk = trunk;
	}

						public boolean isAC() {
							return AC;
	}

						public void setAC(boolean aC) {
							AC = aC;
	}	

					public boolean isTint() {
						return Tint;
	}

				public void setTint(boolean tint) {
					Tint = tint;
	}
	
			void getMakeandModel() {
				Tint = true; 
	} 
	
			private void updateVehicle() {
				String[] trmPak = autoModel.getTrimPackage();
				//"Wheels", "4","MPG","15", "Color", "Blue", "Seats", "2","fuelcap","20", "tonnage", "1.234"
				  int wCount, MPG, pass, fuelCap; 
				   double tonnage; 
				    String color = trmPak[5]; 
			
	
			try {
				wCount = Integer.parseInt(trmPak[1]);
				 MPG = Integer.parseInt(trmPak[3]);
				  pass = Integer.parseInt(trmPak[7]);
				   fuelCap = Integer.parseInt(trmPak[9]);
			}
			catch (Exception e) {
				wCount = 4;
				 MPG = 20;
				  pass = 4;
				   fuelCap = 20;
				    System.out.println("BAD TRIM PACK");
			}
			try { 
				tonnage = Double.parseDouble(trmPak[11]);
			}
			catch (Exception e) {
				tonnage = .75;
				 System.out.println("BAD TRIM PACK");
			}
			}
	

}
