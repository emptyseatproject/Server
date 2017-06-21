package com.dongguk.bus;

public class BusStop {
	private String busStop;
	private String expectedEmptySeat;
	
	public BusStop(
			String busStop
			,String expectedEmptySeat)
	{
		super();
		this.busStop = busStop;
		this.expectedEmptySeat = expectedEmptySeat;
	}
	
	public String getBusStop()
	{
		return busStop;
	}
	
	public String getExpectedEmptySeat()
	{
		return expectedEmptySeat;
	}
}
