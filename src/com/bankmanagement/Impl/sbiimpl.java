package com.bankmanagement.Impl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.usertype.UserType;

import com.bankmanagement.Configuration.config;
import com.bankmanagement.Model.sbi;
import com.bankmanagement.Unimpl.bankunimpl;

public class sbiimpl implements bankunimpl{
	public void CreateAccount() {
		// TODO Auto-generated method stub
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
		//inserted data
		sbi s1=new sbi();
		s1.setBname("sbi");
		s1.setBranch("pune");
		s1.setAccountholder("pawan");
		s1.setAccountno(16);
		s1.setBalance(14);
		ss.save(s1);
		ss.beginTransaction().commit();
		ssf.close();
	}

	@Override
	public void DisplayAllDetails() {
		// TODO Auto-generated method stub
	
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
		
		Query q=ss.createQuery("from sbi");
		
		List<sbi> li=q.getResultList();
		for (sbi s : li) {
			System.out.println(s.getBalance());
			System.out.println(s.getBname());
			System.out.println(s.getAccountholder());
			System.out.println(s.getAccountno());
			System.out.println(s.getBranch());
		}
		ss.beginTransaction().commit();
		ssf.close();
		
		
	}

	public void DepositeMoney() {
		// TODO Auto-generated method stub
		
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no");
		int a=sc.nextInt();
		sbi u=ss.get(sbi.class, a);
		int o=u.getBalance();
		System.out.println(u);
		System.out.println("Enter Your Deposite");
		int de=sc.nextInt();
		
		int newbal=o+de;
		
		Query q=ss.createQuery("from sbi where Accountno=:x");
		Query sp=q.setParameter("x",a);
		List<sbi> li=sp.getResultList();
		u.setBalance(newbal);
		for (sbi s : li) {
			System.out.println(s.getBalance());
		}
		ss.beginTransaction().commit();
		ssf.close();
		
		
	}

	public void MoneyCheck() {
		// TODO Auto-generated method stub
		
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no");
		int a=sc.nextInt();
		sbi u=ss.get(sbi.class, a);
		int o=u.getBalance();
		System.out.println(u);
		System.out.println("Enter Your Withdraw");
		int de=sc.nextInt();
		
		int newbal=o-de;
		
		Query q=ss.createQuery("from sbi where Accountno=:x");
		Query sp=q.setParameter("x",a);
		List<sbi> li=sp.getResultList();
		u.setBalance(newbal);
		for (sbi s : li) {
			System.out.println(s.getBalance());
		}
		ss.beginTransaction().commit();
		ssf.close();
		
	}

	public void BalanceCheck() {
		// TODO Auto-generated method stub
		
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
		
		Query q=ss.createQuery("from sbi where Accountno=:x");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account number");
		int a=sc.nextInt();
		Query sp=q.setParameter("x",a);
		List<sbi> li=sp.getResultList();
		
		
		for (sbi s : li) {
			System.out.println(s.getBalance());
		}
		ss.beginTransaction().commit();
		ssf.close();
		
	}
	public void moneyTransfer() {
		SessionFactory ssf=config.getSession();
		Session ss=ssf.openSession();
		
	}
	
	
}
