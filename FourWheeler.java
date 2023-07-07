package ProjectModules;

public class FourWheeler extends Vehicle {

	public FourWheeler() {
		super("FourWheeler", 40, 40);
	}

	@Override
	public int calculateToll(int numberOfPersons) {
	
		if(numberOfPersons<=0) {
			System.out.println("Number Of Persons Cannot Be Zero");
		}
		
		int totalToll = basicToll;
		
		if(numberOfPersons>4 && numberOfPersons>0) {
			
			int extraCharge = (numberOfPersons-4)*extraCharges;
			totalToll = totalToll+extraCharge;
		
	}
		return totalToll;
}
}
