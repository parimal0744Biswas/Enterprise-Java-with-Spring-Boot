package com.parimal.beans;

public class PaymentProcessing extends CreaditCardPayment
{
	public boolean doPayment(String cardType, Double billAmount)
	{

		if ("Creadit".equals(cardType))
		{

		}
		else if (cardType.equals("Debit"))
		{

		}
		else if (cardType.equals("Amex"))
		{

		}

		return false;
	}

}
