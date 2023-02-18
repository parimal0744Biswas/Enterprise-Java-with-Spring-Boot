package com.parimal.beans;

public class PaymentProcessing
{
	public boolean doPayment(String cardType, Double billAmount)
	{

		if ("Creadit".equals(cardType))
		{
			CreaditCardPayment cardPayment1 = new CreaditCardPayment();
			return cardPayment1.payTheBill(billAmount);
		}
		else if (cardType.equals("Debit"))
		{
			DebitCardPayment cardPayment2 = new DebitCardPayment();
			return cardPayment2.payTheBill(billAmount);
		}
		else if (cardType.equals("Amex"))
		{
			AmexPayment cardPayment3 = new AmexPayment();
			return cardPayment3.payTheBill(billAmount);
		}

		return false;
	}

}
