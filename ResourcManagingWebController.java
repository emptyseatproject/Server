package com.dongguk.bus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourcManagingWebController {
	@RequestMapping("/GetSupportedVer.do")
	@ResponseBody
	public String getAvailableBusList()
	{
		return ResourceManager.getInstance().version;
	}
	
	@RequestMapping("/IsSupportedVer.do")
	@ResponseBody
	public Boolean isSupportedVer
	(@RequestParam(value="clientResourceVer", defaultValue="") String clientResourceVer)
	{
		if(ResourceManager.getInstance().version.equals(clientResourceVer))
			return true;
		
		return false;
	}
	
	@RequestMapping("/IsValidatedAvailableBusResourceHash.do")
	@ResponseBody
	public String isValidatedAvailableBusResourceHash
	(@RequestParam(value="clientAvailableBusResourceHash", defaultValue="") String clientAvailableBusResourceHash)
	{
		if(clientAvailableBusResourceHash.equals(ResourceManager.getInstance().availableBusHashVal))
			return "OK";
		return ResourceManager.getInstance().availableBusHashVal;
	}
	
	@RequestMapping("/IsValidatedBusStopResourceHash.do")
	@ResponseBody
	public String isValidatedBusStopResourceHash
	(@RequestParam(value="clientBusStopResourceHash", defaultValue="") String clientBusStopResourceHash)
	{
		if(clientBusStopResourceHash.equals(ResourceManager.getInstance().busStopHashVal))
			return "OK";
		return ResourceManager.getInstance().busStopHashVal;
	}
}