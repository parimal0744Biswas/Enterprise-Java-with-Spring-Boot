package com.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
public class WishMessageGenerator
{

	@Autowired
	private LocalDateTime dateTime;

	static
	{
		System.out.println("Wish mmessag.class file will loading");
	}

	public WishMessageGenerator()
	{
		System.out.println("zero args constractor loading");
	}

	public String genartateWishMessage(String user)
	{
		int hour = dateTime.getHour();
		if (hour < 12)
		{
			return "Good MOrnhng " + user;
		}

		if (hour < 12)
		{
			return "Good MOrnhng " + user;
		}

		if (hour < 12)
		{
			return "Good MOrnhng " + user;
		}

		if (hour < 12)
		{
			return "Good MOrnhng " + user;
		}

		if (hour < 12)
		{
			return "Good MOrnhng " + user;
		}

		else
		{
			return "Good MOrnhng " + user;
		}

	}

}
