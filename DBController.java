package com.dongguk.bus;

import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DBController {
	
	@RequestMapping("/GetPredict.do")
	@ResponseBody
	public Predict[] getPredict(
			@RequestParam(value="busRoute", defaultValue="") String busRoute){
		PredictDAO predictDAO = new PredictDAO();
		Vector<Predict> predicts = new Vector<Predict>();
		
		for(Predict predictElement : predictDAO.selectPredict(busRoute))
		{
			predicts.add(predictElement);
		}
		
		Predict[] array = predicts.toArray(new Predict[predicts.size()]);
		return array;
	}
	
	@RequestMapping("/GetRealtimeStation.do")
	@ResponseBody
	public RealtimeStation[] getRealtimeStation(
			@RequestParam(value="busRoute", defaultValue="") String busRoute){
		PredictDAO predictDAO = new PredictDAO();
		Vector<RealtimeStation> list = new Vector<RealtimeStation>();
		
		for(RealtimeStation element : predictDAO.selectRealtimeStation(busRoute))
		{
			list.add(element);
		}
		
		RealtimeStation[] array = list.toArray(new RealtimeStation[list.size()]);
		return array;
	}
	
	@RequestMapping("/GetRealtimeBusList.do")
	@ResponseBody
	public RealtimeBusList[] getRealtimeBusList(
			@RequestParam(value="busRoute", defaultValue="") String busRoute){
		PredictDAO predictDAO = new PredictDAO();
		Vector<RealtimeBusList> list = new Vector<RealtimeBusList>();
		
		for(RealtimeBusList element : predictDAO.selectRealtimeBusList(busRoute))
		{
			list.add(element);
		}
		
		RealtimeBusList[] array = list.toArray(new RealtimeBusList[list.size()]);
		return array;
	}
}
