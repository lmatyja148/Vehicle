package vehicle2;
import java.util.Arrays;

import javax.swing.ImageIcon; 
public class Model2 {
	private String BodyType; 
	private String ModelName;
	private String [] TrimPackage; 
	ImageIcon imgdodge = new ImageIcon("goatbutt.png");
	
	Model2(){
		BodyType = "Pickup";
		ModelName = "Ram";
		TrimPackage = new String[] {"Wheels", "4","MPG","15", "Color", "Blue", "Seats", "2","fuelcap","20", "tonage", "1.234" } ;
		
	}
	
	Model2(String Bt, String Mn,  String [] Tp){
		BodyType = Bt; 
		 ModelName = Mn;
		  TrimPackage = Tp; 
	}
	
	 public String getBodyType() {
		return BodyType;
	}



	@Override
	public String toString() {
		return "Model2 [BodyType = " + BodyType + ", ModelName = " + ModelName + ", TrimPackage = "
				+ Arrays.toString(TrimPackage) + "]";
	}

	public void setBodyType(String bodyType) {
		this.BodyType = bodyType;
	}



	public String getModelName() {
		return ModelName;
	}



	public void setModelName(String modelName) {
		this.ModelName = modelName;
	}



	public String[] getTrimPackage() {
		return TrimPackage;
	}



	public void setTrimPackage(String[] trimPackage) {
		this.TrimPackage = trimPackage;
	}


	public void getModel2() {
		new Popupwindow(imgdodge, toString());
		
	}

	


	
	

}
