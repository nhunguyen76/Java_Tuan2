package Bai1_6;

public class Account {
	String id,name;
	int balance;
	
	public Account(String id, String name) {
		this.id=id;
		this.name=name;
		this.balance=0;
	}
	
	public Account(String id, String name,int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount<=balance) balance-=amount;
		else System.out.print("Amount exceeded balance");
		return balance;
	}
	
	public int transferTo(Account another,int amount) {
		if(amount<=this.balance) {
			another.balance+=amount;
			this.balance-=amount;
		}
		else System.out.print("Amount exceeded balance");
		return this.balance;
	}
	
	public String toString() {
		return "Account[id="+id+",name="+name+",balance="+balance+"]";
	}
}
