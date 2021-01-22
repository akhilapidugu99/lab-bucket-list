package service;

import java.util.*;
import java.util.ArrayList;

import model.TouristPlace;

public class ListOperations{
	
	List<TouristPlace> l=new ArrayList<TouristPlace>();
	
	public List add(TouristPlace places) {
		l.add(places);
		
		return l;
		
	}
	public List remove(TouristPlace places) {
		l.remove(places);
		return l;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getDestination().compareTo(place2.getDestination()));
		return places;
	}
	public Object sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(TouristPlace place1,TouristPlace place2) -> place1.getDestination().compareTo(place2.getDestination()));
		return places;
	}
	public Object reset(List places) {
		Collections.sort(places,Comparator.naturalOrder());
		return places;
	}
	
		
	
}