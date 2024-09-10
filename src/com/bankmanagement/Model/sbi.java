package com.bankmanagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class sbi {

	String bname;
	String branch;
	String Accountholder;
	@Id
	int Accountno;
	int balance;
	public sbi(String bname, String branch, String accountholder, int accountno, int balance) {
		super();
		this.bname = bname;
		this.branch = branch;
		Accountholder = accountholder;
		Accountno = accountno;
		this.balance = balance;
	}
	public sbi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccountholder() {
		return Accountholder;
	}
	public void setAccountholder(String accountholder) {
		Accountholder = accountholder;
	}
	public int getAccountno() {
		return Accountno;
	}
	public void setAccountno(int accountno) {
		Accountno = accountno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "sbi [bname=" + bname + ", branch=" + branch + ", Accountholder=" + Accountholder + ", Accountno="
				+ Accountno + ", balance=" + balance + "]";
	}
	
}
