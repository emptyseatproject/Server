package com.dongguk.bus;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ResourceManager {
	private static ResourceManager instance = null;
	public String version;
	public String availableBusHashVal;
	public String busStopHashVal;
	private ResourceManager()
	{
		availableBusHashVal = getSHA256(AvailableRouteDataController.getInstance().toString());
		busStopHashVal = getSHA256(BusStopDataController.getInstance().toString());
	}
	
	public String getSHA256(String str){
		String SHA = ""; 
		try{
			MessageDigest sh = MessageDigest.getInstance("SHA-256"); 
			sh.update(str.getBytes());
			byte byteData[] = sh.digest();
			StringBuffer sb = new StringBuffer(); 
			for(int i = 0 ; i < byteData.length ; i++){
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
			}
			SHA = sb.toString();
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace(); 
			SHA = null; 
		}
		return SHA;
	}

	public static ResourceManager getInstance () {
		if(instance == null)
			instance = new ResourceManager();
		return instance;
	}
}