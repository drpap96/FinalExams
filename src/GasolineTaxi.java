
public class GasolineTaxi extends Taxi {
	
	 private int rezerbouar;
	 private double katanalosi;
	 
	public GasolineTaxi(String arithmosK, String driverName,int r,double k) {
		super(arithmosK, driverName);
		rezerbouar=r;
		katanalosi=k;
		// TODO Auto-generated constructor stub
	}
	public double calcAutonomy() {
		double aut;
		aut=80*(rezerbouar/katanalosi);
		return aut;
		
		
	}
	
	 
	
	

}
