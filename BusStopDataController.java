package com.dongguk.bus;

public class BusStopDataController {
	private static BusStopDataController instance = null;
	public Bus[] busList;
	public String[] busStopsStr;
	private BusStopDataController()
	{
		 
	}
	
	public static BusStopDataController getInstance () {
		if(instance == null)
			instance = new BusStopDataController();
		return instance;
	}
}
