package com.dongguk.bus;

public class AvailableRouteDataController {
	private static AvailableRouteDataController instance = null;
	public AvailableRoute[] routeList;
	private AvailableRouteDataController()
	{
	}

	public static AvailableRouteDataController getInstance () {
		if(instance == null)
			instance = new AvailableRouteDataController();
		return instance;
	}
}
