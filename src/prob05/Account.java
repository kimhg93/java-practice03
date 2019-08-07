package prob05;

public class Account {
	private String accountNo;
	private int balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	public Account(String accountNum) {
		setAccountNo(accountNum);
		System.out.println(accountNum+" 계좌가 개설되었습니다.");
	}
	
	public int save(int money) {
		setBalance(money);
		System.out.println(getAccountNo()+" 계좌에" +money+" 만원이 입금되었습니다.");
		return 0;
	}
	public int deposit(int money) {
		setBalance(money);
		System.out.println(getAccountNo()+" 계좌에" +money+" 만원이 출금되었습니다.");
		return 0;
	}
}
