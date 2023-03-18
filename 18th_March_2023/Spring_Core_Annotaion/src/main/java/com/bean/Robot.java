package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Robot
{

	private Integer id = 123;
	private String name;
	private String lab;
	private Double price;

}
