package com.parimal.beans;

public class PaymentProcessing
{

	private IPay cardPayment;

	public PaymentProcessing()
	{
		// TODO Auto-generated constructor stub
	}

	public PaymentProcessing(IPay cardPayment)
	{
		this.cardPayment = cardPayment;
	}

	public void setcatdPayment(IPay cardPayment)
	{
		this.cardPayment = cardPayment;
	}

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
