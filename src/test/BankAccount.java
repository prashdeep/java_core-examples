package test;

public class BankAccount {
	
	private String firstName;
	private String lastName;
	private String address;
	private String bankAddress="456, Parks Avenue, NY";
	private double accountBalance;
	private String nominee;
	
	private static int numberOfBankAccounts = 0;
	

	public static int getNumberOfBankAccounts() {
		return numberOfBankAccounts;
	}

	public static void setNumberOfBankAccounts(int staticNumberOfBankAccounts) {
		numberOfBankAccounts = staticNumberOfBankAccounts;
	}

	public BankAccount(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		numberOfBankAccounts ++;
	}
	
	public BankAccount(String firstName, String lastName, double initialDeposit, String nominee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = initialDeposit;
		this.nominee = nominee;
		numberOfBankAccounts ++;
	}
	
	public void deposit(double amount) {
		this.accountBalance = this.accountBalance + amount;
	}
	
	public double withdraw(double amount) {
		if ( amount < accountBalance ) {
			this.accountBalance = this.accountBalance - amount;
			return amount;
		}
		return 0;
	}
	
	public double viewBalance() {
		return this.accountBalance;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public BankAccount(String firstName, String lastName, double initialDeposit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = initialDeposit;
		numberOfBankAccounts++;
	}
	
	public static void main(String[] args) {
		//Datatype variableName = new DataType();
		//default values
		/*
		 * int - 0
		 * float - 0.0
		 * double - 0.0
		 * long - 0
		 * boolean - false
		 * Object - null
		 * String - null
		 * 
		 */
		BankAccount myFirstAccount = new BankAccount("Pradeep" , "Kumar", 6000);
		System.out.println(BankAccount.getNumberOfBankAccounts());
		BankAccount mySecondAccount = new BankAccount("Praveen", "Paul", 5000);
		System.out.println(BankAccount.getNumberOfBankAccounts());
		BankAccount thirdAccount = new BankAccount("Pradeep", "Kumar");
		System.out.println(BankAccount.getNumberOfBankAccounts());
		BankAccount fourthAccount = new BankAccount("Vinay", "Stallin");
		System.out.println(BankAccount.getNumberOfBankAccounts());
		
		
		System.out.println(BankAccount.getNumberOfBankAccounts());
		
		//myFirstAccount.deposit(4500);
		//mySecondAccount.deposit(8000);
		
		//System.out.println(myFirstAccount.viewBalance());
		//System.out.println(mySecondAccount.viewBalance());
		
		//myFirstAccount.withdraw(2000);
		
		
		//System.out.println(myFirstAccount.viewBalance());
		//System.out.println(mySecondAccount.viewBalance());
	}
	
}
