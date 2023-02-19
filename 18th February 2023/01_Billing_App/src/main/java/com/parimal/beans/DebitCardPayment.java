package com.parimal.beans;

public class DebitCardPayment implements IPay
{

	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill using debit card DCP" + billAmount);
		return true;
	}
}
