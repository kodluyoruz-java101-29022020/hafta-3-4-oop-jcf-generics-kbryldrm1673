package insurance;

import java.util.Date;

public abstract class Insurance {

	private String insuranceName;
	private double insuranceCharge;
	private Date startingDate;
	private Date finishDate;
	
	
	public Insurance() {
	
		
	}
	
	public Insurance(String insuranceName, double insuranceCharge, Date startingDate, Date finishDate) {
		super();
		this.insuranceName = insuranceName;
		this.insuranceCharge = insuranceCharge;
		this.startingDate = startingDate;
		this.finishDate = finishDate;
	}
	
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public double getInsuranceCharge() {
		return insuranceCharge;
	}
	public void setInsuranceCharge(double insuranceCharge) {
		this.insuranceCharge = insuranceCharge;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	

	public double calculate(Insurance insurance) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

}
