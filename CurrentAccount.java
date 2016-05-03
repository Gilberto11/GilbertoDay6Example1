
public class CurrentAccount extends Account{
	
	private int numOfCards;
	private double overDraft;
	private String pinNumber;
	
	public CurrentAccount(){
		super();
	}
	
	public CurrentAccount(String n, double b, String an, String sc, int nc, double od, String pn){
		super(n,b,an,sc);
		numOfCards = nc;
		overDraft = od;
		pinNumber = pn;
		
	
		
	}
	
	public int getNumOfCards(){
		return numOfCards;
	}
	
	public void setNumOfCards(int nc){
		numOfCards = nc;
		
	}
	
	public double getOverDraft(){
		return overDraft;
	}
	
	public void setOverDraft(double od){
		overDraft = od;
		
	}
	
	public String getPinNumber(){
		return pinNumber;
		
	}
	
	public void setPinNumber(String pn){
		pinNumber = pn;
		
	
	}
	
	public String toString(){
		String s= super.toString();
		s += "Number of Cards: " + numOfCards+ "\n";
		s += "Overdraft:" + overDraft;
		s += "Pin Number: " + pinNumber;
		return s;
		
		
	}
	
	@Override 
	// if ya choose to fix the problem of balance with protected class, for maintenance later on will be hard to see that problem
	
	public double availableFunds(){
		return getBalance() + overDraft;
		
	}

	@Override
	public double getEndOfYearBalance() {
		// TODO Auto-generated method stub
		double b = getBalance();
		if (overDraft > 0){
			b -= 200; // subtract 200 if they have an overdraft
		}
		
		if (numOfCards > 0){
			b -= (30*numOfCards); // subtract 30 per card
		}
		
		return b;
		
	}

}
