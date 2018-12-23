package com.adx.qa.tests;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups={"car"})
	public void car1()
	{
		System.out.println(" This is Car group test1");
	}
	
	@Test(groups={"car"})
	public void car2()
	{
		System.out.println(" This is Car group test2");
	}
	
	@Test(groups={"bus"})
	public void bus()
	{
		System.out.println(" This is bus group test1");
	}
	
	@Test(groups={"bus","car"})
	public void bus_and_car()
	{
		System.out.println("bus and car both groups");
	}	
	
}