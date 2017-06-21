package com.dongguk.bus;

public class CurrentBus {
	private String num;
	private String busNum;
	private String nextStop;
	private String arrivalTime;
	private String emptySeat;
	private String expectedEmptySeat;
	
	public CurrentBus(
			String num
			,String busNum
			,String nextStop
			,String arrivalTime
			,String emptySeat
			,String expectedEmptySeat)
	{
		super();
		this.num = num;
		this.busNum = busNum;
		this.nextStop = nextStop;
		this.arrivalTime = arrivalTime;
		this.emptySeat = emptySeat;
		this.expectedEmptySeat = expectedEmptySeat;
	}
	
	public String getNum()
	{
		return num;
	}
	
	public String getBusNum()
	{
		return busNum;
	}
	
	public String getNextStop()
	{
		return nextStop;
	}
	
	public String getArrivalTime()
	{
		return arrivalTime;
	}
	
	public String getEmptySeat()
	{
		return emptySeat;
	}
	
	public String getExpectedEmptySeat()
	{
		return expectedEmptySeat;
	}
}
