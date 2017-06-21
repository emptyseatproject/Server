package com.dongguk.bus;

import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@RequestMapping("/GetAvailableBusList.do")
	@ResponseBody
	public AvailableRoute[] getAvailableBusList()
	{
		return AvailableRouteDataController.getInstance().routeList;
	}
	
	@RequestMapping("/GetBusStopList.do")
	@ResponseBody
	public Bus[] getBusStopList
	(){
		String busRoute = "ALL";
		String upperCase = busRoute.toUpperCase();
		if(busRoute.equals("ALL"))
			return BusStopDataController.getInstance().busList;
		
		boolean matchingFlag = false;
		for(AvailableRoute routeElement : AvailableRouteDataController.getInstance().routeList)
		{
			if(routeElement.getRouteName().equals(upperCase))
			{
				matchingFlag = true;
				break;
			}
		}
		if(matchingFlag == false)
			return null;
		
		Vector<Bus> busList = new Vector<Bus>();
		for(Bus bus : BusStopDataController.getInstance().busList)
		{
			if(bus.getRoute().equals(upperCase))
				busList.add(bus);
		}
		Bus[] array = busList.toArray(new Bus[busList.size()]);
		
		return array;
		
	}
	
}