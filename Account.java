
public abstract class Account {
	
	private String name;
	private double balance;
	private String accountNumber;
	private String sortCode;
	
	public Account(){
		//empty constructor
		
	
	}
	
	public Account(String n, double b, String an, String sc){
		name = n;
		balance = b;
		accountNumber = an;
		sortCode = sc;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	public void setName(String n){
		name = n;
	}
	
	public double getBalance(){
		return balance;
		
	}
	
	public void setBalance(double b){
		balance = b;
		
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(String an){
		accountNumber = an;
		
	}
	
	public String getSortCode(){
		return sortCode;
		
	}
	
	public void setSortCode(String sc){
		sortCode = sc;
		
	}
	@Override
	public String toString(){
		String s = "";
		s += "Accopunt Number: " + accountNumber;
		s += "Account Name: " + name;
		s += "Account Sort Code: " + sortCode;
		s += String.format("Balance: %8.2f\n", + balance);
		s += String.format("Available Funds: %.2f\n", + availableFunds());
		return s;
	}
	
	public double availableFunds(){
		return balance;
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract double getEndOfYearBalance();
	
	
	
	

}
