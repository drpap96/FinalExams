import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fleet> fleet = new ArrayList<Fleet>(); //για την αποθηκευση των 2 στολων ταξι.
	//ΑΝΤΙΚΕΙΜΕΝΑ ΤΥΠΟΥ FLEET:
		Fleet taxi1= new Fleet("Patra");
		Fleet taxi2 = new Fleet("Korinthos");
		
		Taxi e1= new ElectricalTaxi("XSA123","PapadopoulouDionsiaRafaela",5);
		Taxi e2= new ElectricalTaxi("NMI122","Eleftheriou",8);
		
		Taxi g1= new GasolineTaxi("FDC123","Papadopoulou",20,5.1);
		Taxi g2= new GasolineTaxi("FEO902","POLIXENOU",18,4.2);
		
		taxi1.addOneTaxi(e1);
		taxi1.addOneTaxi(g1);
		
		taxi2.addOneTaxi(e2);
		taxi2.addOneTaxi(g2);
		//da
		fleet.add(taxi1);
		fleet.add(taxi2);
		
		new GUI(fleet);
		

	}

}
