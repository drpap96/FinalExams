
public class ElectricalTaxi extends Taxi {
	
	private int numOfb;

	public ElectricalTaxi(String arithmosK, String driverName,int n) {
		super(arithmosK, driverName);
		numOfb=n;
		
	}
	
	public double calcAutonomy() {
		double aut;
		aut=65*numOfb;
		return aut;
		
		
	}
	
	

}
