package insuranceKind;

import java.util.Date;

import insurance.Insurance;

public class HealthInsurance extends Insurance{
	

	@Override
	public double calculate(Insurance insurance) {
		System.out.println("Sa�l�k Sigortas�");
		return 0;
	}

}
