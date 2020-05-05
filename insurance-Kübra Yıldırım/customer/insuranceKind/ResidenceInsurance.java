package insuranceKind;

import java.util.Date;

import insurance.Insurance;

public class ResidenceInsurance extends Insurance{

	
	@Override
	public double calculate(Insurance insurance) {
		System.out.println("Ev sigortasý");
		return 0;
	}
	

}
