package com.parimal.beans;

public class AmexPayment {

	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill using Amex card ACP"+billAmount);
		return true;
	}
}
