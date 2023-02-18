package com.parimal.main;

import com.parimal.beans.PaymentProcessing;

public class Main
{
	public static void main(String[] args)
	{
		PaymentProcessing pp = new PaymentProcessing();
		boolean ststus = pp.doPayment("Debit", 100.00);

		if (ststus)
		{
			System.out.println("Payment Success");
		}
		else
		{
			System.out.println("Failed in Payment");
		}
	}

}
