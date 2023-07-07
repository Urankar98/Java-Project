package ProjectModules;

public class TwoWheeler extends Vehicle {

	public TwoWheeler() {
		super("TwoWheeler", 20, 10);
	}

	@Override
	public int calculateToll(int numberOfPersons) throws InvalidNumberOfPersonsException {
		
		if(numberOfPersons<=0) {
			//System.out.println("Number Of Persons Cannot Be Zero");
			throw new InvalidNumberOfPersonsException();
		}
		
		int totalToll = basicToll;
		
		if(numberOfPersons>2 && numberOfPersons>0) {
			
			int extraCharge = (numberOfPersons-2)*extraCharges;
			totalToll = totalToll + extraCharge;
		}
		return totalToll;
	}

	
}
