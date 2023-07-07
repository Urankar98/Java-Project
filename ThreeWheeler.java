package ProjectModules;

public class ThreeWheeler extends Vehicle {

	public ThreeWheeler() {
		super("ThreeWheeler", 30, 20);
	}

	@Override
	public int calculateToll(int numberOfPersons) {
		
		if(numberOfPersons<=0) {
			System.out.println("Number Of Persons Cannot Be Zero");
		}
		
		int totalToll = basicToll;
		
		if(numberOfPersons>3 && numberOfPersons>0) {
			
			int extraCharge = (numberOfPersons-3)*extraCharges;
			totalToll = totalToll+extraCharge;
		
	}
		return totalToll;
}
}
