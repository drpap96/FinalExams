import java.util.ArrayList;

public class Fleet {

	
	private  String townName;
	private ArrayList<Taxi> taxi = new ArrayList<Taxi>(); //gia tin anaparastasi ton taksi 

	public Fleet(String townName) {
		this.townName = townName;
	}
	
	public void addOneTaxi(Taxi t) {
		taxi.add(t);
	}

	public String getTownName() {
		return townName;
	}
	public ArrayList<Taxi> getTaxi(){
		return taxi;
	}
	
	
}
