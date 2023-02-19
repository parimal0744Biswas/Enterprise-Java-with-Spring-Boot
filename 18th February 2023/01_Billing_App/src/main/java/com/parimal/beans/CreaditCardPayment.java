package com.parimal.beans;

public class CreaditCardPayment implements IPay
{

	public boolean payTheBill(Double billAmount)
	{
		System.out.println("Paying Bill using creadit card CCP" + billAmount);
		return true;
	}
}
