package cn.dillon.weather.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class WeatherClient {
	
	public static void main(String[] args) {
		WeatherWebService service = new WeatherWebService();
		WeatherWebServiceSoap serviceSoap =service.getWeatherWebServiceSoap();
		ArrayOfString arrayOfString = serviceSoap.getWeatherbyCityName("北京");
		List<String> list = arrayOfString.getString();
		for (String s : list) {
			System.out.println(s);
		}
	}

}
