
public class Example1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account a1 = new Account();
		//Account a2 = new Account("Mary Jones", 340.0, "77665543", "92-43-55");
		//a1.display();
		//a2.display();
		
		DepositAccount da1= new DepositAccount("George Murphy", 3400.0, "5544334", "93-23-44", 1, 0.5);
		da1.display();
		//da1.display();
		
		CurrentAccount ca1= new CurrentAccount("Lisa Kelly", 890.40, "8877665", "93-45-66", 2, 1000.0, "3456");
		//ca1.display
		
		Account[] myAccounts = {da1,ca1};
		
		for (int i=0; i<myAccounts.length; i++){
			System.out.println(myAccounts[i]);
			System.out.println("EYB: " + myAccounts[i].getEndOfYearBalance());
		}
		doStuffCA(ca1);
		for (int i=0; i<myAccounts.length;i++){
			//if the Account object reference is pointing to a Current Account object
			if (myAccounts[i] instanceof CurrentAccount){
				//then create a reference to a CurrentAcount object by casting it
				CurrentAccount ca = (CurrentAccount)myAccounts[i];
				doStuffCA(ca);			
				
		}		
		else if (myAccounts[i] instanceof DepositAccount){
			DepositAccount da = (DepositAccount)myAccounts[i];
			doStuff(da);
			
		}

	}
	for (int i=0; i<myAccounts.length; i++){
		doStuff(myAccounts[i]);
	
	
	}

}
public static void doStuff(Account a){
	System.out.println(a);
	System.out.println(a.getEndOfYearBalance());
}
public static void doStuffCA(CurrentAccount ca){
	System.out.println(ca);
	System.out.println(ca.getEndOfYearBalance());
}
public static void doStuff(DepositAccount da){
	System.out.println(da);
	System.out.println(da.getEndOfYearBalance());
}
}
