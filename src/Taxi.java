//Y–≈— À¡”«
public abstract  class Taxi {
	private String arithmosK;
	private String driverName;
	
	
	public Taxi(String arithmosK, String driverName) {
		this.arithmosK = arithmosK;
		this.driverName = driverName;
	}
	public abstract double calcAutonomy() ;
	/**
	 * @return the arithmosK
	 */
	public String getArithmosK() {
		return arithmosK;
	}
	/**
	 * @param arithmosK the arithmosK to set
	 */
	public void setArithmosK(String arithmosK) {
		this.arithmosK = arithmosK;
	}
	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}
	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
	
	
	
	
	
	
}



