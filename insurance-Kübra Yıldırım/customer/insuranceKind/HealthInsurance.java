package insuranceKind;

import java.util.Date;

import insurance.Insurance;

public class HealthInsurance extends Insurance{
	

	@Override
	public double calculate(Insurance insurance) {
		System.out.println("Saðlýk Sigortasý");
		return 0;
	}

}
