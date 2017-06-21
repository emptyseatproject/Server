package com.dongguk.bus;

public class AvailableRoute {
	private int routeId;
	private String routeName;
	
	public AvailableRoute(int routeId, String routeName) {
		super();
		this.routeId = routeId;
		this.routeName = routeName;
	}
	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
	public String toString()
	{
		String str = "";
		str += routeId;
		str += routeName;
		return str;
	}
}
