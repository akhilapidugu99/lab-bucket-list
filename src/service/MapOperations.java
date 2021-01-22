package service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations{
	
	HashMap<String, TouristPlace> hmap = new HashMap<String, TouristPlace>(); 
	public Map add(TouristPlace places) {
		hmap.put(places.getName(), places);
		return hmap;
		
	}
	public Map sortRandomly(TouristPlace places) {
		return add(places);
		
	}
	public Map sortInEntryOrder(HashMap places) {
		return places;
		
	}
	public Map sortAlphabetically(HashMap places) {
		TreeMap<String,TouristPlace> sortedplaces=new TreeMap<String,TouristPlace>(places);
        return sortedplaces;
		
	}
	public Object reset(HashMap places) {
		places.clear();
		return places;
		
	}
	public Map remove(TouristPlace places) {
		
		hmap.remove(places.getName());
		return  hmap;
		
	}
}