package com.mt;

class Producer extends Thread
{
	// Producer Producing the date in StringBuilder
	StringBuilder sb;

	// variable used by thread for communication
	boolean dataProvider = false;

	public Producer()
	{
		// String Builder Object is created default value is 16
		sb = new StringBuilder();
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				sb.append(i + " : ");
				Thread.sleep(1000);
				System.out.println("Appending.............");

			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			// informing the consumer that data is produced
		}
		dataProvider = true;
	}
}

class Consumer extends Thread
{
	// creating producer object to get the producer data from string builder
	Producer producer;

	public Consumer(Producer producer)
	{
		this.producer = producer;
	}

	@Override
	public void run()
	{

		while (producer.dataProvider == false)
		{
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		// Consume the data produced by the producer
		System.out.println("Consuming.... " + producer.sb);

	}
}

public class Communication
{
	public static void main(String[] args)
	{
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		producer.start();
		consumer.start();
		// System.out.println("oooooo");

	}

}
