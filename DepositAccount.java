
public class DepositAccount extends Account{
	private int daysNotice;
	private double interestRate;
	
	public DepositAccount(){
		super(); // call the empty constructor of the Account object
		
	}
	
	public DepositAccount(String n, double b, String an, String sc, int dn, double ir){
		
		super(n,b,an,sc);
		daysNotice = dn;
		interestRate = ir;
		
		
	}
	
	public int getDaysNotice(){
		return daysNotice;
		
	}
	public void setDaysNotice(int dn){
		daysNotice = dn;
		
	}
	
	public double getInterestRate(){
		return interestRate;
		
		
	}
	public void setInterestRate(double ir){
		interestRate = ir;
		
	}
	// Override a method is when a method in a subclass over write a method in the super class
	@Override
	public String toString(){
		String s = super.toString();
		s += "Days Notice: " + daysNotice+ "\n";
		s += String.format("Interest Rate: %.3f %%\n", interestRate);
		return s;
	}

	@Override
	public double getEndOfYearBalance() {
		
		return getBalance() + (getBalance() * interestRate) / 100;
	}

	
}
