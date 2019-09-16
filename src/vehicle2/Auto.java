package vehicle2;

import javax.swing.ImageIcon;

public class Auto extends V2 {
	private String Owner  ; 
	 private String Title  ; 
	  private boolean Trunk  ; 
	  ImageIcon logo; 
	   private boolean AC ; 
	  private boolean Tint; 
	 private Maker2 autoMaker; 
	private Model2 autoModel; 
	static Model2 fashow = new Model2();
	static String[] packageOP = fashow.getTrimPackage();
	ImageIcon imgdodge = new ImageIcon("goatbutt.png");
	
	
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

		@Override
		public String toString() {
			return "Auto [Owner=" + Owner + ", Title=" + Title + ", Trunk=" + Trunk + ", AC=" + AC + ", Tint=" + Tint
					+ ",\n autoMaker=" + autoMaker + ",\n autoModel=" + autoModel + "]";
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
				autoMaker.getMake();
				autoModel.getModel2();
	} 
			

				
			
			 void updateVehicle() {
				String[] trmPak = autoModel.getTrimPackage();
				try {
				Integer.parseInt(trmPak[1]);
				 Integer.parseInt(trmPak[3]);
				  Integer.parseInt(trmPak[7]);
				   Integer.parseInt(trmPak[9]);
			}
			catch (Exception e) {
				System.out.println("BAD TRIM PACK");
			}
			try { 
				Double.parseDouble(trmPak[11]);
			}
			catch (Exception e) {
				System.out.println("BAD TRIM PACK");
			}
			}
	

}
