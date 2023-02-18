package com.parimal.main;

import com.parimal.beans.PaymentProcessing;

public class Main
{
	public static void main(String[] args)
	{
		PaymentProcessing pp = new PaymentProcessing();
		pp.doPayment("Creadit", 100.00);
	}

}
