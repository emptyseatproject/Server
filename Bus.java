package com.dongguk.bus;

public class Bus {
	private int busStopId;
	private boolean isPassable;
	private int busStopIndex;
	private String routeName;
	private String busStopName;
	private boolean isPredictable;

	public Bus(int busStopId,
			boolean isPassable,
			int busStopIndex,
			String route,
			String busStopName,
			boolean isPredictable)
	{
		super();
		this.busStopId = busStopId;
		this.isPassable = isPassable;
		this.busStopIndex = busStopIndex;
		this.routeName = route;
		this.busStopName = busStopName;
		this.isPredictable = isPredictable;
	}

	public int getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(int busStopId) {
		this.busStopId = busStopId;
	}

	public boolean isPassable() {
		return isPassable;
	}

	public void setPassable(boolean isPassable) {
		this.isPassable = isPassable;
	}

	public int getBusStopIndex() {
		return busStopIndex;
	}

	public void setBusStopIndex(int busStopIndex) {
		this.busStopIndex = busStopIndex;
	}

	public String getRoute() {
		return routeName;
	}

	public void setRoute(String route) {
		this.routeName = route;
	}

	public String getBusStopName() {
		return busStopName;
	}

	public void setBusStopName(String busStopName) {
		this.busStopName = busStopName;
	}

	public boolean isPredictable() {
		return isPredictable;
	}

	public void setPredictable(boolean isPredictable) {
		this.isPredictable = isPredictable;
	}
	
	public String toString()
	{
		String str = "";
		str += busStopId;
		str += isPassable;
		str += busStopIndex;
		str += routeName;
		str += busStopName;
		str += isPredictable;
		return str;
	}
}
