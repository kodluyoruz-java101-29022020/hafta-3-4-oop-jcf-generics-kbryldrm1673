package insuranceKind;

import java.util.Date;

import insurance.Insurance;

public class TravelInsurance extends Insurance{
	

	@Override
	public double calculate(Insurance insurance) {
		System.out.println("Seyahat Sigortas�");
		return 0;
	}

}
